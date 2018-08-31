package ir.shaabani.controller;

import ir.shaabani.model.User;
import ir.shaabani.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findOne(@PathVariable long id) {
        return userService.findById(id);
    }
}
