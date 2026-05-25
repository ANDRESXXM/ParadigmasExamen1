package co.edu.poli.servicios;
 
import co.edu.poli.modelo.Examenrayosx;
 
import java.io.*;
import java.util.ArrayList;
import java.util.List;
 

public class Implementacionoperacioncrud implements Operacioncrud<Examenrayosx> {
 
    private static final String ARCHIVO_DATOS = "examenes_rayosx.dat";
 
    private List<Examenrayosx> listaExamenes;
 
    public Implementacionoperacioncrud() {
        this.listaExamenes = new ArrayList<>();
    }
 
    
    public void create(Examenrayosx examen) {
        if (examen == null) {
            throw new IllegalArgumentException("El examen no puede ser nulo.");
        }
        if (read(examen.getCodigo()) != null) {
            throw new IllegalArgumentException(
                "Ya existe un examen con el código: " + examen.getCodigo());
        }
        listaExamenes.add(examen);
    }
 
  
    public Examenrayosx read(String codigo) {
        return listaExamenes.stream()
                .filter(e -> e.getCodigo().equalsIgnoreCase(codigo))
                .findFirst()
                .orElse(null);
    }
 
   
    public boolean update(Examenrayosx examenActualizado) {
        for (int i = 0; i < listaExamenes.size(); i++) {
            if (listaExamenes.get(i).getCodigo()
                    .equalsIgnoreCase(examenActualizado.getCodigo())) {
                listaExamenes.set(i, examenActualizado);
                return true;
            }
        }
        return false;
    }
 
  
    public boolean delete(String codigo) {
        return listaExamenes.removeIf(
                e -> e.getCodigo().equalsIgnoreCase(codigo));
    }
 
    public List<Examenrayosx> list() {
        return new ArrayList<>(listaExamenes);
    }
 
   
    public void serializar() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ARCHIVO_DATOS))) {
            oos.writeObject(listaExamenes);
        }
    }
 

    @SuppressWarnings("unchecked")
    public void deserializar() throws IOException, ClassNotFoundException {
        File archivo = new File(ARCHIVO_DATOS);
        if (!archivo.exists()) {
            return;
        }
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(ARCHIVO_DATOS))) {
            List<Examenrayosx> cargados = (List<Examenrayosx>) ois.readObject();
            listaExamenes.clear();
            listaExamenes.addAll(cargados);
        }
    }
 
  
    public boolean existeArchivo() {
        return new File(ARCHIVO_DATOS).exists();
    }
 
    public int total() {
        return listaExamenes.size();
    }
}