import Behaviours.Weapons;
import Melee.Barbarian;
import org.junit.Before;

import java.util.HashMap;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void setUp(){
        barbarian = new Barbarian(Weapons.AXE, 10, 6, new HashMap<>());
    }
}
