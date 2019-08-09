package model;
import exceptions.ShowingFullException;
import exceptions.UnderAgeException;

import java.util.LinkedList;
import java.util.List;

public class TicketKiosk {

    private String name;
    private List<Movie> movies;

    // EFFECTS: TicketKiosk with name (name) is created
    public TicketKiosk(String name) {
        this.name = name;
        movies = new LinkedList<>();
    }

    // getters
    public String getName() { return name; }
    public List<Movie> getMovies() { return movies; }

    //EFFECTS:  adds the movie to movies, unless it is already in movies.
    //          if add is successful return true, otherwise return false.
    public boolean addMovie(Movie m) {
        if(!movies.contains(m)){
            movies.add(m);
            return true;
        }
        return false;
    }

    //EFFECTS: calls MovieGoer's buyTicket method, passing m as a parameter.
    public boolean sellTicket(MovieGoer mg, Movie m) {
        try {
            mg.buyTicket(m);
            return true;
        } catch (ShowingFullException e) {
            System.out.println("Sorry there is no more seating");
        } catch (UnderAgeException e) {
            System.out.println("Sorry you are under the age restriction");
        }
        return false;
    }


}
