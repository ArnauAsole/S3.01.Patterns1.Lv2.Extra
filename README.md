# S3.01.Patterns1.Lv2.Extra
 # 📞 International Address & Phone Manager – Abstract Factory Pattern 💃🐂Ç🔨

## 🌍 Java Project Using the Abstract Factory Pattern
This project implements a simple international address and phone number manager using the Abstract Factory design pattern in Java with IntelliJ. It allows storing contacts with country-specific formats for addresses and phone numbers, while ensuring code modularity and adherence to the Single Responsibility Principle.

### 📚 Overview
The application supports:

Adding international contacts

Handling different address and phone number formats per country

Encapsulation of creation logic using Abstract Factory

Clean separation of concerns between entities and their creation

### 🧱 Design Structure

🧩 Abstract Factory Interfaces

```
public interface ContactFactory {
    Address createAddress(String street, String city, String postalCode);
    PhoneNumber createPhoneNumber(String number);
}

public interface Address {
    String getFullAddress();
}

public interface PhoneNumber {
    String getFormattedNumber();
}
```

### 📒 Contact Manager Features
### ✅ Add new contacts via a factory

### 📋 Display full international contact list

### ☑️ Extendable: Simply add new factories for more countries

```
manager.addContact(SovieticUnionFactory, "Lenin St", "Stalingrado", "10001", "5551234567");
manager.displayAllContacts();
```

### 🧪 Principles Followed

Single Responsibility Principle (SRP): Each class has one reason to change.

Abstract Factory Pattern: To create families of related objects without specifying their concrete classes.

### 🛠️ Tools Used

IntelliJ IDEA – Development Environment

Java – Core programming language

OOP & Design Patterns – Code architecture and maintainability

🚀 Example Output

```
Address: Calle Mayor 5, 28013 Madrid, Spain
Phone: +34 600123456

```

### 🪡 Git Hub link:
```
https://github.com/ArnauAsole/S3.01.Patterns1.Lv2.Extra.git
```
