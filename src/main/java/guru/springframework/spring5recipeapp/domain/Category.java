package guru.springframework.spring5recipeapp.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ytsarkov (yurait6@gmail.com) on 20.07.2023
 */
@Entity
@Getter
@Setter
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  @ManyToMany(mappedBy = "categories")
  private Set<Recipe> recipes;

}
