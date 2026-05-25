package co.edu.poli.servicios;
 
import java.util.List;
 

public interface Operacioncrud<T> {
 
    void create(T t);
 
    T read(String codigo);
 
    boolean update(T t);

    boolean delete(String codigo);
 

    List<T> list();
}