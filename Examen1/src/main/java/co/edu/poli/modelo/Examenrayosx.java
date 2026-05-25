package co.edu.poli.modelo;
 
import java.io.Serializable;
import java.time.LocalDate;
 
public class Examenrayosx extends Examenmedico implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private String zona;
    private String nivelRadiacion; 
 
    public Examenrayosx() {}
 
    public Examenrayosx(String codigo, String nombrePaciente,
                        LocalDate fechaRealizacion, double costo,
                        String zona, String nivelRadiacion) {
        super(codigo, nombrePaciente, fechaRealizacion, costo);
        this.zona = zona;
        this.nivelRadiacion = nivelRadiacion;
    }
 
    public String getZona() { return zona; }
    public void setZona(String zona) { this.zona = zona; }
 
    public String getNivelRadiacion() { return nivelRadiacion; }
    public void setNivelRadiacion(String nivelRadiacion) { this.nivelRadiacion = nivelRadiacion; }
 
    @Override
    public String getDetallesEspecificos() {
        return "Zona: " + zona + " | Radiación: " + nivelRadiacion;
    }
 
    @Override
    public String toString() {
        return "[RAYOS X] " + super.toString() + " | " + getDetallesEspecificos();
    }
}
 