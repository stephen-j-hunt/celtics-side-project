package com.sideproject.celticssideproject.dao;

import com.sideproject.celticssideproject.model.Player;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcPlayerDao implements PlayerDao {
    private final JdbcTemplate jdbcTemplate;
    public JdbcPlayerDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
private static List<Player>players= new ArrayList<>();

    @Override
    public Player getPlayerStatsById(int id) {
        Player player=null;
        String sql = "SELECT player_id, player_name, \"position\", points_per_game, assists_per_game, rebounds_per_game, field_goal_percentage, three_point_percentage, free_throw_percentage\n" +
                "\tFROM player_stats\n" +
                "\tWHERE player_id=?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            player =mapRowToPlayerStats(results);
        }
        return player;
    }

        private Player mapRowToPlayerStats (SqlRowSet rs){
            Player playerStats = new Player();
            playerStats.setPlayerId(rs.getInt("player_id"));
            playerStats.setPlayerName(rs.getString("player_name"));
            playerStats.setPosition(rs.getString("position"));
            playerStats.setPointsPerGame(rs.getString("points_per_game"));
            playerStats.setAssistsPerGame(rs.getString("assists_per_game"));
            playerStats.setReboundsPerGame(rs.getString("rebounds_per_game"));
            playerStats.setFieldGoalPercentage(rs.getString("field_goal_percentage"));
            playerStats.setThreePointPercentage(rs.getString("three_point_percentage"));
            playerStats.setFreeThrowPercentage(rs.getString("free_throw_percentage"));
            return playerStats;

    }
}
