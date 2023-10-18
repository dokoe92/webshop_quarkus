package at.dokoe.quarkus.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("shoe")
public class Shoe extends Item{
    Integer size;
}
