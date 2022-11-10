public class CreditPaymentService {
     public double calculate(int sum, double percent) {
         double MyPercent = percent / 100 / 12;
        double result = sum * MyPercent + sum * MyPercent / (((1 + MyPercent) * (1 + MyPercent) * (1 + MyPercent) *
                (1 + MyPercent) * (1 + MyPercent) * (1 + MyPercent) * (1 + MyPercent) * (1 + MyPercent) *
                (1 + MyPercent) * (1 + MyPercent) * (1 + MyPercent) * (1 + MyPercent)) - 1);
        return result;


    }
}
