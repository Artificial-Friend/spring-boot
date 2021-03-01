package spring.boot.springapp.service.implementation;

import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.boot.springapp.model.Role;
import spring.boot.springapp.repository.RoleRepository;
import spring.boot.springapp.service.RoleService;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Optional<Role> getByName(String name) {
        return roleRepository.findByRole(Role.RoleName.valueOf(name));
    }
}
