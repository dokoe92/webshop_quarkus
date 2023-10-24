package at.dokoe.quarkus.dto;

import java.util.List;

public class ShoppingCartDto {

    private Long id;
    private List<ItemDto> items;

    public ShoppingCartDto() {};

    public ShoppingCartDto(Long id, List<ItemDto> items) {
        this.id = id;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
    }
}
