package at.fhhgb.mc.fhtours.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.util.UUID;

@Entity(name = "TRIP")
@Data
public class Trip {
    @Id
    @GeneratedValue
    private UUID id;
    private Date date;

    private UUID driver;
    private UUID bus;
    private UUID destination;

    public UUID getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UUID getDriver() {
        return driver;
    }

    public void setDriver(UUID driver) {
        this.driver = driver;
    }

    public UUID getBus() {
        return bus;
    }

    public void setBus(UUID bus) {
        this.bus = bus;
    }

    public UUID getDestination() {
        return destination;
    }

    public void setDestination(UUID destination) {
        this.destination = destination;
    }
}
