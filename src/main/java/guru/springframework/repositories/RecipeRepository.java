package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

//Creating Data Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
