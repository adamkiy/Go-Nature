https://github.com/skyboak/GoNature_Client.git client-side


https://github.com/skyboak/GoNature_Client.git server-side


# GoNature Park Management System

GoNature is a Java-based application developed using JavaFX for the user interface and OCSF (Object Client-Server Framework) for efficient client-server communication. It follows the MVC (Model-View-Controller) architecture to manage park operations in a structured and maintainable way. This system was built as part of an academic course project using Eclipse IDE.

---

## 🌐 System Architecture

### 📁 Package Structure:
- `gui/` – JavaFX classes for the graphical user interface.
- `client/` – Handles client-side communication and logic.
- `server/` – Manages server-side logic, data handling, and business rules.
- `entities/` – Contains Java classes representing core data models (users, bookings, etc.).

---

## 🛠 Development Environment
- **Java** – JDK 11 or later
- **JavaFX** – UI development
- **MySQL** – Database backend
- **OCSF** – Framework for client-server communication
- **Eclipse IDE** – Preferred development environment

---

## 📐 System Design and Planning

Before development, the team prepared system design documents to understand requirements and plan development:

- **Use Case Diagrams** – Interactions between users and the system
- **Class Diagrams** – Structure of system classes and relationships
- **Activity Diagrams** – Flow of operations
- **Sequence Diagrams** – Order of interactions between system components

---

## 🧰 Setup and Installation

### ✅ Prerequisites:
- Install **MySQL**, create a `GoNature` database, and run the provided SQL scripts to create necessary tables and data.
- Install **Eclipse IDE** and ensure JavaFX is set up properly.

### 🧩 Clone the Project:
```bash
git clone https://github.com/adamkiy/GoNature.git
cd GoNature
