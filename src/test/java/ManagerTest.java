import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager testManager;

    @Before
    public void before(){
        testManager = new Manager("David", "ASDF1234", 37000,"Development");
    }

    @Test
    public void managerHasDept(){
        assertEquals("Development", testManager.getDeptName());
    }
}
