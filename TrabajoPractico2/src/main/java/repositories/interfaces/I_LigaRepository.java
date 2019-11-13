package repositories.interfaces;
import entities.Liga;
import entities.Pais;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public interface I_LigaRepository {
    void save(Liga liga);
    void remove(Liga liga);
    void update(Liga liga);
    
    List<Liga> getAll();
    default Liga getById(int id){
        return getAll()
                .stream()
                .filter(l->l.getId() == id)
                .findFirst()
                .orElse(new Liga());
    }
    
    default List<Liga> getByPais(Pais pais){
        if (pais == null) return new ArrayList<>();
        return getAll()
                .stream()
                .filter(l->l.getPais_id() == pais.getId())
                .collect(Collectors.toList());                
    }
    
    default List<Liga> getLikeNombre(String nombre){
        if (nombre == null) return new ArrayList<>();
        return getAll()
                .stream()
                .filter(l->l.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Liga> getByDivision(int division){
        return getAll()
                .stream()
                .filter(l->l.getDivision() == division)
                .collect(Collectors.toList());
    }
    
}
