package moviedisplay;


public class Documentary extends Movie{
    private String subject;

    
    // Constructors
    public Documentary() {
    } // + Documentary

    public Documentary(String title, int releaseYear, String rating, String subject, double audienceScore, double grossInThousands) {
        super(title, releaseYear, rating, audienceScore, grossInThousands);
        this.subject = subject;
    } // + Documentary

    // Accessor & Mutator
    public String getSubject() {
        return subject;
    } // + String getSubject

    public void setSubject(String subject) {
        this.subject = subject;
    } // + void setSubject
    
    
    // Override toString() method
    @Override
    public String toString() {
        return this.getTitle() + " (" + this.getReleaseYear() + ") is a " + this.getRating() + "-rated documentary about " + this.getSubject() + " with an audience score of " + this.getAudienceScore() + " that grossed $" + String.format("%.2f",(1000 * this.getGrossInThousands())) + '.';
    } // + String toString
    
} // + class Documentary
