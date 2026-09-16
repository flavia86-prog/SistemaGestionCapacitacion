/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Persona;

public class PruebaInsertarPersona {

    public static void main(String[] args) {

        try {
            Persona persona = new Persona(
                    33087252,
                    "Degregorio",
                    "Guillermo",
                    "Cabo"
            );

            PersonaDAO dao = new PersonaDAO();

            if (dao.existeDocumento(persona.getDocumento())) {
                System.out.println("La persona ya existe.");
            } else {
                dao.insertar(persona);
                System.out.println("Persona registrada correctamente.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}