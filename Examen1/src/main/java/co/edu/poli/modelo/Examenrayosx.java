package co.edu.poli.modelo;
 
import java.io.Serializable;
import java.time.LocalDate;

public class Examenrayosx extends Examenmedico implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private String zonaCuerpo;
    private double nivelRadiacion;
 
 
    public Examenrayosx() {}
 
   
    public Examenrayosx(String codigo, String nombrePaciente, LocalDate fechaRealizacion,
                        double costo, String zonaCuerpo, double nivelRadiacion) {
        super(codigo, nombrePaciente, fechaRealizacion, costo);
        this.zonaCuerpo = zonaCuerpo;
        this.nivelRadiacion = nivelRadiacion;
    }
 
 
    public String getZonaCuerpo() {
        return zonaCuerpo;
    }
 
    public void setZonaCuerpo(String zonaCuerpo) {
        this.zonaCuerpo = zonaCuerpo;
    }
 
    public double getNivelRadiacion() {
        return nivelRadiacion;
    }
 
    public void setNivelRadiacion(double nivelRadiacion) {
        this.nivelRadiacion = nivelRadiacion;
    }
 
    @Override
    public String getDetallesEspecificos() {
        return "Zona: " + zonaCuerpo + " | Radiación: " + nivelRadiacion + " mGy";
    }
 
    @Override
    public String toString() {
        return "[RAYOS X] " + super.toString() + " | " + getDetallesEspecificos();
    }
}