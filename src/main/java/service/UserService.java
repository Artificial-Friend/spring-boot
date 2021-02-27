package service;

import model.User;

public interface UserService {
    void create(User user);

    void update(User user);

    User get(Long id);

    void remove(Long id);
}
