package repositories.interfaces;
import entities.Equipo;
import entities.Liga;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public interface I_EquipoRepository {
    void save(Equipo equipo);
    void remove(Equipo equipo);
    void update(Equipo equipo);
    
    List<Equipo> getAll();
    default Equipo getById(int id){
        return getAll()
                .stream()
                .filter(e->e.getId() == id)
                .findFirst()
                .orElse(new Equipo());
    }
    
    default List<Equipo> getLikeNombre(String nombre){
        if (nombre == null) return new ArrayList<>();
        return getAll()
                .stream()
                .filter(e->e.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Equipo> getByLiga(Liga liga){
        if (liga == null) return new ArrayList<>();
        return getAll()
                .stream()
                .filter(e->e.getLiga_id() == liga.getId())
                .collect(Collectors.toList());
    }
    
}
