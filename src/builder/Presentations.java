package builder;

import builder.patternstructure.PresentationBuilder;

import java.util.ArrayList;
import java.util.List;

public class Presentations {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
        builder.addSlide(new Slide("Copyright"));
        for (var slide: slides) {
            builder.addSlide(slide);
        }
    }
}
