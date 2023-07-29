package guru.springframework.spring5recipeapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
public class Notes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne
  @EqualsAndHashCode.Exclude
  private Recipe recipe;
  @Lob
  private String recipeNotes;
}
