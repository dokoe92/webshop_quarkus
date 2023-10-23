package at.dokoe.quarkus.service;

import at.dokoe.quarkus.model.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UserService {

    @Transactional
    public User createNewUser(String username, String password) {
        User user = new User(username, password);
        if (User.find("username", username).firstResult() == null) {
            user.persist();
            user.getShoppingCart().persist();
            return user;
        } else {
            return null;
        }
    }
}
