package spring.boot.springapp.repository;

import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import spring.boot.springapp.model.Role;

public interface RoleRepository extends MongoRepository<Role, ObjectId> {
    Optional<Role> findByRole(Role.RoleName roleName);
}
