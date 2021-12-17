package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

    private String extraCode;

    public FrontOfStageTicket(String bandName, LocalDateTime timeOfConcert, int price, String extraCode) {
        super(bandName, timeOfConcert, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return super.entryTime().minusHours(1);
    }
}
