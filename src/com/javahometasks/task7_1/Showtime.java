package com.javahometasks.task7_1;

import java.util.HashSet;
import java.util.Set;

public class Showtime {
    private String movieTitle;
    private Set<Seat> freeSeats;

    public Showtime(String movieTitle, int rows, int seats) {
        this.movieTitle = movieTitle;
        this.freeSeats = new HashSet<>();

        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < seats + 1; j++) freeSeats.add(new Seat(i, j));
        }
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public Set<Seat> getFreeSeats() {
        return freeSeats;
    }

    public boolean bookSeat(Seat seatToBook) {
        return freeSeats.remove(seatToBook);
    }

    @Override
    public String toString() {
        return "Showtime{" +
                "movieTitle='" + movieTitle + '\'' +
                ", freeSeats=" + freeSeats +
                '}';
    }
}
