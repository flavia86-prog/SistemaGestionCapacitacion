package modelo;

public abstract class Participante {

    private int documento;
    private String apellido;
    private String nombre;

    public Participante(int documento, String apellido, String nombre) {
        this.documento = documento;
        this.apellido = apellido;
        this.nombre = nombre;
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

    public abstract String mostrarTipo();
}
