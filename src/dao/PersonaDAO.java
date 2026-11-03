/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import excepcion.ExcepcionNegocio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public Persona buscarPorDocumento(int documento)
        throws SQLException, ExcepcionNegocio {

    String sql = "SELECT * FROM persona WHERE documento = ?";

    try (Connection con = ConexionBD.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, documento);

        try (ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return new Persona(
                        rs.getInt("documento"),
                        rs.getString("apellido"),
                        rs.getString("nombre"),
                        rs.getString("jerarquia")
                );
            }
        }
    }

    return null;
}


public ArrayList<Persona> listar()
        throws SQLException, ExcepcionNegocio {

    ArrayList<Persona> personas = new ArrayList<>();

    String sql = "SELECT * FROM persona ORDER BY apellido, nombre";

    try (Connection con = ConexionBD.conectar();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            Persona persona = new Persona(
                    rs.getInt("documento"),
                    rs.getString("apellido"),
                    rs.getString("nombre"),
                    rs.getString("jerarquia")
            );

            personas.add(persona);
        }
    }

    return personas;
}


public void actualizar(Persona persona) throws SQLException {

    String sql = "UPDATE persona "
            + "SET apellido = ?, nombre = ?, jerarquia = ?, activo = ? "
            + "WHERE documento = ?";

    try (Connection con = ConexionBD.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, persona.getApellido());
        ps.setString(2, persona.getNombre());
        ps.setString(3, persona.getJerarquia());
        ps.setBoolean(4, persona.isActivo());
        ps.setInt(5, persona.getDocumento());

        ps.executeUpdate();
    }
}


public void eliminar(int documento) throws SQLException {

    String sql = "DELETE FROM persona WHERE documento = ?";

    try (Connection con = ConexionBD.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, documento);

        ps.executeUpdate();
    }
}
}
