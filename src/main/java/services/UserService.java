package services;

import dao.implementation.UserDAO;
import entity.User;

public class UserService {

    UserDAO userDAO = new UserDAO();

    public User authenticateUser( String username, String password ){

        User user = userDAO.getUserByUsername(username);

        if( user == null ){
            return null;
        }

        if( !user.getPassword().equals(password) ) {
            return null;
        }

        return user;
    }

    public User saveOrUpdate(User user) {
        return userDAO.saveOrUpdate(user);
    }
}
