package pl.boniaszczuk.weekop.service;

import pl.boniaszczuk.weekop.dao.DAOFactory;
import pl.boniaszczuk.weekop.dao.UserDAO;
import pl.boniaszczuk.weekop.model.User;

public class UserService {
    public void addUser(String username, String email, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setActive(true);
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDao = factory.getUserDAO();
        userDao.create(user);
    }
}
