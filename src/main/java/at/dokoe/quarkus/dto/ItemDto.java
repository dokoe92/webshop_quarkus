package at.dokoe.quarkus.dto;

public class ItemDto {
    private Long id;
    private String name;
    private Double value;
    private String colour;
    private Boolean onStock;
    private String brand;
    private String size;

    public ItemDto() {};

    public ItemDto(Long id, String name, Double value, String colour, Boolean onStock, String brand, String size) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.colour = colour;
        this.onStock = onStock;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Boolean getOnStock() {
        return onStock;
    }

    public void setOnStock(Boolean onStock) {
        this.onStock = onStock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
