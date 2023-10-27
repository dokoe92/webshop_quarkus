package at.dokoe.quarkus.mapper;

import at.dokoe.quarkus.dto.UserDetailsDto;
import at.dokoe.quarkus.model.User;

public class UserDetailsMapper
{

    public static UserDetailsDto toDto(User user) {
        if (user == null) return null;

        UserDetailsDto userDetailsDto = new UserDetailsDto();
        userDetailsDto.setUserId(user.id);
        userDetailsDto.setShoppingCartDto(ShoppingCartMapper.toDTO(user.getShoppingCart()));

        return userDetailsDto;
    }
}
