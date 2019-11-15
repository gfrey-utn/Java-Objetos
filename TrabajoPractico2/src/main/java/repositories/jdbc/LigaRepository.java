package repositories.jdbc;
import entities.Liga;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import repositories.interfaces.I_LigaRepository;
public class LigaRepository implements I_LigaRepository {
    private Connection conn;
    public LigaRepository(Connection conn) { this.conn = conn; }

    @Override public void save(Liga liga) {
        if(liga == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into ligas(pais_id,nombre,division) values (?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setInt(1, liga.getPais_id());
            ps.setString(2, liga.getNombre());
            ps.setInt(3, liga.getDivision());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) liga.setId(rs.getInt(1));
            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void remove(Liga liga) {
        if (liga == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "delete from ligas where id = ?")) {
            ps.setInt(1, liga.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void update(Liga liga) {
        if (liga == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "update set ligas pais_id=?, nombre=?, division=? where id=?"
            )) {
                ps.setInt(1, liga.getPais_id());
                ps.setString(2, liga.getNombre());
                ps.setInt(3, liga.getDivision());
                ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Liga> getAll() {
        List<Liga> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from ligas");){
            while (rs.next()) {
                list.add(new Liga(
                        rs.getInt("id"),
                        rs.getInt("pais_id"),
                        rs.getString("nombre"),
                        rs.getInt("division")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
}
