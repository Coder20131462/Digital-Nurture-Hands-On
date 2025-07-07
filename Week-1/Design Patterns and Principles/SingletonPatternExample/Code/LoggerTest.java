public class LoggerTest
{
    public static void main(String[] args)
    {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Test message from logger1.");
        logger2.log("Test message from logger2.");

        if (logger1 == logger2)
        {
            System.out.println("Test Passed : Both logger instances are the same (Singleton works).");
        }
        else
        {
            System.out.println("Test Failed : Different logger instances (Singleton failed).");
        }
    }
}
