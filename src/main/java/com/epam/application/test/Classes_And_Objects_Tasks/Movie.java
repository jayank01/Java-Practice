package com.epam.application.test.Classes_And_Objects_Tasks;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String movieTitle;
    String director;
    int releaseYear;
    String genre;
    Double averageRating;
    List<Double> review;


    public Movie(String movieTitle, String director, int releaseYear, String genre, Double averageRating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.averageRating = averageRating;
        this.review = new ArrayList<>();
    }

    public void UpdateAverageRating() {
        double s = 0.0;
        for( double r : review ){
            s += r;
        }
        s /= review.size();
        this.averageRating = s;
    }

    public void AddReview( Double r ){
        review.add( r );
        UpdateAverageRating();
    }

    public void getMovieDetails() {
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Genre: " + genre);
        System.out.println("Average Rating: " + averageRating);
    }
}
