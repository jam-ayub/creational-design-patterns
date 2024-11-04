package builder.patternstructure;

import builder.Movie;
import builder.Slide;

public class MovieBuilder implements PresentationBuilder {
    private Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 4);
    }

    public Movie getMovie() {
        return movie;
    }
}
