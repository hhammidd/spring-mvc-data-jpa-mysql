package ir.shaabani.service;

import ir.shaabani.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(long id);
    public List<User> findByFirstName(String firstName);
}
