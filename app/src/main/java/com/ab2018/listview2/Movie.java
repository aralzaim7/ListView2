package com.ab2018.listview2;

/**
 * Created by metuncc on 1/28/18.
 */

public class Movie {

    int id;
    String name;
    String overView;
    String language;
    int imageCode;
    double voteAverage;


    public Movie(int id, String name, String overView, String language, int imageCode, double voteAverage) {
        this.id = id;
        this.name = name;
        this.overView = overView;
        this.language = language;
        this.imageCode = imageCode;
        this.voteAverage = voteAverage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOverView() {
        return overView;
    }

    public String getLanguage() {
        return language;
    }

    public int getImageCode() {
        return imageCode;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

}
