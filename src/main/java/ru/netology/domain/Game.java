package ru.netology.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {
    HashMap<String, Integer> players = new HashMap<>();
    //List<Player> players1 = new ArrayList<>();

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

//    public int round(String playerName1, String playerName2) {
//        Player player1 = null;
//        Player player2 = null;
//        for (Player player : players1) {
//            if (player.getName().equals(playerName1)) {
//                player1 = player;
//            }
//            if (player.getName().equals(playerName2)) {
//                player2 = player;
//            }
//        }
//        if (player1 == null) {
//            throw new NotRegisteredException(playerName1);
//        }
//        if (player2 == null) {
//            throw new NotRegisteredException(playerName2);
//        }
//
//        if (player1.getStrength() > player2.getStrength()) {
//            return 1;
//        }
//        if (player2.getStrength() > player1.getStrength()) {
//            return 2;
//
//        }
//        return 0;
//
//    }
}