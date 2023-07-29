package guru.springframework.spring5recipeapp.controller;

import guru.springframework.spring5recipeapp.service.RecipeService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 12.11.2022
 */
@Controller
@RequiredArgsConstructor
public class IndexController {

  private final RecipeService recipeService;

  @GetMapping({ "", "/", "/index" })
  public String getIndexPage(Model model) {

    model.addAttribute("recipes", recipeService.getRecipes());
    return "index";
  }
}
