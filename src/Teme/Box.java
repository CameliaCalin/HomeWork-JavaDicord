package src.Teme;
/*-Create a generic class Box<T> that can store a single item of any type.
Implement methods to set and get the item from the box.
-Design a Movie class with attributes like title, genre, and a list of ratings.
Create a method that retrieve the average rating for any movie.*/

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T item;

    // Method to set the item in the box
    public void setItem(T item) {
        this.item = item;
    }

    // Method to get the item from the box
    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        // Example usage of Box class with Movie
        Box<Movie> movieBox = new Box<>();
        Movie movie = new Movie("Inception", "Sci-Fi");
        movie.addRating(5);
        movie.addRating(4);
        movie.addRating(5);
        movieBox.setItem(movie);

        Movie retrievedMovie = movieBox.getItem();
        System.out.println("Movie: " + retrievedMovie.getTitle());
        System.out.println("Average Rating: " + retrievedMovie.getAverageRating());
    }
}



