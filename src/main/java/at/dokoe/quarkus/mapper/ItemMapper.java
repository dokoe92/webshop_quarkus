package at.dokoe.quarkus.mapper;

import at.dokoe.quarkus.dto.ItemDto;
import at.dokoe.quarkus.model.Item;

public class ItemMapper {

    public static ItemDto toDTO(Item item) {
        if (item == null) return null;

        ItemDto dto = new ItemDto();
        dto.setId(item.id);
        dto.setName(item.getName());
        dto.setValue(item.getValue());
        dto.setColour(item.getColour() != null ? item.getColour().name() : null);
        dto.setOnStock(item.getOnStock());
        dto.setBrand(item.getBrand() != null ? item.getBrand().name() : null);
        dto.setSize(item.getSize() != null ? item.getSize().name() : null);

        return dto;
    }
}
