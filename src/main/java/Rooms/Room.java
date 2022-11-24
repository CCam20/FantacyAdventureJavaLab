package Rooms;

import Monsters.Monster;
import Player.Player;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Monster> monsters;
    private ArrayList<Player> players;
    int gold;
    int gems;

    public Room(int gold, int gems ){
        this.gold= gold;
        this.gems = gems;
        this.monsters = new ArrayList<Monster>();
    }
    public int getGold(){
        return this.gold;
    }
    public int getGems(){
        return this.gems;
    }
}

