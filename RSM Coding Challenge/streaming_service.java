import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

/**
 * 
 *
 * @author Jhardelle Haye
 * @version 12.12.2024
 */
public class streaming_service
{
    // instance variables - replace the example below with your own
    private String name;
    private int price;
    private HashSet<Film> filmlist = new HashSet<>();
    private static HashSet<Film> allFilms = new HashSet<>();
    private static HashMap<TVSeason, streaming_service> allSeasons = new HashMap<>();
    private HashSet<TVShow> showlist = new HashSet<>();

    /**
     * Constructor for objects of class streaming_service
     */
    public streaming_service(String name, int £price)
    {
        this.name = name;
        this.price = price;

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addFilm(Film newFilm){
        if (filmlist.contains(newFilm)) {
            System.out.println("This film is already available on this streaming service");
        } else if (allFilms.contains(newFilm)) {
            System.out.println("The film is already available on another streaming service");
        }else {
            filmlist.add(newFilm);
            allFilms.add(newFilm);
            System.out.println("The film " + newFilm.getName() + " has been added to " + name);
        }
    }

    public void removeFilm(Film film) {
        if (!filmlist.contains(film)) {
            System.out.println("This film is not available on this service");
        } else{
            filmlist.remove(film);
            allFilms.remove(film);
            System.out.println("The film " + film.name + " has been removed from this streaming service");
        }
    }

    public String getName() {
        return this.name;
    }

    public void getPrice() {
        System.out.println("£" + this.price);
    }

    public void getFilms() {
        if(filmlist.size() == 0) {
            System.out.print("This streaming service has no films added to it yet");
        } else {
            ArrayList<Film> yes = new ArrayList<>(filmlist);
            for (int i = 0; i < yes.size(); i++) {
                System.out.println((i+1) + ". " + yes.get(i).getName() + " - " + yes.get(i).getYearOfRelease() + ", Genre: " + yes.get(i).getGenre() + ", Rating: ");
                yes.get(i).getRating();
                System.out.println("Length: " + yes.get(i).getRuntimeMins() + " minutes");
            }
        }
    }

    public void getTVShows() {
        if (showlist.size() == 0) {
            System.out.println("This streaming service has to shows added to it yet");
        } else {
            ArrayList<TVShow> yes = new ArrayList<>(showlist);
            for (int i = 0; i < yes.size(); i++) {
                System.out.println((i + 1) + ". Name: " + yes.get(i).getName() + ", Genre: " + yes.get(i).getGenre() + ", Rating: "); yes.get(i).getRating();
                System.out.println("Seasons: ");
                yes.get(i).getSeasons();
            }
        }
    }

    public void addShow(TVShow show) {
        if(!showlist.contains(show)) {
            showlist.add(show);
            System.out.println("The show " + show.getName() + " has been added");
        } else {
            System.out.println(show.getName() + " is already on " + name);
        }

    }

    public void removeShow (TVShow show) {
        if(!showlist.contains(show)) {
            System.out.println("The show " + show.getName() + " isn't on this streaming service");
        } else {
            showlist.remove(show);
            System.out.println("The show " + show.getName() + " has been removed from this streaming service");
        }
    }

    public void addSeasonToShow(TVShow show, TVSeason season) {
        if (allSeasons.containsKey(season)) {
            streaming_service name = allSeasons.get(season);
            System.out.println("Season " + season.getSeasonNumber() + " is already on " + name.name);
        }else if(!showlist.contains(show)) {
            addShow(show);
        } else if (show.hasSeason(season)) {
            System.out.println("This season already exists in this show");
        }
        else{
            show.seasons.add(season);
            allSeasons.put(season, this);
            System.out.println("Season " + season.getSeasonNumber() + " has been added to " + show.getName());
        }
    }

    public void removeSeasonFromShow(TVShow show, TVSeason season) {
        if (!allSeasons.containsKey(season) || allSeasons.get(season) != this || !show.seasons.contains(season)) {
            System.out.println("This season is not in this streaming service");
        }

        show.seasons.remove(season);
        allSeasons.remove(season);
        System.out.println("Removed Season " + season.getSeasonNumber() + " from " + show.getName() + " on " + name);
    }

    public void editName(String name) {
        this.name = name;
    }

    public void editPrice(int price) {
        this.price = price;
    }
}
