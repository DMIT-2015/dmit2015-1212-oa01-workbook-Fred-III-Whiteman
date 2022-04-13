package dmit2015.restClient;

import jakarta.json.JsonObject;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Map;

@RegisterRestClient(baseUri = "https://dmit2015-rt-database-demo-default-rtdb.firebaseio.com")
public interface MovieService {

    @POST
    @Path("/movies.json")
    JsonObject createMovie(Movie newMovie);

    @GET
    @Path("/movies.json")
    Map<String, Movie> getAllMovies();

    @GET
    @Path("/movies/{key}.json")
    Movie findByKey(@PathParam("key") String key);

    @PUT
    @Path("/movies/{key}.json")
    Movie updateMovie(@PathParam("key") String key, Movie updatedMovie);

    @DELETE
    @Path("/movies/{key}.json")
    void deleteMovie(@PathParam("key") String key);
}
