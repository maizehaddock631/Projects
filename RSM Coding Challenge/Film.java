
/**
 *
 *
 * @author Jhardelle Haye
 * @version 10.12.2024
 */
public class Film
{
    // instance variables - replace the example below with your own
    public String name;
    private String genre;
    private Integer rating = null;
    public int yearOfRelease;
    private int runtimeMins;
    /**
     * Constructor for objects of class Film
     */
    public Film(String name, String genre, int yearOfRelease, int runtimeMins)
    {
        this.name = name;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
        this.runtimeMins = runtimeMins;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setRating(int newRating)
    {
        if (newRating < 0 | newRating > 5) {
            System.out.println("Rating must be between 0 and 5");
        } else {
            this.rating = newRating;
        }

    }

    public void getRating() {
        if (this.rating == null) {
            System.out.println("This hasn't been rated yet");
        } else{
            System.out.println(this.rating + " stars");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (obj == null || getClass() != obj.getClass()) {return false;}
        Film other = (Film) obj;
        return this.yearOfRelease == other.yearOfRelease && this.name.equals(other.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(yearOfRelease);
    }

    public String getName() {
        return this.name;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public int getRuntimeMins() {
        return this.runtimeMins;
    }

    public void editName(String name) {
        this.name = name;
    }

    public void editGenre(String genre) {
        this.genre = genre;
    }

    public void editYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void editRuntime(int runtime) {
        this.runtimeMins = runtime;
    }
}