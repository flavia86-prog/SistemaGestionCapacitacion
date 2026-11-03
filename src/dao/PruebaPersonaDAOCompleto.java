package dao;

import excepcion.ExcepcionNegocio;
import java.sql.SQLException;
import modelo.Persona;

public class PruebaPersonaDAOCompleto {

    public static void main(String[] args) {

        PersonaDAO dao = new PersonaDAO();

        try {
            System.out.println("=== PRUEBA ACTUALIZAR ===");

            Persona persona = dao.buscarPorDocumento(35888999);

            if (persona != null) {
                Persona personaActualizada = new Persona(
                        persona.getDocumento(),
                        persona.getApellido(),
                        persona.getNombre(),
                        "Cabo"
                );

                dao.actualizar(personaActualizada);

                Persona resultado = dao.buscarPorDocumento(35888999);

                System.out.println("DNI: " + resultado.getDocumento());
                System.out.println("Apellido: " + resultado.getApellido());
                System.out.println("Nombre: " + resultado.getNombre());
                System.out.println("Nueva jerarquia: " + resultado.getJerarquia());
            }

            System.out.println();
            System.out.println("=== PRUEBA ELIMINAR ===");

            int dniPrueba = 99999998;

            if (!dao.existeDocumento(dniPrueba)) {

                Persona temporal = new Persona(
                        dniPrueba,
                        "Prueba",
                        "Temporal",
                        "Bombero"
                );

                dao.insertar(temporal);

                System.out.println("Persona temporal insertada.");

                dao.eliminar(dniPrueba);

                if (!dao.existeDocumento(dniPrueba)) {
                    System.out.println("Persona temporal eliminada correctamente.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error de base de datos: " + e.getMessage());

        } catch (ExcepcionNegocio e) {
            System.out.println("Error de negocio: " + e.getMessage());
        }
    }
}
