package co.edu.poli.modelo;
 
import java.io.Serializable;
import java.time.LocalDate;
 

public abstract class Examenmedico implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private String codigo;
    private String nombrePaciente;
    private LocalDate fechaRealizacion;
    private double costo;
 
  
    public Examenmedico() {}
 
    public Examenmedico(String codigo, String nombrePaciente, LocalDate fechaRealizacion, double costo) {
        this.codigo = codigo;
        this.nombrePaciente = nombrePaciente;
        this.fechaRealizacion = fechaRealizacion;
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }
 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
    public String getNombrePaciente() {
        return nombrePaciente;
    }
 
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
 
    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }
 
    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
 
    public double getCosto() {
        return costo;
    }
 
    public void setCosto(double costo) {
        this.costo = costo;
    }
 
    public abstract String getDetallesEspecificos();
 

    public String toString() {
        return "Codigo: " + codigo +
               " | Paciente: " + nombrePaciente +
               " | Fecha: " + fechaRealizacion +
               " | Costo: $" + costo;
    }
}
 
