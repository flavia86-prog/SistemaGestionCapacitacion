/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import excepcion.ExcepcionNegocio;

public class Persona extends Participante {

    private String jerarquia;
    private boolean activo;

    public Persona(int documento, String apellido, String nombre, String jerarquia)
            throws ExcepcionNegocio {

        super(documento, apellido, nombre);

        if (documento < 1000000 || documento > 99999999) {
            throw new ExcepcionNegocio("El documento no es válido.");
        }

        this.jerarquia = jerarquia;
        this.activo = true;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String mostrarTipo() {
        return "Bombero";
    }
}
