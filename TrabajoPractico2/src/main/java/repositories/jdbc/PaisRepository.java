package repositories.jdbc;
import entities.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import repositories.interfaces.I_PaisRepository;
public class PaisRepository implements I_PaisRepository {
    private Connection conn;
    public PaisRepository(Connection conn) { this.conn = conn; }

    @Override public void save(Pais pais) {
        if (pais == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "insert into paises(nombre) values (?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setString(1, pais.getNombre());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) pais.setId(rs.getInt(1));
            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void remove(Pais pais) {
        if (pais == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "delete from paises where id = ?")) {
            ps.setInt(1, pais.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void update(Pais pais) {
        if (pais == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "update paises set nombre=? where id=?"
        )){
            ps.setString(1, pais.getNombre());
            ps.setInt(2, pais.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Pais> getAll() {
        List<Pais> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from paises");){
            while(rs.next()){
                list.add(new Pais(
                        rs.getInt("id"),
                        rs.getString("nombre")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
    
}
