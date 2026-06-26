interface Document {
    void read();
}

class WordDocument implements Document {
    @Override
    public void read() {
        System.out.println("Reading WordDocument");
    }
}

class PdfDocument implements Document {
    public void read() {
        System.out.println("Reading PdfDocument");
    }
}

class ExcelDocument implements Document {
    public void read() {
        System.out.println("Reading ExcelDocument");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("WordDocument created");
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("PdfDocument created");
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("ExcelDocument created");
        return new ExcelDocument();
    }
}

public class Test {
    public static void main(String[] args) {
        //Factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        //Documents
        Document word = wordFactory.createDocument();
        Document pdf = pdfFactory.createDocument();
        Document excel = excelFactory.createDocument();

        word.read();
        pdf.read();
        excel.read();
    }
}