package com.javahometasks.task7_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SeatBooker implements Runnable {
    private static final Object lock = new Object();
    private String booker;
    private Showtime showtime;
    private Set<Seat> seatsToBook;

    public SeatBooker(String booker, Showtime showtime, Seat[] seatsToBook) {
        this.booker = booker;
        this.showtime = showtime;
        this.seatsToBook = new HashSet<>(Arrays.asList(seatsToBook));
    }

    @Override
    public void run() {
        for (Seat seatToBook: seatsToBook) {
            synchronized (lock) {
                if (showtime.getFreeSeats().contains(seatToBook)) {
                    if (showtime.bookSeat(seatToBook))
                        System.out.println(booker + " has booked " + seatToBook + " seat on title: " + showtime.getMovieTitle() + ".");
                }
                else System.out.println(booker + " has failed to book " + seatToBook + " seat on title: " + showtime.getMovieTitle() + ".");
            }
        }
    }
}
