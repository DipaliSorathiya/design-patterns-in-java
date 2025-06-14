# Factory Design Pattern

##Intent
Provide a way to delegate object creation to a factory class, **decoupling object creation from usage**.

---

##  Real-Life Example
Ordering a Pizza or choosing a plan on a subscription site:
> You ask for "Gold Plan" → backend creates the correct plan object

---

##  Components

| Component       | Description                              |
|----------------|------------------------------------------|
| `Shape`        | Interface (Product)                      |
| `Circle`, `Square` | Concrete classes implementing `Shape` |
| `ShapeFactory` | Factory class to create `Shape` objects  |
| `FactoryPatternTest` | Client using the factory            |

---

##  Code Usage

```java
ShapeFactory factory = new ShapeFactory();
Shape circle = factory.getShape("circle");
circle.draw(); // Output: Drawing a Circle!


## Benefits
    Clean object creation logic
    Better scalability and maintenance
    Reduces tight coupling between classes

## When NOT to Use?
--- When object creation is simple and doesn’t need abstraction
