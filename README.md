# Inventory Management System (Console-Based)

This is a Java-based console inventory management application that allows users to:
- Register/Login securely
- Add, update, delete, and view inventory items
- Generate printable HTML receipts

---

## 📁 Project Structure

src/
├── dao/
│ ├── ItemDAO.java
│ └── UserDAO.java
├── model/
│ ├── Item.java
│ └── User.java
├── util/
│ ├── FileUtil.java
│ └── SecurityUtil.java
└── ui/
└── Main.java
resources/
├── users.txt
├── {username}_inventory.txt

---

## ✅ Features

- User Registration & Login with hashed passwords
- Inventory CRUD operations
- File-based persistence (`.txt`)
- Generates auto-print HTML receipts
- Simple CLI interface for usability

---

## 🛠 How to Run

1. **Compile all Java files**  
   Navigate to `src/` and compile:
   ```bash
   javac ui/Main.java
 
 
2. **Run the main program** 
    java ui.Main

3. **Receipt Output** 

      *  A receipt file will be created as: receipt_<username>.html

      *  It will open in the browser and support printing.

🧩 Dependencies

    No external libraries.

    Pure Java (version 8+ recommended)

🔒 Security

    Passwords are hashed using SHA-256.

    No plaintext storage of passwords.

🗂 Data Storage

    All user credentials stored in resources/users.txt

    Each user's inventory saved separately as resources/<username>_inventory.txt

