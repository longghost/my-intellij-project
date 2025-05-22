package com.example.library.service.user;

import com.example.library.exceptions.ResourceNotFoundException;
import com.example.library.model.user.User;
import com.example.library.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User getAuthenticatedUser() {
        return null;
    }
}
