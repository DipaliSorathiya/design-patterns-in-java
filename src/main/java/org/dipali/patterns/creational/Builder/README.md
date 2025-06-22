# 🍕 Builder Design Pattern – Java Implementation

The **Builder Design Pattern** is a **creational pattern** used to construct complex objects step-by-step. It helps create readable, flexible, and maintainable code, especially when an object has many optional parameters.

---


## 🧩 What Problem Does It Solve?

Creating a complex object using constructors can lead to:

- Confusing code (`true, false, "large"`)
- Constructor overloads
- Hard-to-read parameter lists

> Builder Pattern solves this by using **method chaining** to build the object clearly and flexibly.

---

## ✅ Features of This Implementation

- 📦 Clean separation of Product (`Pizza`) and Builder (`PizzaBuilder`)
- 🧊 Immutable final object
- ⛓️ Fluent method chaining (`.setBase().setSize().addCheese()...`)
- 🧪 Easy to test and extend

---

## 💻 Code Example

### 🔹 Creating a Pizza

```java
Pizza pizza = new PizzaBuilder()
    .setBase("Thin Crust")
    .setSize("Large")
    .addCheese(true)
    .addMushrooms(true)
    .addPepperoni(false)
    .build();

System.out.println(pizza);
