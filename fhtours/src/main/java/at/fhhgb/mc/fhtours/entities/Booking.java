package at.fhhgb.mc.fhtours.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.util.UUID;

@Entity(name = "BOOKING")
@Data
public class Booking {
    @Id
    @GeneratedValue
    private UUID id;
    private Date bookedDate;
    private Float price;
    private String paymentOption;
    private Date paymentDate;
    private UUID trip;
    private UUID customer;

    public UUID getId() {
        return id;
    }

    public Date getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(Date bookedDate) {
        this.bookedDate = bookedDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public UUID getTrip() {
        return trip;
    }

    public void setTrip(UUID trip) {
        this.trip = trip;
    }

    public UUID getCustomer() {
        return customer;
    }

    public void setCustomer(UUID customer) {
        this.customer = customer;
    }
}
