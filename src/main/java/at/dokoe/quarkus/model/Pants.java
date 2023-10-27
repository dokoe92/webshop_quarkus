package at.dokoe.quarkus.model;

import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@DiscriminatorValue("pants")
public class Pants extends Item {

    private Integer width;
    private Integer length;


    @Enumerated(EnumType.STRING)
    @JsonbTransient
    private PantsStyle pantsStyle;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public PantsStyle getPantsStyle() {
        return pantsStyle;
    }

    public void setPantsStyle(PantsStyle pantsStyle) {
        this.pantsStyle = pantsStyle;
    }
}
