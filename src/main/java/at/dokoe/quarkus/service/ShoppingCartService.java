package at.dokoe.quarkus.service;

import at.dokoe.quarkus.dto.ShoppingCartDto;
import at.dokoe.quarkus.mapper.ShoppingCartMapper;
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
    public ShoppingCartDto addToShoppingCart(Integer itemId, Integer userId) {
        User user = User.findById(userId);
        Item item = Item.findById(itemId);
        if (user != null && item != null) {
            user.getShoppingCart().getItems().add(item);
            item.setShoppingCart(user.getShoppingCart());
            user.getShoppingCart().persist();
            return ShoppingCartMapper.toDTO(user.getShoppingCart());
        }
        return null;
    }

    @Transactional
    public ShoppingCartDto clearShoppingCart(Integer userId){
        User user = User.findById(userId);
        if (user != null) {
            user.getShoppingCart().getItems().forEach(item -> item.setShoppingCart(null));
            user.getShoppingCart().getItems().clear();
        }

        return ShoppingCartMapper.toDTO(user.getShoppingCart());
    }




}
