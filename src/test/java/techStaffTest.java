import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class techStaffTest {

    Developer testDeveloper;
    DatabaseAdmin testAdmin;

    @Before
    public void before(){
        testDeveloper = new Developer("Zsolt", "uiop2345", 23456);
        testAdmin = new DatabaseAdmin("Jenkins", "asdfasdf", 23456);
    }

    @Test
    public void testRaiseSalary(){
        testDeveloper.raiseSalary(1000);
        testAdmin.raiseSalary(1000);
        assertEquals(24456, testDeveloper.getSalary(), 0.01);
        assertEquals(24456, testAdmin.getSalary(), 0.01);
    }

    @Test
    public void testPayBonusMethod(){
        assertEquals(234.56, testDeveloper.getPayBonus(), 0.1);
        assertEquals(234.56, testAdmin.getPayBonus(), 0.1);
    }

    @Test
    public void salaryRaiseTest(){
        testDeveloper.raiseSalary(100);
        assertEquals(23556, testDeveloper.getSalary(), 1);
    }

    @Test
    public void salaryRaiseCannotBeLessThanZero(){
        testDeveloper.raiseSalary(-434);
        assertEquals(23456, testDeveloper.getSalary(), 0.01);
    }

    @Test
    public void canChangeNameFail(){
        testDeveloper.changeName(null);
        assertEquals("Zsolt", testDeveloper.getName());
    }

    @Test
    public void canChangeNamePass(){
        testAdmin.changeName("Chewbacca");
        assertEquals("Chewbacca", testAdmin.getName());
    }
}
