/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import excepcion.ExcepcionNegocio;

public class Persona {

    private int documento;
    private String apellido;
    private String nombre;
    private String jerarquia;
    private boolean activo;

    public Persona(int documento, String apellido, String nombre, String jerarquia)
            throws ExcepcionNegocio {

        if (documento < 1000000 || documento > 99999999) {
            throw new ExcepcionNegocio("El documento no es válido.");
        }

        this.documento = documento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.jerarquia = jerarquia;
        this.activo = true;
    }

    public int getDocumento() {
        return documento;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getNombreCompleto() {
        return apellido + ", " + nombre;
    }
}

