import com.bartram.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
    developer = new Developer("Koos Visagie", "GG 123456 C", 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Koos Visagie", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){assertEquals("GG 123456 C", developer.getNationalInsuranceNumber());}

    @Test
    public void hasSalary(){assertEquals(30000.00, developer.getSalary(),0.0);}

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(3000.00);
        assertEquals(33000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(300, developer.payBonus(), 0.0);
    }
}
