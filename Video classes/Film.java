package ru.kpfu.itis.tasks.task_I;

import java.util.Date;
import java.util.Objects;

public class Film extends Video { //creating class Series inherited from the Video class
    protected final People PEOPLE; //field with class People
    protected boolean filmAwards; //availability of film awards
    protected double rating; //film rating

    public Film (String name, Date emergenceDate, int duration, People people) { //constructor 1 Film
        this(name, emergenceDate, duration, people, false, 0.0);
    }

    public Film (String name, Date emergenceDate, int duration, People people, boolean filmAwards, double rating) { //constructor 2 Film
        super(name, emergenceDate, duration);
        this.PEOPLE = people;
        this.filmAwards = filmAwards;
        this.rating = rating;
    }

    public People getPEOPLE() { 
        return this.PEOPLE;
    }

    public boolean getFilmAwards() { 
        return this.filmAwards;
    }

    public void setFilmAwards(boolean filmAwards) { 
        this.filmAwards = filmAwards;
    }

    public double getRating() { 
        return this.rating;
    }

    public void setRating(double rating) { 
        if ((rating > 0.0) && (rating <= 10.0)){
            this.rating = rating;
        }
        else {
            System.out.println("Error: rating can only be a number between 0 and 10.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass().equals(o.getClass()) ) {
            return false;
        }
        Film film = (Film) o;
        return Objects.equals(this.PEOPLE, film.PEOPLE);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, emergenceDate, PEOPLE);
        result = 53 * result + Objects.hash(duration);
        return result;
    }

    @Override
    public String toString() {
        return "Film: " + name + " " + emergenceDate + " " + duration + " " + PEOPLE + " " + (filmAwards?"The film has a film award/film awards":"No film awards") + " " + rating;
    }
}
