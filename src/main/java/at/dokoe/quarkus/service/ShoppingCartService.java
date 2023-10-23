package at.dokoe.quarkus.service;

import at.dokoe.quarkus.model.Item;
import at.dokoe.quarkus.model.ShoppingCart;
import at.dokoe.quarkus.model.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;

import java.util.List;

@ApplicationScoped
public class ShoppingCartService {

    @Transactional
    public ShoppingCart addToShoppingCart(Integer itemId, Integer userId) {
        User user = User.findById(userId);
        Item item = Item.findById(itemId);
        if (user != null && item != null) {
            user.getShoppingCart().getItems().add(item);
            user.persist();
            user.getShoppingCart().persist();;
            return user.getShoppingCart();
        }
        return null;
    }


}
