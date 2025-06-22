#  Observer Design Pattern – Behavioral

The **Observer Design Pattern** is a **behavioral design pattern** used to create a one-to-many dependency between objects. When one object (the **Subject**) changes state, all its dependents (the **Observers**) are notified and updated automatically.

It is widely used in event-driven systems, notification systems, and UI frameworks.

---

##  Concept

> “Don’t call us. **We’ll call you** when something changes.”

This pattern allows objects to subscribe to updates from another object and get notified whenever a particular event occurs — **without tight coupling** between the objects.

---

##  Participants

| Role       | Description                                           |
|------------|-------------------------------------------------------|
| `Subject`  | Maintains a list of observers and notifies them       |
| `Observer` | Defines an interface for objects that should be notified |
| `ConcreteSubject` | Implements the Subject and maintains state    |
| `ConcreteObserver`| Implements Observer and reacts to updates      |

---

##  Real-Life Example: Product Back-in-Stock Notification

When a product is out of stock, customers can subscribe for notifications.  
Once it’s restocked, all subscribed customers are notified automatically.

---

##  Code Example (Java)

###  1. Observer Interface

```java
public interface Observer {
    void update(String productName);
}
 2. Concrete Observer (Customer)
java
Copy
Edit
public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Hey " + name + ", " + productName + " is back in stock!");
    }
}
 3. Subject Interface
java
Copy
Edit
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
 4. Concrete Subject (Product)

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String productName;
    private List<Observer> customers = new ArrayList<>();

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public void addObserver(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer customer : customers) {
            customer.update(productName);
        }
    }

    public void restock() {
        System.out.println(productName + " is restocked!");
        notifyObservers();
    }
}
🔹 5. Main Usage

public class Main {
    public static void main(String[] args) {
        Product iphone = new Product("iPhone 15 Pro");

        Customer dipali = new Customer("Dipali");
        Customer aman = new Customer("Aman");

        iphone.addObserver(dipali);
        iphone.addObserver(aman);

        iphone.restock();  // Triggers notification to all observers
    }
}

Output

iPhone 15 Pro is restocked!
Hey Dipali, iPhone 15 Pro is back in stock!
Hey Aman, iPhone 15 Pro is back in stock!

 When to Use
Event handling systems (button clicks, listeners)

Stock market updates

Notification systems

Social media feed updates

Chat applications

 Benefits
Promotes loose coupling

Easy to add/remove observers dynamically

Enables event-driven programming

️ Drawbacks
Can cause memory leaks if observers aren’t properly removed

Too many observers can slow down the system

Related Design Patterns
Pattern	Relationship
Strategy	Allows switching behavior; Observer notifies on changes
Mediator	Central communication hub vs. direct Subject–Observer
Publisher-Subscriber	Like Observer but more decoupled, often async

 Final Hook
Think of Observer pattern as:
“Tell me when this changes — I’ll be ready.”
