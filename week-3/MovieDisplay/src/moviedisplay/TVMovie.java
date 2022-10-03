package moviedisplay;


public class TVMovie extends Movie{
    private String show;
    private double viewersInThousands;
    private boolean basedOnShow;
    
    // Constructors
    public TVMovie(){
    } // + TVMovie

    public TVMovie(String title, int releaseYear, String show, String rating, String genre, double audienceScore, double viewersInThousands, boolean animated, boolean basedOnShow) {
        super(title, releaseYear, rating, genre, audienceScore, animated);
        this.show = show;
        this.viewersInThousands = viewersInThousands;
        this.basedOnShow = basedOnShow;
    } // + TVMovie
    
    
    // Accessors & Mutators
    public String getShow() {
        return show;
    } // + String getShow

    public void setShow(String show) {
        this.show = show;
    } // + void setShow

    public double getViewersInThousands() {
        return viewersInThousands;
    } // + double getViewersInThousands

    public void setViewersInThousands(double viewersInThousands) {
        this.viewersInThousands = viewersInThousands;
    } // + void setViewersInThousands

    public boolean isBasedOnShow() {
        return basedOnShow;
    } // + boolean isBasedOnShow()

    public void setBasedOnShow(boolean basedOnShow) {
        this.basedOnShow = basedOnShow;
    } // + void setBasedOnShow()

    
    // Override toString() method
    @Override
    public String toString() {
        if (this.isBasedOnShow()) {
            if (this.isAnimated()) {
                return this.getTitle() + " (" + this.getReleaseYear() + ") is an animated " + this.getRating() + "-rated TV movie based on the show " + this.getShow() + " with an audience score of " + this.getAudienceScore() + " that got " + String.format("%.0f",(1000 * this.getViewersInThousands())) + " viewers on initial airing.";
            } // if (this.isAnimated())
            else {
                return this.getTitle() + " (" + this.getReleaseYear() + ") is a live-action " + this.getRating() + "-rated TV movie based on the show " + this.getShow() + " with an audience score of " + this.getAudienceScore() + " that got " + String.format("%.0f",(1000 * this.getViewersInThousands())) + " viewers on initial airing.";
            } // else
        } // if (this.isBasedOnShow)
            else {
            if (this.isAnimated()) {
                return this.getTitle() + " (" + this.getReleaseYear() + ") is an animated " + this.getRating() + "-rated TV movie with an audience score of " + this.getAudienceScore() + " that got " + String.format("%.0f",(1000 * this.getViewersInThousands())) + " viewers on initial airing.";
            } // if (this.isAnimated())
            else {
                return this.getTitle() + " (" + this.getReleaseYear() + ") is a live-action " + this.getRating() + "-rated TV movie with an audience score of " + this.getAudienceScore() + " that got " + String.format("%.0f",(1000 * this.getViewersInThousands())) + " viewers on initial airing.";
            } // else
        } // else
    } // + String toString
    
    
} // + class TVMovie
