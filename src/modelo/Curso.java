/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Curso {

    private int idCurso;
    private String codigo;
    private String nombre;
    private int cargaHoraria;

    public Curso(int idCurso, String codigo, String nombre, int cargaHoraria) {
        this.idCurso = idCurso;
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
