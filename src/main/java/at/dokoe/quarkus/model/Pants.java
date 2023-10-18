package at.dokoe.quarkus.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@DiscriminatorValue("pants")
public class Pants extends Item {

    public Integer width;
    public Integer length;
    @Enumerated(EnumType.STRING)
    public PantsStyle pantsStyle;
}
