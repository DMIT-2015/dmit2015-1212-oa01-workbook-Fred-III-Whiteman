package dmit2015.view;

import dmit2015.restClient.Movie;
import dmit2015.restClient.MovieService;
import lombok.Getter;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.omnifaces.util.Messages;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("currentMovieCreateController")
@RequestScoped
public class MovieCreateController {

    @Inject
    @RestClient
    private MovieService _movieService;

    @Getter
    private Movie newMovie = new Movie();

    public String onCreateNew() {
        String nextPage = "";
        try {
            _movieService.createMovie(newMovie);
            Messages.addFlashGlobalInfo("Create was successful.");
            nextPage = "index?faces-redirect=true";
        } catch (Exception e) {
            e.printStackTrace();
            Messages.addGlobalError("Create was not successful. {0}", e.getMessage());
        }
        return nextPage;
    }

}