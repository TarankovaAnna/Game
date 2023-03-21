package ru.netology.domain;

import java.util.HashMap;

public class Game {
    HashMap<String, Integer> players = new HashMap<>();

    public void register(Player player) {
        players.put(player.getName(), player.getStrength());
    }

    public Integer find(String playerName) {
        if (players.size() == 0) {
            throw new NoOneIsRegisteredException();

        }
        for (String name : players.keySet()) {

            if
            (name.equals(playerName)) {
                return players.get(name);
            }
        }
        throw new NotRegisteredException(playerName);
    }
}