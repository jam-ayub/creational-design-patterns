package builder.patternstructure;

import builder.PDFDocument;
import builder.Slide;

public class PDFDocumentBuilder implements PresentationBuilder {
    private PDFDocument pdfDocument = new PDFDocument();

    @Override
    public void addSlide(Slide slide) {
        pdfDocument.addPage(slide.getText());
    }

    public PDFDocument getPDFDocument() {
        return pdfDocument;
    }
}
