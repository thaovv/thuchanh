package com.demo.thuchanh.Controllers;

import com.demo.thuchanh.Etities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setEmail("admin@thuchanh.com");
        user.setPassword("admin");
        user.setActive(true);
        user.setPhone("+84343055419");

        return user;
    }

}
