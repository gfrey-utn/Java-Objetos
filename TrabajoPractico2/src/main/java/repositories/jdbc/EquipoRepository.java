package repositories.jdbc;
import entities.Equipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import repositories.interfaces.I_EquipoRepository;
public class EquipoRepository implements I_EquipoRepository{
    private Connection conn;
    public EquipoRepository(Connection conn) { this.conn = conn; }

    @Override public void save(Equipo equipo) {
        if (equipo == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "insert into equipos (nombre,liga_id) values (?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setString(1, equipo.getNombre());
            ps.setInt(2, equipo.getLiga_id());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) equipo.setId(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void remove(Equipo equipo) {
        if (equipo == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "delete from equipos where id = ?")) {
            ps.setInt(1, equipo.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void update(Equipo equipo) {
        if (equipo == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "update equipos set nombre=?, liga_id=? where id=?"
        )){
           ps.setString(1, equipo.getNombre());
           ps.setInt(2, equipo.getLiga_id());
           ps.setInt(3, equipo.getId());
           ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Equipo> getAll() {
        List<Equipo> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from equipos");){
            while (rs.next()) {
                list.add(new Equipo(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("liga_id")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
}
