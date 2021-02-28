package spring.boot.springapp.service;

import java.util.Optional;
import spring.boot.springapp.model.User;

public interface UserService {
    void create(User user);

    void update(User user);

    Optional<User> get(Long id);

    void remove(Long id);
}
