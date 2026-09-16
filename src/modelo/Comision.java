/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import excepcion.ExcepcionNegocio;
import java.util.ArrayList;
import java.util.List;

public class Comision {

    private int idComision;
    private Curso curso;
    private int cupo;
    private String estado;
    private List<Inscripcion> inscripciones;

    public Comision(int idComision, Curso curso, int cupo) {
        this.idComision = idComision;
        this.curso = curso;
        this.cupo = cupo;
        this.estado = "ABIERTA";
        this.inscripciones = new ArrayList<>();
    }

    public Inscripcion inscribir(Persona persona) throws ExcepcionNegocio {

        if (!estado.equals("ABIERTA")) {
            throw new ExcepcionNegocio("La comisión no admite inscripciones.");
        }

        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getPersona().getDocumento() == persona.getDocumento()) {
                throw new ExcepcionNegocio("La persona ya está inscripta.");
            }
        }

        if (inscripciones.size() >= cupo) {
            throw new ExcepcionNegocio("No hay cupo disponible.");
        }

        Inscripcion nuevaInscripcion = new Inscripcion(persona, this);
        inscripciones.add(nuevaInscripcion);

        return nuevaInscripcion;
    }

    public int getIdComision() {
        return idComision;
    }

    public Curso getCurso() {
        return curso;
    }

    public int getCupo() {
        return cupo;
    }

    public String getEstado() {
        return estado;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void cerrar() {
        estado = "CERRADA";
    }
}