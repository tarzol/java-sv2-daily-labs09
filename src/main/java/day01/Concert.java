package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    List<Person> personList = new ArrayList<>();

    public void addPerson(Person person, LocalTime actualTime) {
        if(!actualTime.isBefore(person.getTicket().entryTime())) {
            personList.add(person);

        } else {
            throw new IllegalArgumentException("Beengedési idősávon kívüli belépő!");
        }
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public static void main(String[] args) {
        Concert omegaConcert = new Concert();
        Person person1 = new Person(new Ticket("Omega", LocalDateTime.of(2021, 12, 17, 20, 00), 18_000));
        Person person2 = new Person(new Ticket("Omega", LocalDateTime.of(2021, 12, 17, 20, 00), 18_000));
        Person person3 = new Person(new FrontOfStageTicket("Omega", LocalDateTime.of(2021, 12, 17, 20, 00), 25_000, "asdf"));
        Person person4 = new Person(new FrontOfStageTicket("Omega", LocalDateTime.of(2021, 12, 17, 20, 00), 25_000, "asdf"));

        omegaConcert.addPerson(person1, LocalTime.of(19, 10));
        //omegaConcert.addPerson(person2, LocalTime.of(18, 50));
        omegaConcert.addPerson(person3, LocalTime.of(18, 10));
        //omegaConcert.addPerson(person4, LocalTime.of(17, 50));
        System.out.println("Lista hossza: "+omegaConcert.getPersonList().size());
    }
}
