package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
    User findById(int id);
    void save(User user);
    void delete(int id);
    void update(User user);
}