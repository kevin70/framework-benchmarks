package hello.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import hello.domain.World;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@Repository
public class WorldRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public World getById(final long id) {
        return jdbcTemplate.query("select * from world where id=?", ps -> ps.setLong(1, id), new ResultSetExtractor<World>() {
            @Override
            public World extractData(ResultSet rs) throws SQLException, DataAccessException {
                return new World(rs.getLong("id"), rs.getInt("randomNumber"));
            }
        });
    }

}
