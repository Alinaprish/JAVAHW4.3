public class Main {
        public static void main(String[] args) {
            CreditPaymentService service = new CreditPaymentService();
            int sum = 1000000;
            double percent = 9.99;
        double MyPercent = percent / 100 / 12;
int MyPay = (int) service.calculate(1000000,9.99);
            System.out.println(MyPay);
        }
}

// Подскажите, пожалуйста, как же решить вопрос со степенями?)