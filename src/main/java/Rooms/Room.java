package Rooms;

import Behaviours.IPlayer;
import Monsters.Monster;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Monster> monsters;
    private ArrayList<IPlayer> players;
    int gold;
    int gems;

    public Room(int gold, int gems ){
        this.gold= 0;
        this.gems = 0;
        this.monsters = new ArrayList<Monster>();
    }
    public int getGold(){
        return this.gold;
    }
    public int getGems(){
        return this.gems;
    }
}

