package service.implementation;

import lombok.AllArgsConstructor;
import model.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.UserService;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public User get(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
