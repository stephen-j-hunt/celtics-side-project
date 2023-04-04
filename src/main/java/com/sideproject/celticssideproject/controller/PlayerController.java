package com.sideproject.celticssideproject.controller;

import com.sideproject.celticssideproject.dao.JdbcPlayerDao;
import com.sideproject.celticssideproject.dao.PlayerDao;
import com.sideproject.celticssideproject.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/player_stats")
@RestController
public class PlayerController {
private PlayerDao playerDao;

    public PlayerController(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    @GetMapping("/{id}")
    public Player getPlayerStatsById(@PathVariable int id) {
        return playerDao.getPlayerStatsById(id);
    }
}
