# **MacroTrackers** 🥗📊
**Track Your Vitals & Monitor Your Nutrition Over Time**

## **📌 Overview**
MacroTrackers is a **Spring Boot** application that allows users to **track vitals** (weight & height) and log their **meal-based intake** (calories, carbs, sugars). The application helps users monitor their **nutritional trends** over time, providing insights into their daily food intake.

---

## **🚀 Features**
✅ **User Authentication** (Register, Login, Logout)  
✅ **User Profiles** (Weight, Height Tracking)  
✅ **Meal-Based Intake Logging** (Calories, Carbs, Sugars per Meal)  
✅ **Database Integration** (**PostgreSQL**)  
✅ **Secure Configuration** using **Environment Variables**  
✅ **Thymeleaf-Based UI** for logging meals & viewing trends

---

## **📂 Project Structure**
```
MacroTrackers
│── src/main/java/com/example/macrotrackers
│   ├── controllers  # Handles HTTP requests
│   ├── models       # Entity models (User, Profile, IntakeLog)
│   ├── repositories # Interfaces for database access
│   ├── services     # Business logic for user & meal tracking
│   ├── MacroTrackersApplication.java # Main entry point
│── src/main/resources
│   ├── templates    # Thymeleaf HTML views
│   ├── application.properties  # Spring Boot configurations
│── .env  # (ignored) Environment file for sensitive credentials
│── build.gradle
│── README.md
│── .gitignore
```

---

## **⚙️ Tech Stack**
- **Backend:** Spring Boot (Java 17), Spring Security, Spring Data JPA
- **Frontend:** Thymeleaf (HTML, CSS)
- **Database:** PostgreSQL
- **Configuration:** Environment Variables (`.env` support via `dotenv-java`)

---

## **🛀 Installation & Setup**
### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/yourusername/MacroTrackers.git
cd MacroTrackers
```

### **2️⃣ Set Up Environment Variables**
Create a **`.env`** file in the root directory:
```ini
DB_URL=jdbc:postgresql://localhost:5432/macrotrackers
DB_USER=your_db_user
DB_PASSWORD=your_secure_password
```
> ⚠️ **Ensure `.env` is added to `.gitignore` to avoid committing sensitive data.**

### **3️⃣ Configure Database**
- Install **PostgreSQL**
- Create a database:
  ```sql
  CREATE DATABASE macrotrackers;
  ```

### **4️⃣ Run the Application**
```bash
./gradlew bootRun
```
The app will be available at:  
📍 **`http://localhost:8080`**

---

## **🛠️ API Endpoints**
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/register` | GET/POST | User registration page |
| `/login` | GET/POST | Custom login page |
| `/profile/{username}` | GET | View user profile |
| `/intake` | GET/POST | Log a meal intake |
| `/view-intake?username=username` | GET | View past meal logs |

---

## **📌 Next Steps**
🔹 **Add dynamic graphs** (calories, carbs, sugars over time)  
🔹 **Personalized dashboards** (trends, most consumed meals)  
🔹 **Improve validation & error handling**

---

## **📝 License**
This project is licensed under the **MIT License**.

---

## **🤝 Contributing**
1. Fork the repository
2. Create a new branch: `git checkout -b feature-name`
3. Commit changes: `git commit -m "Add new feature"`
4. Push to your branch: `git push origin feature-name`
5. Submit a **Pull Request** 🚀

---

## **💎 Contact**
👤 **Asahel Womack**  
📩 Email: asahelwomack@gmail.com  
🔗 GitHub: [asa-elite](https://github.com/asa-elite)

---  

This **README.md** provides a **clear structure** so new developers can **easily understand** and contribute to your project. Let me know if you want any changes before committing! 🚀

