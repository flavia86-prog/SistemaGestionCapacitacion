/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

public class PruebaPersonaDAO {

    public static void main(String[] args) {

        try {
            PersonaDAO dao = new PersonaDAO();

            boolean existe = dao.existeDocumento(47556041);

            if (existe) {
                System.out.println("La persona existe en la base de datos.");
            } else {
                System.out.println("La persona no existe.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
