package guru.springframework.spring5recipeapp.controller;

import guru.springframework.spring5recipeapp.domain.Category;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repository.CategoryRepository;
import guru.springframework.spring5recipeapp.repository.UnitOfMeasureRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 12.11.2022
 */
@Controller
@RequiredArgsConstructor
public class IndexController {

  private final CategoryRepository categoryRepository;
  private final UnitOfMeasureRepository unitOfMeasureRepository;

  @GetMapping({ "", "/", "/index" })
  public String getIndexPage() {
    Optional<Category> categoryOpt = categoryRepository.findByDescription("American");
    Optional<UnitOfMeasure> unitOfMeasureOpt = unitOfMeasureRepository.findByDescription("Teaspoon");

    System.out.println("Cat Id is: " + categoryOpt.orElse(new Category()).getId());
    System.out.println("UOM Id is: " + unitOfMeasureOpt.orElse(new UnitOfMeasure()).getId());
    return "index";
  }
}
