package pl.boniaszczuk.weekop.dao;

import pl.boniaszczuk.weekop.model.User;

import java.util.List;

public interface UserDAO extends GenericDAO<User, Long> {

    List<User> getAll();
    User getUserByUsername(String username);

}
