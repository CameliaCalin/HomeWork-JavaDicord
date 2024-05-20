package src.Teme;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private List<Integer> ratings;

    // Constructor
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.ratings = new ArrayList<>();
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Method to add a rating
    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        } else {
            System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
        }
    }

    // Method to calculate the average rating
    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }
}
