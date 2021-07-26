package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import web.model.User;
import web.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminsController {

    private final UserService userService;

    @Autowired
    public AdminsController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String index(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "admin/index";
    }


//    @GetMapping()
//    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return String.format("Hello %s!", name);
//    }
}
