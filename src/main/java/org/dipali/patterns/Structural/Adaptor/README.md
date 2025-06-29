# Adapter Design Pattern

## 💡 Intent
Convert one interface into another so that incompatible classes can work together.

---

## ✅ Use Case
You have a `VlcPlayer` class but your app expects a `MediaPlayer` interface. Use an **Adapter** to wrap the VlcPlayer.

---

## 🔧 Components

| Component      | Role |
|----------------|------|
| `MediaPlayer`  | Target interface expected by the client |
| `VlcPlayer`    | Incompatible class (Adaptee) |
| `VlcAdapter`   | Adapter class that bridges the gap |
| `AudioPlayer`  | Client that uses `MediaPlayer` |
| `AdapterPatternTest` | Demo/test class |

---

## 📦 Example Usage
```java
AudioPlayer player = new AudioPlayer();
player.play("vlc", "kabirsingh.vlc");




Client (AudioPlayer)
      |
      v
MediaPlayer (Interface) <-------- VlcAdapter (implements MediaPlayer)
                                     |
                                     v
                                VlcPlayer (incompatible class)
