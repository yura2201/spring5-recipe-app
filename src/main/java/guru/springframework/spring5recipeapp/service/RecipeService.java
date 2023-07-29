package guru.springframework.spring5recipeapp.service;

import guru.springframework.spring5recipeapp.domain.Recipe;
import java.util.Set;

/**
 * @author ytsarkov (yurait6@gmail.com) on 29.07.2023
 */
public interface RecipeService {
  Set<Recipe> getRecipes();
}
