package at.dokoe.quarkus.dto;

public class UserDetailsDto
{
    private Long userId;
    private String username;
    private ShoppingCartDto shoppingCartDto;

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public ShoppingCartDto getShoppingCartDto()
    {
        return shoppingCartDto;
    }

    public void setShoppingCartDto(ShoppingCartDto shoppingCartDto)
    {
        this.shoppingCartDto = shoppingCartDto;
    }
}
