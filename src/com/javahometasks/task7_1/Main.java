package com.javahometasks.task7_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Showtime onceUponATimeInHollywood = new Showtime("Once Upon a Time in Hollywood", 40, 30);
        Showtime evangelion = new Showtime("Neon Genesis Evangelion", 20, 30);

        SeatBooker Tarantino = new SeatBooker("Quentin Jerome Tarantino", onceUponATimeInHollywood, new Seat[] {
                new Seat(1, 1),
                new Seat(1, 2),
                new Seat(1, 3),
                new Seat(1, 4),
                new Seat(5, 4),
                new Seat(6, 4),
                new Seat(7, 4),
                new Seat(8, 4),
        });

        SeatBooker BradPitt = new SeatBooker("William Bradley Pitt", onceUponATimeInHollywood, new Seat[] {
                new Seat(1, 1),
                new Seat(1, 20),
                new Seat(1, 14),
                new Seat(5, 4),
                new Seat(6, 4),
                new Seat(7, 4),
                new Seat(8, 4),
        });

        SeatBooker HideakiAnno = new SeatBooker("Hideaki Anno" , evangelion, new Seat[] {
                new Seat(20, 30),
                new Seat(15, 20),
                new Seat(10, 10),
                new Seat(5, 5),
        });

        SeatBooker HayaoMiyazaki = new SeatBooker("Hayao Miyazaki" , evangelion, new Seat[] {
                new Seat(20, 30),
                new Seat(15, 20),
                new Seat(15, 10),
                new Seat(5, 5),
        });

        Thread t1 = new Thread(Tarantino);
        Thread t2 = new Thread(BradPitt);
        Thread t3 = new Thread(HideakiAnno);
        Thread t4 = new Thread(HayaoMiyazaki);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}
