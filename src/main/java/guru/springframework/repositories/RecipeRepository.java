package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RecipeRepository  extends PagingAndSortingRepository<Recipe, Long> {
}
