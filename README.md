# 🏨 Landon Hotel Scheduling Application - Spring Boot & Angular  

## Project Overview  
This project enhances an existing **Spring Boot & Angular** application for **hotel reservations** by adding:  
✅ **Multithreaded localization** for English & French 🇺🇸🇫🇷  
✅ **Currency display** in USD ($), CAD (C$), and EUR (€) 💰  
✅ **Time zone conversion** for event scheduling across ET, MT, and UTC 🕒  
✅ **Containerization with Docker** for seamless deployment 📦  
✅ **Cloud deployment strategy** for scalability ☁️  

---

## 🚀 Technologies Used  
- **Java** (Spring Boot, Multithreading)  
- **Angular** (Front-end)  
- **MySQL** (Database)  
- **Docker** (Containerization)  
- **GitLab** (Version Control)  
- **Cloud Services** (Azure)  

---

## 🛠 Getting Started  

### Prerequisites  
- **JDK 11+**  
- **Maven**  
- **Node.js** (for Angular Front-end)  
- **MySQL**  
- **Docker**  
- **IntelliJ IDEA (Ultimate Edition)**  

### Setup
1. **Clone the repository**  

2. **Configure MySQL connection** in `application.properties`:

3. **Run the application**  

## API Endpoints
- **POST** `/api/checkout` - Place an order for vacation packages and excursions  

## Database Schema
The application uses the following main entities:
- Customer
- Order
- HotelRoom
- Reservation
## 🧪 Testing 

 **1. Use the provided Angular frontend**
- Navigate to the **booking page** and place a test reservation.
- Verify the **reservation confirmation message** appears.

**2. Ensure API responses are successful**
- Use **Postman** or `curl` to test API endpoints:
  ```sh
  curl -X GET http://localhost:8080/api/reservations
## 🚀 Challenges & Learnings  

### 1️⃣ **Multithreading for Localization**  
**Challenge**: Running **multiple language translations simultaneously** caused **thread conflicts**.  
**Solution**: Used **ExecutorService with fixed thread pool** to manage concurrency safely.  
**Takeaway**: Improved my **understanding of Java multithreading** for parallel execution.  

### 2️⃣ **Time Zone Conversion Complexity**  
**Challenge**: Different **time zones** caused **misalignment in event scheduling**.  
**Solution**: Used **ZonedDateTime API** to standardize and **convert time zones dynamically**.  
**Takeaway**: Gained hands-on experience with **handling global time zones in Java**.  

### 3️⃣ **Containerization with Docker**  
**Challenge**: Creating a **single Docker image** for both **Java backend** and **Angular frontend**.  
**Solution**: Used **multi-stage builds** in Docker to ensure a **lightweight, efficient image**.  
**Takeaway**: Strengthened my skills in **Dockerizing full-stack applications** for cloud deployment.  

### 4️⃣ **Cloud Deployment Best Practices**  
**Challenge**: Selecting the **best cloud deployment strategy**.  
**Solution**: Researched **AWS, Azure, and GCP** to find **cost-effective and scalable solutions**.  
**Takeaway**: Gained knowledge of **CI/CD pipelines, cloud deployment models, and Docker orchestration**.  

