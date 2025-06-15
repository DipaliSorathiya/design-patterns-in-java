package org.dipali.patterns.behavioral.Strategy;

public class StrategyPatternTest {
        public static void main(String[] args) {

            PaymentContext context = new PaymentContext();

            context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012"));
            context.makePayment(1000);

            context.setPaymentStrategy(new UPIPayment("dipali@upi"));
            context.makePayment(500);
        }
}
