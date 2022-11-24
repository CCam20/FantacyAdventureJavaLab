import Behaviours.Weapons;
import Player.Melee.Barbarian;
import Monsters.Orc;
import Rooms.MonsterRoom;
import Rooms.TreasureRoom;
import org.junit.Before;

import java.util.HashMap;

public class BarbarianTest {

    Barbarian barbarian;
    TreasureRoom treasureRoom;

    MonsterRoom monsterRoom;

    Orc orc;

    @Before
    public void setUp(){
        barbarian = new Barbarian(Weapons.AXE, 10, 6, new HashMap<>());
        treasureRoom = new TreasureRoom(2,1);
        monsterRoom = new MonsterRoom(3, 5);
        orc = new Orc(4,10.00, 3.00);
    }



}
