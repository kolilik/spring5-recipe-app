package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

//Creating Data Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
