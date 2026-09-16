/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Inscripcion {

    private Persona persona;
    private Comision comision;
    private String condicionFinal;
    private Double nota;

    public Inscripcion(Persona persona, Comision comision) {
        this.persona = persona;
        this.comision = comision;
        this.condicionFinal = "PENDIENTE";
        this.nota = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public Comision getComision() {
        return comision;
    }

    public String getCondicionFinal() {
        return condicionFinal;
    }

    public Double getNota() {
        return nota;
    }

    public void registrarResultado(String condicionFinal, Double nota) {
        this.condicionFinal = condicionFinal;
        this.nota = nota;
    }
}