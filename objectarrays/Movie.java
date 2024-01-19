import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }


    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }


    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public static Comparator<Movie> ratingAndProfitComparator = Comparator
            .comparing(Movie::getRating)
            .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget())
            .reversed(); 

    public static Comparator<Movie> yearAndRatingComparator = Comparator
            .comparingInt(Movie::getYearReleased)
            .thenComparingDouble(Movie::getRating);

    public static void main(String[] args) {

        Movie movie1 = new Movie(2020, 8.5, 50.0, 120.0);
        Movie movie2 = new Movie(2010, 7.8, 80.0, 150.0);
        Movie movie3 = new Movie(2015, 9.0, 30.0, 100.0);

        System.out.println("Sorting by Rating and Profit:");
        int result1 = Movie.ratingAndProfitComparator.compare(movie1, movie2);
        int result2 = Movie.ratingAndProfitComparator.compare(movie2, movie3);
        int result3 = Movie.ratingAndProfitComparator.compare(movie1, movie3);

        System.out.println("Comparison Result 1: " + result1);
        System.out.println("Comparison Result 2: " + result2);
        System.out.println("Comparison Result 3: " + result3);

        System.out.println("\nSorting by Year Released and Rating:");
        int result4 = Movie.yearAndRatingComparator.compare(movie1, movie2);
        int result5 = Movie.yearAndRatingComparator.compare(movie2, movie3);
        int result6 = Movie.yearAndRatingComparator.compare(movie1, movie3);

        System.out.println("Comparison Result 4: " + result4);
        System.out.println("Comparison Result 5: " + result5);
        System.out.println("Comparison Result 6: " + result6);
    }
}

