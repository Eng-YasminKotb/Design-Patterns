# Singleton Pattern Notes

**Definition:**  
Ensure a class has **only one instance** and provide a **global point of access** to it.

---

## 1️⃣ Lazy Initialization Singleton

**Concept:**  
- Instance is created **only when needed**.  
- Not thread-safe by default.  

**Pros:**  
- Saves memory if object creation is heavy and not always needed.  

**Cons:**  
- Not safe for multithreading.  

**Use Cases:**  
- Classes that may not always be used during runtime.  

---

## 2️⃣ Eager Initialization Singleton

**Concept:**  
- Instance is created **at class loading time**.  
- Thread-safe by default.  

**Pros:**  
- Simple and guaranteed to be thread-safe.  

**Cons:**  
- Instance is created even if never used → may waste resources.  

**Use Cases:**  
- Lightweight instances needed throughout the application.  
- Configuration or settings classes.  

---

## 3️⃣ Thread-Safe Singleton (Double-Checked Locking)

**Concept:**  
- Lazy initialization + thread safety.  
- Uses `volatile` and `synchronized` internally to prevent multiple threads from creating multiple instances.  

**Pros:**  
- Thread-safe  
- Lazy initialization  

**Cons:**  
- Slightly more complex than Eager or Lazy  
- Overhead of synchronized block (minimal with double-checked)  

**Keywords to remember:**  
- `volatile` → ensures visibility between threads  
- `synchronized` → prevents race conditions during instance creation  

**Use Cases:**  
- Logger  
- Database connection pool  
- Any critical resource that must exist as a single instance and accessed by multiple threads

---

## ✅ Summary Table

| Type                  | Instance Created       | Thread Safe | Notes                       |
|-----------------------|----------------------|------------|-----------------------------|
| Lazy                  | On first request      | ❌          | Simple, not thread-safe      |
| Eager                 | Class loading         | ✅          | May waste resources         |
| Thread-Safe Lazy      | On first request      | ✅          | Double-checked locking      |
