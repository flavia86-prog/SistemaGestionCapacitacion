# Sistema de Gestión de Capacitación

Proyecto desarrollado para la materia **Seminario de Práctica** de la Licenciatura en Informática.

El sistema tiene como objetivo mejorar la gestión de capacitaciones del Comité Técnico de Capacitación de la Federación Bonaerense de Asociaciones de Bomberos Voluntarios, permitiendo registrar y consultar personas, cursos, comisiones, inscripciones y certificaciones.

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

Dentro de la carpeta `sql` se incluyen los siguientes archivos:

- `01_creacion_tablas.sql`: crea la base de datos y las tablas.
- `02_datos_prueba.sql`: contiene datos de prueba.
- `03_consultas.sql`: contiene consultas, actualización y borrado de registros.

## Ejecución del proyecto

1. Crear la base de datos ejecutando `01_creacion_tablas.sql`.
2. Ejecutar `02_datos_prueba.sql` para cargar datos de prueba.
3. Agregar MySQL Connector/J a las Libraries del proyecto en NetBeans.
4. Configurar el usuario y la contraseña de MySQL en la clase `ConexionBD.java`.
5. Abrir el proyecto en Apache NetBeans.
6. Ejecutar `MenuPrincipal.java` para utilizar el menú del sistema.

## Funciones implementadas en el prototipo

- Conexión entre Java y MySQL.
- Consulta de personas por documento.
- Registro de personas desde Java.
- Registro de personas mediante una interfaz gráfica desarrollada con Java Swing.
- Inserción, consulta, actualización y borrado de registros en MySQL.
- Menú principal de opciones.
- Registro de personas desde el menú.
- Búsqueda de personas por DNI.
- Listado de personas.
- Listado de cursos.
- Validación de documentos.
- Control de personas duplicadas.
- Manejo de excepciones.
- Uso de colecciones mediante `ArrayList`.

## Programación Orientada a Objetos

El proyecto incorpora conceptos de Programación Orientada a Objetos aplicados al dominio del sistema.

Se implementaron:

- Encapsulamiento mediante atributos privados y métodos de acceso.
- Abstracción mediante la clase abstracta `Participante`.
- Herencia mediante la clase `Persona`, que extiende de `Participante`.
- Polimorfismo mediante el método `mostrarTipo()`.
- Constructores para la creación e inicialización de objetos.
- Creación y utilización de objetos de las clases del modelo.
- Estructuras condicionales y repetitivas.
- Manejo de excepciones mediante `ExcepcionNegocio`.

## Menú principal

La clase `MenuPrincipal.java` permite interactuar con el prototipo mediante las siguientes opciones:

1. Registrar persona.
2. Buscar persona.
3. Mostrar personas.
4. Mostrar cursos.
5. Mostrar tipo de participante.
0. Salir.

El menú utiliza estructuras `switch`, `if`, ciclos `do-while` y recorridos mediante `for`.

## Estructura principal del proyecto

- `modelo`: contiene las clases del sistema, incluyendo `Persona`, `Participante`, `Curso`, `Comision`, `Inscripcion` y `Certificacion`.
- `dao`: contiene las clases de acceso a datos y conexión con MySQL.
- `excepcion`: contiene las excepciones utilizadas para las validaciones del sistema.
- `vista`: contiene el formulario de registro de personas desarrollado con Java Swing.
- `sistemagestioncapacitacion`: contiene las clases principales para la ejecución del sistema y el menú.
- `sql`: contiene los scripts de creación, carga y consulta de la base de datos.

## Estado del prototipo

El proyecto compila correctamente en Apache NetBeans y permite ejecutar las funcionalidades implementadas en el prototipo.
