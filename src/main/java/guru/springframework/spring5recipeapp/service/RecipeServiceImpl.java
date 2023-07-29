package guru.springframework.spring5recipeapp.service;

import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.repository.RecipeRepository;
import java.util.HashSet;
import java.util.Set;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

/**
 * @author ytsarkov (yurait6@gmail.com) on 29.07.2023
 */
@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

  private final RecipeRepository recipeRepository;

  @Override
  public Set<Recipe> getRecipes() {
    Set<Recipe> recipeSet = new HashSet<>();
    recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
    return recipeSet;
  }
}
