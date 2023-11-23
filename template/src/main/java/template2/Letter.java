package template2;

public class Letter extends Document{
    @Override
    protected void writeHeader() {
        System.out.println("Write header for the letter");
    }

    @Override
    protected void writeContent() {
        System.out.println("Write content for the letter");
    }
}
