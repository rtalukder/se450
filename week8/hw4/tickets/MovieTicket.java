package tickets;

import java.util.Calendar;
import java.util.List;

public class MovieTicket implements IMovieTicket {
    private final String movieName;
    private final String movieStudio;
    private final String director;
    // Move the above fields into a separate object and make this class into a flyweight
    private final Calendar showTime;

    public MovieTicket(String movieName, String movieStudio, String director, Calendar showTime) {
        this.movieName = movieName;
        this.movieStudio = movieStudio;
        this.director = director;
        this.showTime = showTime;
    }

    @Override
    public String getMovieName() {
        throw new Error("Implement getMovieName()");
    }

    @Override
    public String getMovieStudio() {
        throw new Error("Implement getActors()");
    }

    @Override
    public String getDirector() {
        throw new Error("Implement getReleaseDate()");
    }

    @Override
    public Calendar getShowtime() {
        throw new Error("Implement getShowtime()");
    }
}
