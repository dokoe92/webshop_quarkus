package at.dokoe.quarkus.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "category",
    discriminatorType = DiscriminatorType.STRING)
public class Item extends PanacheEntity {

    public String name;

    public Double value;

    @Enumerated(EnumType.STRING)
    public ItemColour colour;

    public Boolean onStock;

    @Enumerated(EnumType.STRING)
    public Brand brand;

    @Enumerated(EnumType.STRING)
    public Size size;



}
