package guru.springframework.spring5recipeapp.repository;

import guru.springframework.spring5recipeapp.domain.Category;

import org.springframework.data.repository.CrudRepository;

/**
 * @author ytsarkov (yurait6@gmail.com) on 20.07.2023
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
