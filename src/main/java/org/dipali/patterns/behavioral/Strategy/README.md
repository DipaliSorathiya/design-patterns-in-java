
#  Strategy Design Pattern – Behavioral

The **Strategy Design Pattern** is a behavioral design pattern that allows you to define a family of algorithms, encapsulate each one, and make them interchangeable at runtime. It helps in selecting the algorithm’s behavior at runtime without modifying the context class.

---

##  Structure

Strategy (Interface)
↑
ConcreteStrategyA ConcreteStrategyB
↑ ↑
Implements Implements

Context (Uses Strategy)


---

##  When to Use

- You have multiple algorithms for a specific task.
- You want to switch between algorithms at runtime.
- You want to eliminate large `if-else` or `switch` statements for behavior selection.
- You want to follow the **Open/Closed Principle**.

---

##  Key Components

| Component         | Description                                       |
|------------------|---------------------------------------------------|
| `Strategy`        | Interface that defines the behavior               |
| `ConcreteStrategy`| Implements the behavior in various ways           |
| `Context`         | Maintains a reference to a `Strategy` object      |

---

##  Example: Payment Strategy

### 1. Strategy Interface

```java
public interface PaymentStrategy {
    void pay(int amount);
}
2. Concrete Strategies

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }
}

public class UPIPayment implements PaymentStrategy {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }
}
3. Context Class

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        paymentStrategy.pay(amount);
    }
}
4. Main Class (Usage)

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012"));
        context.makePayment(1000);

        context.setPaymentStrategy(new UPIPayment("dipali@upi"));
        context.makePayment(500);
    }
}


### Benefits
Promotes code reusability and separation of concerns

Simplifies testing and maintenance

Supports runtime flexibility

### Run
To run the program:


javac Main.java
java Main

 Related Patterns
State Pattern – Similar structure but focuses on states and transitions

Decorator Pattern – Adds new behavior dynamically, but Strategy is about switching behavior

 Summary
The Strategy pattern is a powerful way to organize and dynamically change behaviors in a clean, object-oriented manner. It keeps your code extensible and avoids hardcoding logic decisions.

