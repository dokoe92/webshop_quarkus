package at.dokoe.quarkus.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("shirt")
public class Shirt extends Item{
}
