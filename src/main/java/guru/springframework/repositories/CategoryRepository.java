package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}