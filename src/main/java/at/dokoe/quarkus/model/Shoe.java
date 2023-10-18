package at.dokoe.quarkus.model;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("shoe")
public class Shoe extends Item{

    @Column(name="shoe_size")
    private Integer shoeSize;

    public Integer getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(Integer shoeSize) {
        this.shoeSize = shoeSize;
    }
}
