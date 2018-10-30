package tickets;

public class MovieTicketFactoryManager {

    public static IMovieTicketFactory getMissionImpossibleMovieTicketFactory() {
        throw new Error("Implement the MissionImpossibleMovieTicketFactory as a Singleton");
    }

    public static IMovieTicketFactory getStarWarsMovieTicketFactory() {
        throw new Error("Implement the StarWarsMovieTicketFactory as a Singleton");
    }

    public static IMovieTicketFactory getSpidermanMovieTicketFactory() {
        throw new Error("Implement the SpidermanMovieTicketFactory as a Singleton");
    }

}
