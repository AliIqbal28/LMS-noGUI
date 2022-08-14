package com.ALI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Registration {
    private LocalDate start_date;
    private LocalDate end_date;
//    private int year;
//    private int month;
//    private int dayOfMonth;

    public Registration() {

        start_date=null;
        end_date=null;


    }

    public void setStart_date(int year,int month,int dayOfMonth) {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        start_date = LocalDate.of(year, month, dayOfMonth);
    }

    public void setEnd_date(int year,int month,int dayOfMonth) {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        end_date = LocalDate.of(year, month, dayOfMonth);
    }




    boolean reg_period()
    {

        if((start_date.isBefore(LocalDate.now()) || start_date.isEqual(LocalDate.now()))&&(end_date.isAfter(LocalDate.now()) || end_date.isEqual(LocalDate.now())))
            return true;
        else
            return false;


    }

    public LocalDate getEnd_date() {
        return end_date;
    }
}
