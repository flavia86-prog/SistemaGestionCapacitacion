/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Persona;

public class PersonaDAO {

    public boolean existeDocumento(int documento) throws SQLException {

        String sql = "SELECT COUNT(*) FROM persona WHERE documento = ?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, documento);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }

        return false;
    }

    public void insertar(Persona persona) throws SQLException {

        String sql = "INSERT INTO persona "
                + "(documento, apellido, nombre, jerarquia, activo) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, persona.getDocumento());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getNombre());
            ps.setString(4, persona.getJerarquia());
            ps.setBoolean(5, persona.isActivo());

            ps.executeUpdate();
        }
    }
}