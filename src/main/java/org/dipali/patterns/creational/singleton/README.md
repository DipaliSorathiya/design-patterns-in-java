# Singleton Design Pattern

##Intent
Ensure a class has **only one instance** and provide a **global point of access** to it.

---

## Use Cases
- Database connections
- Logging
- Configuration management

---

## Real-Life Analogy
Like a Prime Minister — only one person can be the PM at a time, and everyone uses the same individual for decisions.

---

## Implementation Steps
1. Create a **private static instance**
2. Make the **constructor private**
3. Create a **public static method** to return the instance

---

## Code: SingletonExample.java

```java
public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample() {}

    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
