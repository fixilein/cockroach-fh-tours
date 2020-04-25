package at.fhhgb.mc.fhtours.services;

import at.fhhgb.mc.fhtours.entities.Booking;
import at.fhhgb.mc.fhtours.repositories.BookingRepository;
import org.springframework.stereotype.Service;

//
@Service
public class BookingService {
    //
    private final BookingRepository bookingRepository;

    //
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    //
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }
}