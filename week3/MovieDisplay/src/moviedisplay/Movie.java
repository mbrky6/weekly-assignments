package moviedisplay;


public class Movie {
    private String title;
    private int releaseYear;
    private String rating;
    private String genre;
    private double audienceScore;
    private double grossInThousands;
    private boolean animated;
    private int movieCounter = 0;
    
    
    // Constructors
    public Movie() {
        this.movieCounter++;
    } // + Movie

    public Movie(String title, int releaseYear, String rating, String genre, double audienceScore, double gross, boolean animated) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
        this.audienceScore = audienceScore;
        this.grossInThousands = gross;
        this.animated = animated;
    } // + Movie

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    } //  + Movie (Just name and release year)

    public Movie(String title, int releaseYear, String rating, double audienceScore, double grossInThousands) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.audienceScore = audienceScore;
        this.grossInThousands = grossInThousands;
    } // + Movie (for Documentaries)

    public Movie(String title, int releaseYear, String rating, String genre, double audienceScore, boolean animated) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
        this.audienceScore = audienceScore;
        this.animated = animated;
    } // + Movie (for TV movies)
    
    
    // Accessors & Mutators
    public String getTitle() {
        return title;
    } // + String getTitle

    public void setTitle(String title) {
        this.title = title;
    } // + void setTitle

    public int getReleaseYear() {
        return releaseYear;
    } // + int getReleaseYear

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    } // + void setReleaseYear

    public String getRating() {
        return rating;
    } // + String getRating

    public void setRating(String rating) {
        this.rating = rating;
    } // + void setRating

    public String getGenre() {
        return genre;
    } // + String getGenre

    public void setGenre(String genre) {
        this.genre = genre;
    } // + void setGenre

    public double getAudienceScore() {
        return audienceScore;
    } // + int getAudienceScore

    public void setAudienceScore(double audienceScore) {
        this.audienceScore = audienceScore;
    } // + void setAudienceScore

    public double getGrossInThousands() {
        return grossInThousands;
    } // + double getGrossInThousands

    public void setGrossInThousands(double grossInThousands) {
        this.grossInThousands = grossInThousands;
    } // + void setGrossInThousands

    public boolean isAnimated() {
        return animated;
    } // + boolean isAnimated

    public void setAnimated(boolean animated) {
        this.animated = animated;
    } // + void setAnimated

    public int getMovieCounter() {
        return movieCounter;
    } // + int getMovieCounter

    
    // Override the toString() method
    @Override
    public String toString() {
        if (this.isAnimated()) {
            return this.getTitle() + " (" + this.getReleaseYear() + ") is an animated " + this.getRating() + "-rated " + this.getGenre() + " movie with an audience score of " + this.getAudienceScore() + " that grossed $" + String.format("%.2f",(1000 * this.getGrossInThousands())) + '.';
        } // if (this.isAnimated())
        else {
            return this.getTitle() + " (" + this.getReleaseYear() + ") is a live-action " + this.getRating() + "-rated " + this.getGenre() + " movie with an audience score of " + this.getAudienceScore() + " that grossed $" + String.format("%.2f",(1000 * this.getGrossInThousands())) + '.';
        } // else
    } // + String toString
} // + class Movie
