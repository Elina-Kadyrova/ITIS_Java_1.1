package ru.kpfu.itis.tasks.task_I;

public class Static {
    protected static double ratingA;
    protected static double ratingB;
    protected static boolean awardsA;
    protected static boolean awardsB;
    protected static int seasonsA;
    protected static int seasonsB;

    public static Film compareFilms(Film a, Film b) {
        ratingA = a.getRating();
        ratingB = b.getRating();
        awardsA = a.getFilmAwards();
        awardsB = b.getFilmAwards();
        if (awardsA) {
            if (ratingA < 8.5) {
                ratingA += 1.5;
            }
            else {
                ratingA = 10;
            }
        }
        if (awardsB) {
            if (ratingB < 8.5) {
                ratingB += 1.5;
            }
            else {
                ratingB = 10;
            }
        }
        if (ratingA >= ratingB) {
            return a;
        }
        else {
            return b;
        }
    }

    public static Series compareSeries(Series a, Series b) {
        ratingA = a.getRating();
        ratingB = b.getRating();
        seasonsA = a.getSeasonsNumber();
        seasonsB = b.getSeasonsNumber();
        if ((seasonsA >= 1)&&(seasonsA <= 3)) {
            if (ratingA < 9.5) {
                ratingA += 0.5;
            }
            else {
                ratingA = 10;
            }
        }
        if ((seasonsB >= 1)&&(seasonsB <= 3)) {
            if (ratingB < 9.5) {
                ratingB += 0.5;
            }
            else {
                ratingB = 10;
            }
        }
        if ((seasonsA >= 4)&&(seasonsA <= 6)) {
            if (ratingA < 8.5) {
                ratingA += 1.5;
            }
            else {
                ratingA = 10;
            }
        }
        if ((seasonsB >= 4)&&(seasonsB <= 6)) {
            if (ratingB < 8.5) {
                ratingB += 1.5;
            }
            else {
                ratingB = 10;
            }
        }
        if (seasonsA >= 7) {
            if (ratingA < 9.5) {
                ratingA += 0.5;
            }
            else {
                ratingA = 10;
            }
        }
        if (seasonsB >= 7) {
            if (ratingB < 9.5) {
                ratingB += 0.5;
            }
            else {
                ratingB = 10;
            }
        }
        if (ratingA >= ratingB) {
            return a;
        }
        else {
            return b;
        }
    }
}
