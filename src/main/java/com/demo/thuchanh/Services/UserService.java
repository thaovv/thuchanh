package com.demo.thuchanh.Services;

import com.demo.thuchanh.Dto.UserDTO;
import com.demo.thuchanh.Etities.User;
import com.demo.thuchanh.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    //Kiểm tra Đăng kí
    public User signUp(UserDTO userDTO) {

            return null;

    }
    //Kiểm tra đăng nhập
    public User signIn(UserDTO userDTO){
        return null;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
        user.setPhone(userDetails.getPhone());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        return userRepository.save(user);

    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
