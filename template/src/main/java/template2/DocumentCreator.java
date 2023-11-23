package template2;

public class DocumentCreator {
    public static void main(String[] args) {
        System.out.println("Create presentation document");
        Document presentation = new Presentation();
        presentation.generateDocument();

        System.out.println("*************************************");

        System.out.println("Create letter document");
        Document letter = new Letter();
        letter.generateDocument();
    }
}
