import Behaviours.HealingTools;
import Behaviours.Spells;
import Behaviours.Weapons;
import Monsters.DemiGorgon;
import Monsters.Monster;
import Monsters.Ogre;
import Monsters.Orc;
import Player.Cleric.Cleric;
import Player.Melee.Barbarian;
import Player.Melee.Dwarf;
import Player.Player;
import Player.Spellcaster.Wizard;
import Rooms.MonsterRoom;
import Rooms.Room;
import Rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Player player3;
    Room room1;
    Room room2;
    Monster monster1;
    Monster monster2;
    Monster monster3;

    @Before
    public void setUp(){
        player1 = new Barbarian(Weapons.AXE, 10, 2, new HashMap<>());
        player2 = new Wizard(Spells.FIREBALL, 10, 4, new HashMap<>());
        player3 = new Cleric(HealingTools.HERBS, 10, 5, new HashMap<>());
        room1 = new TreasureRoom(5, 2);
        room2 = new MonsterRoom(3, 1);
        monster1 = new Ogre(6, 10, 3);
        monster2 = new DemiGorgon(8, 10, 4);
        monster3 = new Orc(6, 10, 2);
    }

    @Test
    public void playerCanTakeDamage(){
//        double dam = monster1.getAttack();
//        player1.takeDamage(dam);
//        System.out.println((monster1.getAttack()));
//        assertEquals(4, player1.getHealth(), 0.0);
        assertEquals(4 , player1.takeDamage(monster1.getAttack()), 0.0);
    }

    @Test
    public void playerCanAttack(){
        assertEquals(4, monster1.takeDamage(player1.attack()), 0.0);
    }

    @Test
    public void canPlayersCanClearRoom(){
        assertEquals(4, monster1.takeDamage(player1.attack()), 0.0);
        assertEquals(4 , player1.takeDamage(monster1.getAttack()), 0.0);
        assertEquals(2, monster1.takeDamage(player2.attack()), 0.0);
        player1.addGold(room1.getGold());
        assertEquals(5, player1.getGold());
    }

    @Test
    public void clericCanHealPlayer(){
        player1.heal(player3.healPlayer());
System.out.println(player3.healPlayer());

        assertEquals(12, player1.getHealth(), 0.0);


    }

}
