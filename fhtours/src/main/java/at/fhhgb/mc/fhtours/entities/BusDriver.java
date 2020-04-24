package at.fhhgb.mc.fhtours.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "BUSDRIVER")
@Data
public class BusDriver {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
