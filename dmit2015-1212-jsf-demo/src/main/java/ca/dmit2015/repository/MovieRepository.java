package ca.dmit2015.repository;

import ca.dmit2015.entity.Movie;
import common.jpa.AbstractJpaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
@Transactional
public class MovieRepository extends AbstractJpaRepository<Movie, Long> {

    public MovieRepository() {
        super(Movie.class);
    }

    public List<Movie> sortByReleaseDateDescending() {
        return getEntityManager()
                .createQuery("""
                Select m
                From Movie m
                Order By m.releaseDate DESC 
                """, Movie.class)
                .getResultList();
    }

}