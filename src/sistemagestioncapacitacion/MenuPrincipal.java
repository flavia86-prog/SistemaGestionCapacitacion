package sistemagestioncapacitacion;

import excepcion.ExcepcionNegocio;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Participante;
import modelo.Persona;
import modelo.Curso;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        int opcion;

        try {
            personas.add(new Persona(39115238, "Barone", "Gian Franco", "Cabo"));
            personas.add(new Persona(41430503, "Valenzuela", "Lucas", "Bombero"));
            personas.add(new Persona(47556041, "Ibarrola", "Luney", "Bombero"));
            cursos.add(new Curso(1, "RVL01", "Rescate Vehicular Liviano", 16));
            cursos.add(new Curso(2, "MATPEL01", "Materiales Peligrosos", 20));
            cursos.add(new Curso(3, "SEG01", "Seguridad del Bombero", 8));
        } catch (ExcepcionNegocio e) {
            System.out.println("Error al cargar personas: " + e.getMessage());
        }

        do {
            System.out.println("==================================");
            System.out.println(" SISTEMA DE GESTION DE CAPACITACION");
            System.out.println("==================================");
            System.out.println("1. Registrar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Mostrar personas");
            System.out.println("4. Mostrar cursos");
            System.out.println("5. Mostrar tipo de participante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

             case 1:
    try {
        System.out.print("Ingrese DNI: ");
        int nuevoDni = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = teclado.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese jerarquia: ");
        String jerarquia = teclado.nextLine();

        Persona nuevaPersona =
                new Persona(nuevoDni, apellido, nombre, jerarquia);

        boolean existe = false;

        for (Persona persona : personas) {
            if (persona.getDocumento() == nuevoDni) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("La persona ya esta registrada.");
        } else {
            personas.add(nuevaPersona);
            System.out.println("Persona registrada correctamente.");
        }

    } catch (ExcepcionNegocio e) {
        System.out.println("Error: " + e.getMessage());
    }

    break;

                case 2:
                    System.out.print("Ingrese DNI a buscar: ");
                    int dniBuscado = teclado.nextInt();

                    boolean encontrado = false;

                    for (Persona persona : personas) {
                        if (persona.getDocumento() == dniBuscado) {
                            System.out.println("Persona encontrada:");
                            System.out.println("DNI: " + persona.getDocumento());
                            System.out.println("Apellido: " + persona.getApellido());
                            System.out.println("Nombre: " + persona.getNombre());
                            System.out.println("Jerarquia: " + persona.getJerarquia());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("La persona no fue encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("LISTADO DE PERSONAS");

                    for (Persona persona : personas) {
                        System.out.println(
                                persona.getDocumento() + " - "
                                + persona.getApellido() + ", "
                                + persona.getNombre() + " - "
                                + persona.getJerarquia()
                        );
                    }
                    break;

               case 4:
    System.out.println("LISTADO DE CURSOS");

    for (Curso curso : cursos) {
        System.out.println(
                curso.getIdCurso() + " - "
                + curso.getCodigo() + " - "
                + curso.getNombre() + " - "
                + curso.getCargaHoraria() + " horas"
        );
    }

    break;

                case 5:
                    if (!personas.isEmpty()) {
                        Participante participante = personas.get(0);

                        System.out.println(
                                "Tipo de participante: "
                                + participante.mostrarTipo()
                        );
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

            System.out.println();

        } while (opcion != 0);

        teclado.close();
    }
}
