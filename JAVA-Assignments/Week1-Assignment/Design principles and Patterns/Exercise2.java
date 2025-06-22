interface Document {
    void open();
}
class Word implements Document {
    public void open() { System.out.println("Opening Word"); }
}
class Pdf implements Document {
    public void open() { System.out.println("Opening PDF"); }
}
class Excel implements Document {
    public void open() { System.out.println("Opening Excel"); }
}
abstract class DocumentFactory {
    abstract Document create();
}
class WordFactory extends DocumentFactory {
    Document create() { return new Word(); }
}
class PdfFactory extends DocumentFactory {
    Document create() { return new Pdf(); }
}
class ExcelFactory extends DocumentFactory {
    Document create() { return new Excel(); }
}
public class Main {
    public static void main(String[] args) {
        new WordFactory().create().open();
        new PdfFactory().create().open();
        new ExcelFactory().create().open();
    }
}
