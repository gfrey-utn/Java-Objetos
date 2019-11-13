package repositories.interfaces;
import entities.Pais;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public interface I_PaisRepository {
    void save(Pais pais);
    void remove(Pais pais);
    void update(Pais pais);
    
    List<Pais> getAll();
    default Pais getById(int id){
        return getAll()
                .stream()
                .filter(p->p.getId() == id)
                .findFirst()
                .orElse(new Pais());
    }
    
    default List<Pais> getLikeNombre(String nombre){
        if (nombre == null) return new ArrayList<>();
        return getAll()
                .stream()
                .filter(p->p.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
}
