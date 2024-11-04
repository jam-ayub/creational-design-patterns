import builder.Movie;
import builder.Presentations;
import builder.Slide;
import builder.patternstructure.MovieBuilder;
import builder.patternstructure.PDFDocumentBuilder;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentations();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        presentation.addSlide(new Slide("Slide 3"));

        var builder = new MovieBuilder();
        presentation.export(builder);
        var movie = builder.getMovie();
    }
}