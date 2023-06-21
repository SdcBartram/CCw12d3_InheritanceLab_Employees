import com.bartram.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Gertrude Johannes", "QQ 789456 C", 40000.00, "Operations", 200000.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(200000.00, director.getBudget(),0.0);
    }

    @Test
    public void hasName(){assertEquals("Gertrude Johannes", director.getName());}

    @Test
    public void hasNationalInsuranceNumber(){assertEquals("QQ 789456 C", director.getNationalInsuranceNumber());}

    @Test
    public void hasSalary(){assertEquals(40000.00, director.getSalary(),0.0);}

    @Test
    public void hasDeptName(){assertEquals("Operations", director.getDeptName());}

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000.00);
        assertEquals(41000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(400, director.payBonus(), 0.0);
    }
}
