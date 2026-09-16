/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

public class Certificacion {

    private String codigo;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private Inscripcion inscripcion;

    public Certificacion(String codigo,
                         LocalDate fechaEmision,
                         LocalDate fechaVencimiento,
                         Inscripcion inscripcion) {

        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.inscripcion = inscripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }
}
