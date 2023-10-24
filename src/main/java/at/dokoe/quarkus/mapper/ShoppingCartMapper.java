package at.dokoe.quarkus.mapper;

import at.dokoe.quarkus.dto.ShoppingCartDto;
import at.dokoe.quarkus.model.ShoppingCart;

import java.util.stream.Collectors;

public class ShoppingCartMapper {

    public static ShoppingCartDto toDTO(ShoppingCart shoppingCart) {
        if (shoppingCart == null) return null;

        ShoppingCartDto dto = new ShoppingCartDto();
        dto.setId(shoppingCart.id);
        dto.setItems(shoppingCart.getItems().stream()
                .map(ItemMapper::toDTO)
                .collect(Collectors.toList()));

        return dto;
    }
}