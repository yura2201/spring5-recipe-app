package guru.springframework.spring5recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 12.11.2022
 */
@Controller
public class IndexController {

  @GetMapping({ "", "/", "/index" })
  public String getIndexPage() {
    return "index";
  }
}
