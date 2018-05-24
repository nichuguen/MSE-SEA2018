package hello;

import io.swagger.model.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//@RepositoryRestResource(collectionResourceRel = "fruits", path = "fruits")

public interface FruitRepository extends CrudRepository<FruitEntity, String> {
}

