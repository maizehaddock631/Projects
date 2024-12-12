import java.util.ArrayList;

/**
 * 
 *
 * @author Jhardelle Haye
 * @version 12.12.2024
 */
public class TVShow
{
    // instance variables - replace the example below with your own
    private String name;
    private String genre;
    private Integer rating = null;
    public ArrayList<TVSeason> seasons = new ArrayList<>();
    /**
     * Constructor for objects of class TVShow
     */
    public TVShow(String name, String genre, int rating)
    {
        this.name = name;
        this.genre = genre;
        if(rating <= 5 && rating >= 0) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0 and 5 stars");
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return this.name;
    }

    public String getGenre() {
        return this.genre;
    }

    public void getRating() {
        if (rating == null) {
            System.out.println("This hasn't been rated yet");
        } else{
            System.out.println(this.rating + " stars");
        }
    }

    public void editName(String name) {
        this.name = name;
    }

    public void editGenre(String genre) {
        this.genre = genre;
    }

    public void editRating(int rating) {
        if(rating <= 5 && rating >= 0) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0 and 5 stars");
        }
    }

    boolean hasSeason(TVSeason season) {
        return seasons.contains(season);
    }

    public void getSeasons() {
        if(seasons.size() == 0) {
            System.out.println("The show has no seasons added to it");
        } else {
            for (TVSeason season: seasons) {
                System.out.println("Season " + season.getSeasonNumber() + ", Released in " + season.getYearOfRelease() + " has " + season.getNumberofEpisodes() + " episodes");
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TVShow other = (TVShow) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
