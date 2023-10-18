package at.dokoe.quarkus.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("pullover")
public class Pullover extends Item {
    boolean withHood;

}
