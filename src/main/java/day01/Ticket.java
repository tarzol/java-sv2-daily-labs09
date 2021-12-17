package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String bandName;
    private LocalDateTime timeOfConcert;
    private int price;

    public Ticket(String bandName, LocalDateTime timeOfConcert, int price) {
        this.bandName = bandName;
        this.timeOfConcert = timeOfConcert;
        this.price = price;
    }

    public LocalTime entryTime() {
        LocalTime entryTime = timeOfConcert.toLocalTime().minusHours(1);
        return entryTime;
    }
}
