# Backend-Emssanar-Prueba

Este proyecto de backend está desarrollado en Java 21 y utiliza Spring Boot junto con Maven para la gestión de dependencias. A continuación, se detalla la estructura del código y la distribución de paquetes en el proyecto:

## Estructura del Código

El código fuente se organiza en los siguientes paquetes:

1. **Configuración:**
   - Ruta: `C:\Users\Jeferson Delgado\Documents\Prueba Emssanar\backend\backend\src\main\java\com\backend\emssanar\backend\config`
   - Contiene configuraciones específicas de la aplicación, como configuración de CORS, permitiendo recibir peticiones de la url            
    http://localhost:4200

2. **Controladores (Controllers):**
   - Ruta: `C:\Users\Jeferson Delgado\Documents\Prueba Emssanar\backend\backend\src\main\java\com\backend\emssanar\backend\controller`
   - Contiene clases que manejan las peticiones HTTP y gestionan la lógica del negocio
   - **AfiliadoController:**
   - Ruta: `C:\Users\Jeferson Delgado\Documents\Prueba Emssanar\backend\backend\src\main\java\com\backend\emssanar\backend\controller\AfiliadoController.java`
   - Descripción: Este controlador maneja las operaciones relacionadas con los afiliados. Incluye endpoints para la creación, consulta, actualización y eliminación de afiliados.

   - **ControladorDeExcepciones:**
   - Ruta: `C:\Users\Jeferson Delgado\Documents\Prueba Emssanar\backend\backend\src\main\java\com\backend\emssanar\backend\controller\ControladorDeExcepciones.java`
   - Descripción: Este controlador maneja las excepciones generadas durante las operaciones en la aplicación y proporciona respuestas HTTP apropiadas.

   - **RecursoNoEncontradoException:**
   - Ruta: `C:\Users\Jeferson Delgado\Documents\Prueba Emssanar\backend\backend\src\main\java\com\backend\emssanar\backend\controller\RecursoNoEncontradoException.java`
   - Descripción: Esta clase representa una excepción personalizada que se lanza cuando no se encuentra un recurso solicitado.

3. **Modelos (Models):**
   - Ruta: `C:\Users\Jeferson Delgado\Documents\Prueba Emssanar\backend\backend\src\main\java\com\backend\emssanar\backend\models`
   - Contiene las clases de modelo que representan las entidades del dominio.
   La clase `Afiliado` representa a un afiliado en el sistema y está mapeada a una entidad en la base de datos mediante JPA (Java Persistence API).

   ### Atributos

   - **id (Long):** Identificador único generado automáticamente para la entidad en la base de datos.
   - **nombre (String):** Nombre del afiliado.
   - **fechaNacimiento (String):** Fecha de nacimiento del afiliado (en formato de cadena).
   - **direccion (String):** Dirección del afiliado.
   - **telefono (String):** Número de teléfono del afiliado.
   - **genero (String):** Género del afiliado.

4. **Repositorios (Repositories):**
   - Ruta: `C:\Users\Jeferson Delgado\Documents\Prueba Emssanar\backend\backend\src\main\java\com\backend\emssanar\backend\repository`
   - Contiene interfaces que definen operaciones de acceso a datos para las entidades del dominio.

## Requisitos del Sistema

- Java 21
- Maven

## Ejecución del Proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/jeferD/Backend-Emssanar-Prueba.git
2. La ejecucion del codigo depende de cada editor de codigo, yo lo realice en visual code y por medio de extenciones este lo ejecuta manual