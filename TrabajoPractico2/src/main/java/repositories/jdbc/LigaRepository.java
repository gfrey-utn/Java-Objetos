package repositories.jdbc;
import java.sql.Connection;
import repositories.interfaces.I_LigaRepository;
public class LigaRepository implements I_LigaRepository {
    private Connection conn;
    public LigaRepository(Connection conn) { this.conn = conn; }
}
