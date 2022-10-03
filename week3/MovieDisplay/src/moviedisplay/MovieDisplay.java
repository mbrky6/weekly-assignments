package moviedisplay;


public class MovieDisplay {

    // Movies for display
    public static void main(String[] args) {
        Movie nineteenSeventeen = new Movie("1917", 2019, "R", "War Drama", 8.2, 384900.0, false);
        Movie simpsonsMovie = new Movie("The Simpsons Movie", 2007, "PG-13", "Comedy", 7.3, 536400.0, true);
        Movie zyzzyxRoad = new Movie("Zyzzyx Road", 2006, "NR", "Thriller", 3.2, 0.03, false);
        TVMovie theDayAfter = new TVMovie("The Day After", 1983, "N/A", "TV-PG", "Drama", 7.0, 100000.0, false, false);
        TVMovie StevenUniverseMovie = new TVMovie("Steven Universe: The Movie", 2019, "Steven Universe", "TV-PG", "Adventure", 7.7, 1570, true, true);
        Documentary Faherenheit911 = new Documentary("Fahrenheit 9/11", 2004, "R", "United States government and media", 7.5, 222400.0);
        
        // Display the String versions of the movies
        System.out.println(nineteenSeventeen.toString());
        System.out.println(simpsonsMovie.toString());
        System.out.println(zyzzyxRoad.toString()); // Yes, this movie really only made $30 at the box office.
        System.out.println(theDayAfter.toString());
        System.out.println(StevenUniverseMovie.toString());
        System.out.println(Faherenheit911.toString());
    } // + void main
    
} // + class MovieDisplay
