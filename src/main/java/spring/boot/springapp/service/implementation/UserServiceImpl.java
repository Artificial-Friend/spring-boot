package spring.boot.springapp.service.implementation;

import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.boot.springapp.model.User;
import spring.boot.springapp.repository.UserRepository;
import spring.boot.springapp.service.UserService;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        user.setUserId(userRepository.count() + 1);
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> get(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> getUserByPhoneNumber(int number) {
        return userRepository.getUserByPhoneNumber(number);
    }
}
