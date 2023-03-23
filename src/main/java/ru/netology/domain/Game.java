package ru.netology.domain;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {

    //    List<Player> players = new ArrayList<>();
    HashMap<String, Integer> players = new HashMap<>();

    public void register(Player player) {
        players.put(player.getName(), player.getStrength());
    }

    public Integer find(String playerName) {
        if (players.isEmpty()) {
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


    public Integer round(String playerName1, String playerName2) {
        Integer player1 = players.get(playerName1);
        Integer player2 = players.get(playerName2);
//
//        //for (String name : players.keySet()) {
//            if (player1.equals(playerName1)) {
//                player1 = playerName1;
//            }
//            if (name.equals(playerName2)) {
//                player2 = playerName2;
//            }
//        }
        if (player1 == null) {
            throw new NotRegisteredException(playerName1);
        }
        if (player2 == null) {
            throw new NotRegisteredException(playerName2);
        }

        if (players.get(playerName1) > players.get(playerName2)) {
            return 1;
        }
        if (players.get(playerName2) > players.get(playerName1)) {
            return 2;

        }
        return 0;

    }
}