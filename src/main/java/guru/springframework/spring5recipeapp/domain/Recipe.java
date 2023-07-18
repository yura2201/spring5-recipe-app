package guru.springframework.spring5recipeapp.domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ytsarkov (yurait6@gmail.com) on 01.07.2023
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Recipe {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private Integer perpTime;
  private Integer cookTime;
  private Integer servings;
  private String source;
  private String url;
  private String directions;
  @Lob
  private Byte[] image;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
  private Set<Ingredient> ingredients;
  @OneToOne(cascade = CascadeType.ALL)
  private Notes notes;
}
