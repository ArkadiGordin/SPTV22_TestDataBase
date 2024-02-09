package com.example.DatabaseTest.controlers;

import com.example.DatabaseTest.entity.User;
import ch.qos.logback.core.model.Model;
import com.example.DatabaseTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public  UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.getAll());
        return "users/list";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable long id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user/details";
    }
    @GetMapping("/create")
}
