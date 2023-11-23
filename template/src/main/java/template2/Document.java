package template2;

abstract class Document {

    private void prepareDocument() {
        System.out.println("Creating the document");
    }

    protected abstract void writeHeader();
    protected abstract void writeContent();

    private void saveDocument(){
        System.out.println("Saving the document");
    }

    public final void generateDocument() {
        prepareDocument();
        writeHeader();
        writeContent();
        saveDocument();
    }

}
