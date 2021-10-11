package ru.kpfu.itis.tasks.task_I;

import java.util.Date;
import java.util.Objects;

public class Video { //сreating a Video class
    protected String name; //video name
    protected Date emergenceDate; //the date of video emergence
    protected int duration; //video duration

    public Video(String name, Date emergenceDate, int duration) { //constructor of Video
        this.name = name;
        this.emergenceDate = emergenceDate;
        this.duration = duration;
    }

    public String getName() { 
        return this.name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public Date getEmergenceDate() { 
        return this.emergenceDate;
    }

    public void setEmergenceDate(Date emergenceDate) { 
        this.emergenceDate = emergenceDate;
    }

    public int getDuration() { 
        return this.duration;
    }

    public void setDuration(int duration) { 
        if (duration > 0) {
            this.duration = duration;
        }
        else {
            System.out.println("Error: video length can only be a positive number.");
        }
    }

    @Override //overriding the Equals method
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass().equals(o.getClass()) ) {
            return false;
        }
        Video video = (Video) o;
        return this.name.equals(video.name) &&
         this.emergenceDate.equals(video.emergenceDate) &&
         this.duration == video.duration;
    }

    @Override //overriding the HashCode method
    public int hashCode() {
        int result = Objects.hash(name, emergenceDate);
        result = 31 * result + Objects.hash(duration);
        return result;
    }

    @Override //overriding the ToString method
    public String toString() {
        return "Video: " + name + " " + emergenceDate + " " + duration;
    }
}
