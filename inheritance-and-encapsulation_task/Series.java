package ru.kpfu.itis.tasks.task_I;

import java.util.Date;
import java.util.Objects;

public class Series extends Video { //creating class Series inherited from the Video
    protected final People PEOPLE; //field with class People
    protected double rating; //serial rating
    protected int seasonsNumber; //amount of seasons

    public Series(String name, Date emergenceDate, int duration, People people) { //constructor 1 Series
        this(name, emergenceDate, duration, people, 0.0, 0);
    }

    public Series(String name, Date emergenceDate, int duration, People people, double rating, int seasonsNumber) { //constructor 2 Series
        super(name, emergenceDate, duration);
        this.PEOPLE = people;
        this.rating = rating;
        this.seasonsNumber = seasonsNumber;
    }

    public People getPEOPLE() { 
        return this.PEOPLE;
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

    public int getSeasonsNumber() { 
        return this.seasonsNumber;
    }

    public void setSeasonsNumber(int seasonsNumber) { 
        if (seasonsNumber >= 1) {
            this.seasonsNumber = seasonsNumber;
        }
        else {
            System.out.println("Error: seasons number can only be a positive.");
        }
    } 

    @Override //overriding the Equals method
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass().equals(o.getClass())) {
            return false;
        }
        Series series = (Series) o;
        return Objects.equals(this.PEOPLE, series.PEOPLE);
    }

    @Override //overriding the HashCode method
    public int hashCode() {
        int result = Objects.hash(name, emergenceDate, PEOPLE);
        result = 37 * result + Objects.hash(duration);
        return result;
    }

    @Override //overriding the ToString method
    public String toString() {
        return "Serial: " + name + " " + emergenceDate + " " + duration + " " + PEOPLE + " " + rating + " " + seasonsNumber;
    }
}
