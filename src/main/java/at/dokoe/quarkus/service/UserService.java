package at.dokoe.quarkus.service;

import at.dokoe.quarkus.dto.UserDetailsDto;
import at.dokoe.quarkus.mapper.UserDetailsMapper;
import at.dokoe.quarkus.model.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UserService {

    @Transactional
    public UserDetailsDto createNewUser(String username, String password) {
        User user = new User(username, password);
        if (User.find("username", username).firstResult() == null) {
            user.persist();
            user.getShoppingCart().persist();
            return UserDetailsMapper.toDto(user);
        } else {
            return null;
        }
    }

    public UserDetailsDto getUser(Long userId) {
        User user = User.findById(userId);
        return UserDetailsMapper.toDto(user);
    }
}
