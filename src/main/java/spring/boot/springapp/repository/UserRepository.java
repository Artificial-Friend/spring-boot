package spring.boot.springapp.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import spring.boot.springapp.model.User;

public interface UserRepository extends MongoRepository<User, Long> {
    Optional<User> getUserByPhoneNumber(int number);
}
