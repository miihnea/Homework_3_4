public class FullyFunctionalPrinter extends MultifunctionalPrinter{
    @Override
    public void fax() {
        System.out.println("fax() from fully functional printer class");
    }

    @Override
    public void print() {
        System.out.println("print() from fully functional printer class");
    }

    @Override
    public void scan() {
        System.out.println("scan() from fully functional printer class");
    }
}
