
/**
 * 
 *
 * @author Jhardelle Haye
 * @version 12.12.2024
 */
public class TVSeason
{
    // instance variables - replace the example below with your own
    private int seasonNumber;
    private int yearOfRelease;
    private int noOfEpisodes;
    /**
     * Constructor for objects of class TVSeason
     */
    public TVSeason(int seasonNumber, int yearOfRelease, int noOfEpisodes)
    {
        this.seasonNumber = seasonNumber;
        this.yearOfRelease = yearOfRelease;
        this.noOfEpisodes = noOfEpisodes;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getSeasonNumber()
    {
        return this.seasonNumber;
    }
    
    public int getYearOfRelease() {
        return this.yearOfRelease;
    }
    
    public int getNumberofEpisodes() {
        return this.noOfEpisodes;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (obj == null || getClass() != obj.getClass()) {return false;}

        TVSeason other = (TVSeason) obj;
        return this.seasonNumber == other.seasonNumber &&
               this.yearOfRelease == other.yearOfRelease &&
               this.noOfEpisodes == other.noOfEpisodes;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(seasonNumber) +
               Integer.hashCode(yearOfRelease) +
               Integer.hashCode(noOfEpisodes);
    }
}
