# Sistema de Gestión de Capacitación

Proyecto desarrollado para la materia Seminario de Práctica de la Licenciatura en Informática.

El sistema tiene como objetivo mejorar la gestión de capacitaciones del Comité Técnico de Capacitación, permitiendo registrar personas, cursos, comisiones, inscripciones y certificaciones.

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

sgc_ctc

Dentro de la carpeta `sql` se incluyen los siguientes archivos:

- `01_creacion_tablas.sql`: crea la base de datos y las tablas.
- `02_datos_prueba.sql`: contiene datos de prueba.
- `03_consultas.sql`: contiene consultas, actualización y borrado de registros.

## Ejecución del proyecto

1. Crear la base de datos ejecutando `01_creacion_tablas.sql`.
2. Ejecutar `02_datos_prueba.sql` para cargar datos de prueba.
3. Agregar MySQL Connector/J a las Libraries del proyecto en NetBeans.
4. Configurar el usuario y la contraseña de MySQL en la clase `ConexionBD.java`.
5. Ejecutar el proyecto desde Apache NetBeans.

## Funciones implementadas en el prototipo

- Conexión entre Java y MySQL.
- Consulta de personas por documento.
- Registro de personas desde Java.
- Registro de personas mediante una interfaz gráfica desarrollada con Java Swing.
- Inserción, consulta, actualización y borrado de registros en MySQL.

## Estructura principal

- `modelo`: contiene las clases del sistema.
- `dao`: contiene las clases de acceso a datos.
- `vista`: contiene el formulario de registro de personas.
- `sql`: contiene los scripts de la base de datos.

## Autora

Flavia Eliana Almonacid
