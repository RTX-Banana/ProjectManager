import java.util.*;
import java.io.*;

public class Date {
    private int day;
    private int month;
    private int year;
    private final String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };

    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public Date(Date d) {
        day = d.getDay();
        month = d.getMonth();
        year = d.getYear();
    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getMonthString() {
        return months[month - 1];
    }

    public void printDate() {
        if (day < 10)
            System.out.println("0" + day + " " + getMonthString() + " " + year);
        else
            System.out.println(day + " " + getMonthString() + " " + year);
    }
}
