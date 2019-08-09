package model;

import exceptions.ShowingFullException;
import exceptions.UnderAgeException;

public class MovieGoer {

    private String name;
    private int age;
    private Ticket ticket;
    private TicketKiosk tk;

    public MovieGoer(String name, int age,  TicketKiosk tk) {
        this.name = name;
        this.age = age;
        this.tk = tk;
        ticket = null;
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public TicketKiosk getTicketKiosk() { return tk; }
    public Ticket getTicket() { return ticket; }

    // MODIFIES: this
    // EFFECTS: a new ticket associated with the given movie is created, and
    //           becomes this MovieGoer's ticket
    // if the movie is full capacity throw a message.
    // this moviegoer must be of appropriate age to watch the movie.
    public boolean buyTicket(Movie m) throws ShowingFullException, UnderAgeException {
        if(m.isFull()){
            throw new ShowingFullException();
        }else if(age < m.getAgeRestriction()) {
            throw new UnderAgeException();
        }else {
            ticket = new Ticket(m);
            m.addViewer();
            return true;
        }
    }
}
