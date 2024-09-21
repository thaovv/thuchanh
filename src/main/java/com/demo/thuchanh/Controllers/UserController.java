package com.demo.thuchanh.Controllers;

import com.demo.thuchanh.Dto.ResponseObject;
import com.demo.thuchanh.Etities.User;
import com.demo.thuchanh.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        new ResponseObject(200, "OK",
                                userService.getAllUsers()));
    }
    //Nhận người dùng theo id
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseObject(200, "OK",
                        userService.getUserById(id)
                                .map(ResponseEntity::ok)
                                .orElse(ResponseEntity.notFound().build())));

    }
    //Tạo mới người dùng
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        new ResponseObject(200, "OK",
                                userService.createUser(user)));
    }

    //Cập nhật người dùng
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        new ResponseObject(200, "OK",
                                userService.updateUser(id, userDetails)));
    }

    //Xóa người dùng
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}

