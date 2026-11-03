# Sistema de Gestión de Capacitación

Proyecto desarrollado para la materia **Seminario de Práctica** de la Licenciatura en Informática.

El sistema tiene como objetivo mejorar la gestión de capacitaciones del Comité Técnico de Capacitación de la Federación Bonaerense de Asociaciones de Bomberos Voluntarios, centralizando la información relacionada con personas, cursos, comisiones, inscripciones y certificaciones.

## Tecnologías utilizadas

- Java
- Apache NetBeans
- MySQL
- MySQL Workbench
- JDBC
- MySQL Connector/J
- Java Swing

## Base de datos

La base de datos utilizada se denomina:

`sgc_ctc`

Dentro de la carpeta `sql` se incluyen:

- `01_creacion_tablas.sql`: creación de la base de datos y tablas.
- `02_datos_prueba.sql`: datos de prueba.
- `03_consultas.sql`: consultas, actualizaciones y eliminación de registros.

## Ejecución del proyecto

1. Crear la base de datos ejecutando `01_creacion_tablas.sql`.
2. Ejecutar `02_datos_prueba.sql` para cargar datos de prueba.
3. Agregar MySQL Connector/J a las Libraries del proyecto en NetBeans.
4. Configurar el usuario y la contraseña de MySQL en `ConexionBD.java`.
5. Abrir el proyecto en Apache NetBeans.
6. Ejecutar `MenuPrincipal.java` o `FormularioPersona.java`.

## Funciones implementadas

- Conexión entre Java y MySQL.
- Registro de personas.
- Consulta de personas por DNI.
- Listado de personas.
- Actualización de registros.
- Eliminación de registros.
- Validación de documentos.
- Control de registros duplicados.
- Interfaz gráfica desarrollada con Java Swing.
- Búsqueda de personas desde la interfaz.
- Menú principal de opciones.
- Listado de cursos.
- Listado de jerarquías.
- Manejo de excepciones.
- Uso de arreglos y `ArrayList`.

## Patrón de diseño

El proyecto utiliza el patrón **DAO (Data Access Object)** para separar la lógica de acceso a datos del resto de la aplicación.

La clase `PersonaDAO` concentra las operaciones realizadas sobre la tabla `persona` de MySQL:

- `insertar()`
- `buscarPorDocumento()`
- `listar()`
- `actualizar()`
- `eliminar()`
- `existeDocumento()`

Esta organización permite mantener separadas las responsabilidades entre las clases del modelo, la interfaz gráfica y la persistencia.

## Programación Orientada a Objetos

Se aplican los siguientes conceptos:

- Encapsulamiento.
- Abstracción mediante la clase abstracta `Participante`.
- Herencia mediante `Persona extends Participante`.
- Polimorfismo mediante `mostrarTipo()`.
- Constructores.
- Manejo de excepciones.
- Creación y utilización de objetos.

## Estructuras de datos

El sistema utiliza de forma complementaria:

- `ArrayList<Persona>` para manejar colecciones dinámicas de personas.
- `ArrayList<Curso>` para manejar cursos.
- `String[] jerarquias` como arreglo tradicional para almacenar jerarquías predefinidas.

## Integración con MySQL

La persistencia se implementa mediante JDBC y MySQL Connector/J.

Se utilizan:

- `Connection`
- `PreparedStatement`
- `ResultSet`
- `SQLException`
- bloques `try-catch`
- `try-with-resources`

Las operaciones CRUD fueron probadas correctamente mediante la clase `PruebaPersonaDAOCompleto`.

## Interfaz gráfica

La clase `FormularioPersona` permite registrar personas y consultar registros por DNI.

La opción de búsqueda utiliza `PersonaDAO` para consultar directamente la base de datos MySQL y mostrar los resultados en los campos de la interfaz.

## Estructura principal del proyecto

- `modelo`: clases del dominio.
- `dao`: acceso a datos y conexión con MySQL.
- `excepcion`: excepciones del sistema.
- `vista`: interfaz gráfica Swing.
- `sistemagestioncapacitacion`: clases de ejecución y menú.
- `sql`: scripts de la base de datos.

## Estado del proyecto

El proyecto compila correctamente en Apache NetBeans.

