public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("App started");
        logger2.log("Testing second logger");

        if(logger2 == logger1) {
            System.out.println("The singleton property is preserved. Only one instance is created.");
        } else {
            System.out.println("Multiple instances created.");
        }
    }
}