package ru.kpfu.itis.entities;

import java.util.Date;

public class Student extends Human {
    protected final Group GROUP;
    protected int points;

    public Student(String name, boolean gender, Date birthdate, Group gr) {
        this(name, gender, birthdate, gr, 0);
    }

    public Student(String name, boolean gender, Date birthdate, Group gr, int points) {
        super(name, gender, birthdate);

        this.name = "Student " + this.name;
        this.GROUP = gr;
        setPoints(points);
    }

    public Group getGROUP() {
        return GROUP;
    }

    public void setPoints(int points){
        if(points >= 0) {
            this.points = points/2;
        }
    }
    public int getPoints(){
        return this.points;
    }

    public void sharePoints(Student st, int points){
        this.points += points;
        //st.setPoints(st.getPoints() - points);
        st.points -= points;
    }
}
