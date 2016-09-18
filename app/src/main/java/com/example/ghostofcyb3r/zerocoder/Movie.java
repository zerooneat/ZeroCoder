package com.example.ghostofcyb3r.zerocoder;

/**
 * Created by GhostOfCyb3r on 9/17/2016.
 */
public class Movie {
    //only the method can access this variable
    private String title,genre,year;

    /*construtor use to set value to an object everything first creation need identify and then
    we can set the new or modify it value by method
     */
    public Movie(String title,String genre,String year){
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    //method to set the value to class varaible
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public String getYear(){
        return year;
    }
}
