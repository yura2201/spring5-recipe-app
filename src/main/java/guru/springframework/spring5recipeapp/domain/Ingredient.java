package guru.springframework.spring5recipeapp.domain;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ytsarkov (yurait6@gmail.com) on 18.07.2023
 */
@Entity
@Getter
@Setter
public class Ingredient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private BigDecimal amount;

  @ManyToOne
  private Recipe recipe;
}
