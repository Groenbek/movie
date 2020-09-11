package DTOs;

import entities.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author groen
 */
public class MoviesDTO {
    
     private List<MovieDTO> all = new ArrayList();

    
    public MoviesDTO(List<Movie> movieList){
        for (Movie m: movieList) {
            all.add(new MovieDTO(m));
        }
    }

    public List<MovieDTO> getAll() {
        return all;
    } 
}
