public class Forecasting {
    public static double forecast(double current, double growthRate, int years) {
        if(years == 0) {
            return current;
        }

        return forecast(current * (1+growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        System.out.println("Forecasting based on past values:");
        System.out.println("Current value : 19800.58");
        System.out.println("No. of years : 5");
        System.out.println("Growth rate : 0.892");
        System.out.println("Forecast : " + Forecasting.forecast(19800.58, 0.892, 5));
    }
}