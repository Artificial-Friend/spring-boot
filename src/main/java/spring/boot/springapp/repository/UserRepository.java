package spring.boot.springapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.boot.springapp.model.User;

public interface UserRepository extends MongoRepository<User, Long> {
}
