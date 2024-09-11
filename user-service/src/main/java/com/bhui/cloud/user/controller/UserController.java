package com.bhui.cloud.user.controller;

import com.bhui.cloud.user.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{userId}/orders")
    public List<String> getUserOrders(@PathVariable String userId) {
        return userService.getUserOrders(userId);
    }
}
