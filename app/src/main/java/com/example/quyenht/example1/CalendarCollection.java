package com.example.quyenht.example1;

/**
 * Created by QuyenHT on 10/14/2017.
 */
import java.util.ArrayList;

public class CalendarCollection {
    public String date="";
    public String event_message="";

    public static ArrayList<CalendarCollection> date_collection_arr;
    public CalendarCollection(String date,String event_message){

        this.date=date;
        this.event_message=event_message;

    }

}