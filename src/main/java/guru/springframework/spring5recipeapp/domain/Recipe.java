package guru.springframework.spring5recipeapp.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
  private Integer prepTime;
  private Integer cookTime;
  private Integer servings;
  private String source;
  private String url;
  @Lob
  private String directions;
  @Lob
  @EqualsAndHashCode.Exclude
  private Byte[] image;
  @Enumerated(value = EnumType.STRING)
  private Difficulty difficulty;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
  @EqualsAndHashCode.Exclude
  private Set<Ingredient> ingredients = new HashSet<>();
  @OneToOne(cascade = CascadeType.ALL)
  @EqualsAndHashCode.Exclude
  private Notes notes;
  @ManyToMany
  @JoinTable(name = "recipe_category",
      joinColumns = @JoinColumn(name = "recipe_id"),
      inverseJoinColumns = @JoinColumn(name = "category_id"))
  private Set<Category> categories = new HashSet<>();

  public Recipe addIngredient(Ingredient ingredient) {
    ingredient.setRecipe(this);
    ingredients.add(ingredient);
    return this;
  }

  public void setNotes(Notes notes) {
    notes.setRecipe(this);
    this.notes = notes;
  }
}
