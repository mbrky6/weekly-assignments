package dateclassexercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private Calendar calendar = new GregorianCalendar();
    private long elapsedTime;
    private int year;
    private int month;
    private int day;

    public MyDate() {
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    } // + MyDate

    public MyDate(long elapsedTime) {
        this.elapsedTime = elapsedTime;
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    } // + MyDate

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    } // + MyDate

    public int getYear() {
        return year;
    } // + int getYear

    public int getMonth() {
        return month + 1; // January isn't the 0th month.
    } // + int getMonth

    public int getDay() {
        return day;
    } // + int getDay
    
    public void setDate(long elapsedTime) {
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        
    } // + void setDate

    @Override
    public String toString() {
        return "The date (MDY) is " + this.getMonth() + '/' + this.getDay() + '/' + this.getYear();
    } // + String toString
    
    
} // + class MyDate
