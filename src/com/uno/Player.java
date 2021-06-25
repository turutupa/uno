package com.uno;

import java.util.ArrayList;

public class Player {
    final String name;
    public ArrayList<Card> hand = new ArrayList<>();

    Player(String name) {
        this.name = name;
    }

    public static Player named(String name) {
        return new Player(name);
    }
}
