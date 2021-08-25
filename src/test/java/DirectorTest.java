import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director testDirector;

    @Before
    public void before() {
        testDirector = new Director("!Sergio", "hjkl5678", 1000000, "AlphaDogg", 1234567);
    }

    @Test
    public void directorCanGetBudget(){
        assertEquals(1234567, testDirector.getBudget(), 0.001);
    }
}



