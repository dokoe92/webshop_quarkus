package at.dokoe.quarkus.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.*;

import java.util.Comparator;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "category",
    discriminatorType = DiscriminatorType.STRING)
public class Item extends PanacheEntity  implements Comparable<Item>
{

    private String name;

    private Double value;

    @Enumerated(EnumType.STRING)
    private ItemColour colour;


    private Boolean onStock;

    @Enumerated(EnumType.STRING)
    private Brand brand;

    @Enumerated(EnumType.STRING)
    private Size size;


    @ManyToOne
    @JoinColumn(name="shoppingCart_id")
    @JsonbTransient
    private ShoppingCart shoppingCart;


    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ItemColour getColour() {
        return colour;
    }

    public void setColour(ItemColour colour) {
        this.colour = colour;
    }

    public Boolean getOnStock() {
        return onStock;
    }

    public void setOnStock(Boolean onStock) {
        this.onStock = onStock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    @Override
    public int compareTo(Item o)
    {
        return this.name.compareTo(o.getName());



    }
}
