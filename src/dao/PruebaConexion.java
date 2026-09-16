/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;

public class PruebaConexion {

    public static void main(String[] args) {

        try {
            Connection con = ConexionBD.conectar();
            System.out.println("Conexión correcta con MySQL.");
            con.close();

        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}

