package co.edu.poli.servicios;
 
import java.util.List;
 
/**
 * Interfaz que define las operaciones CRUD genéricas.
 * Toda implementación de acceso a datos debe cumplir este contrato.
 *
 * @param <T> Tipo de objeto a gestionar
 */
public interface Operacioncrud<T> {
 
    /**
     * Crea / registra un nuevo objeto.
     * @param t objeto a registrar
     */
    void create(T t);
 
    /**
     * Lee / busca un objeto por su código identificador.
     * @param codigo identificador del objeto
     * @return objeto encontrado, o null si no existe
     */
    T read(String codigo);
 
    /**
     * Actualiza un objeto existente.
     * @param t objeto con los nuevos datos (se identifica por su código)
     * @return true si fue actualizado, false si no se encontró
     */
    boolean update(T t);
 
    /**
     * Elimina un objeto por su código identificador.
     * @param codigo identificador del objeto a eliminar
     * @return true si fue eliminado, false si no se encontró
     */
    boolean delete(String codigo);
 
    /**
     * Lista todos los objetos registrados.
     * @return lista completa de objetos
     */
    List<T> list();
}