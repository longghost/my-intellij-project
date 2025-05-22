package com.example.library.service.user;

import com.example.library.model.user.User;

public interface IUserService {
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(User user, Long id);
    void deleteUser(Long id);
    User getAuthenticatedUser();
}
