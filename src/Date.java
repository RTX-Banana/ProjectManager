import java.util.*;
import java.io.*;

public class Date {
    private int day;
    private int month;
    private int year;

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
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "January";
        }
    }

    public void printDate() {
        if (day < 10)
            System.out.println("0" + day + " " + getMonthString() + " " + year);
        else
            System.out.println(day + " " + getMonthString() + " " + year);
    }
}
