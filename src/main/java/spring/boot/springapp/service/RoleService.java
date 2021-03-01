package spring.boot.springapp.service;

import java.util.Optional;
import spring.boot.springapp.model.Role;

public interface RoleService {
    Role save(Role role);

    Optional<Role> getByName(String name);
}
