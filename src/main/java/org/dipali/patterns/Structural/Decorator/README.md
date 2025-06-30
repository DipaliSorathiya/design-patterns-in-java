# ☕ Decorator Design Pattern

## 💡 Intent
Attach new behaviors to objects dynamically without modifying their structure.

---

## ✅ Real-Life Example
Like adding toppings to coffee — milk, sugar, etc.  
You decorate the drink without changing the base.

---

## 🔧 Components

| Role              | Class             | Description                     |
|-------------------|------------------|---------------------------------|
| Component         | `Beverage`       | Base interface                  |
| ConcreteComponent | `SimpleCoffee`   | Original object                 |
| Decorator         | `BeverageDecorator` | Abstract class holding base   |
| ConcreteDecorators| `MilkDecorator`, `SugarDecorator` | Adds behavior |

---

## 📦 Example Usage
```java
Beverage coffee = new SimpleCoffee();
coffee = new MilkDecorator(coffee);
coffee = new SugarDecorator(coffee);
