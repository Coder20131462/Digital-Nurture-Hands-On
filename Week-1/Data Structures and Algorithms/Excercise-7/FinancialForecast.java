public class FinancialForecast
 {
    //Recursive Approach
    public static double calculateFutureValue(double initialValue, double growthRate, int years) 
    {    
        if (years == 0) 
        {
            return initialValue;
        }
        
        return calculateFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
    
    //Iterative Approach
    public static double calculateFutureValueIterative(double initialValue, double growthRate, int years) {
    double value = initialValue;
    for (int i = 1; i <= years; i++) {
        value *= (1 + growthRate);
    }
    return value;
}


    public static void main(String[] args) 
    {
        double initialValue = 10000; 
        double growthRate = 0.1;     
        int years = 5;              

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);

        double futureValue2 = calculateFutureValueIterative(initialValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue2);

    }
}
