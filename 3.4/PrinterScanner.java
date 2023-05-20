public class PrinterScanner implements Printer,Scanner {
    @Override
    public void scan() {
        System.out.println("scan() from PrinterScanner class");
    }

    @Override
    public void print() {
        System.out.println("print() from PrinterScanner class");
    }
}
