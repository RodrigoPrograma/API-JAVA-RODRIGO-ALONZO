# 📦 API de Artículos - Spring Boot

API REST para la gestión de artículos (CRUD) desarrollada con Spring Boot.  
Permite crear, listar, actualizar y eliminar productos de una base de datos.

---

## 🚀 Tecnologías utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Base de datos (MySQL / H2 según configuración)
- Postman (para testing)

---

## 📁 Estructura del proyecto


src/
├── controller
├── service
├── repository
├── model (entity)
postman/
├── articulos-collection.json
├── dev-environment.json


---

## 🔗 Base URL


http://localhost:8080/api/articulos


---

## 📌 Endpoints

### 🔹 Obtener todos los artículos

GET /api/articulos


📌 Respuesta:
json

  {
    "id": 1,
    "nombre": "Mouse Gamer",
    "precio": 30000
  }

### 🔹 Obtener artículo por ID
GET /api/articulos/{id}

### 🔹 Crear artículo
POST /api/articulos

📌 Body:

{
  "nombre": "Mouse Gamer RGB",
  "precio": 30000
}
### 🔹 Actualizar artículo
PUT /api/articulos/{id}

📌 Body:

{
  "nombre": "Mouse Gamer Pro",
  "precio": 45000
}
### 🔹 Eliminar artículo
DELETE /api/articulos/{id}
🧪 Postman

Dentro del proyecto se incluyen archivos para importar en Postman:

postman/articulos-collection.json
postman/dev-environment.json
Cómo usarlo:
Abrir Postman
Click en Import
Seleccionar los archivos JSON
Ejecutar requests directamente

Controller → expone la API
Service → lógica de negocio
Repository → acceso a datos
Entity → modelo de base de datos
📌 Estado del proyecto

✔ CRUD completo
✔ API funcional
✔ Integración con base de datos
✔ Colección Postman incluida

👨‍💻 Autor

Desarrollado por Rodrigo Alonzo
