package template2;

public class Presentation extends Document {
    @Override
    protected void writeHeader() {
        System.out.println("Writing header for the presentation");
    }

    @Override
    protected void writeContent() {
        System.out.println("Writing content for the presentation");
    }
}
