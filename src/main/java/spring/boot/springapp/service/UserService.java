package spring.boot.springapp.service;

import java.util.Optional;
import spring.boot.springapp.model.User;

public interface UserService {
    User save(User user);

    User update(User user);

    Optional<User> get(Long id);

    void remove(Long id);

    Optional<User> getUserByPhoneNumber(int number);
}
