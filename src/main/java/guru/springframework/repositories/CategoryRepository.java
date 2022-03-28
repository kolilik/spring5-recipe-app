package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

//Creating Data Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
