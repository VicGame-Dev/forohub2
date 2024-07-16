# Foro Hub

Foro Hub es una aplicación web que permite a los usuarios crear, ver, actualizar y eliminar tópicos en un foro. También incluye un sistema de autenticación de usuarios.

## Características

- **Crear y administrar tópicos:** Los usuarios pueden agregar nuevos tópicos, ver una lista de tópicos, actualizar y eliminar tópicos existentes.
- **Autenticación de usuarios:** Los usuarios pueden iniciar sesión para acceder a las funciones del foro.

## Tecnologías Utilizadas

- **Backend:** Java Spring Boot
- **Base de Datos:** MySQL
- **Autenticación:** JWT (JSON Web Token)

## Instalación y Configuración

### Prerrequisitos

Asegúrate de tener instalado:
- **Java** (JDK 17 o superior)
- **Maven**
- **MySQL**

### Pasos para Configurar

1. **Configurar la base de datos MySQL:**
    - Crea una base de datos llamada `forohub`.
    - Actualiza las credenciales de la base de datos en el archivo `application.properties`:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/forohub
        spring.datasource.username=tu_usuario
        spring.datasource.password=tu_contraseña
        spring.jpa.hibernate.ddl-auto=update
        ```

2. **Clonar el proyecto y ejecutarlo:**
    - Clona el repositorio y navega al directorio del proyecto:
        ```bash
        git clone https://github.com/tu_usuario/forohub.git
        cd forohub
        ```
    - Compila y ejecuta la aplicación:
        ```bash
        mvn clean install
        mvn spring-boot:run
        ```

## Uso de la Aplicación

### Endpoints Principales

#### Autenticación

- **Iniciar sesión:**
    - Endpoint: `POST /login`
    - Envía un JSON con el `login` y `clave` del usuario para recibir un token JWT.

#### Gestión de Tópicos

- **Crear un nuevo tópico:**
    - Endpoint: `POST /topicos`
    - Envía un JSON con los detalles del tópico (título, mensaje, autor, etc.)

- **Listar tópicos:**
    - Endpoint: `GET /topicos`
    - Devuelve una lista de tópicos con paginación.

- **Ver detalles de un tópico:**
    - Endpoint: `GET /topicos/{id}`
    - Devuelve los detalles de un tópico específico.

- **Actualizar un tópico:**
    - Endpoint: `PUT /topicos`
    - Envía un JSON con el `id` del tópico y los campos a actualizar (título, mensaje).

- **Eliminar un tópico:**
    - Endpoint: `DELETE /topicos/{id}`
    - Elimina el tópico especificado por el `id`.

## Contribuciones

¡Las contribuciones son bienvenidas! Si tienes ideas o mejoras, abre un issue o envía un pull request.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

