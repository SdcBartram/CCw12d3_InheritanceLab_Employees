import com.bartram.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Frikkie Van Der Merwe", "PP 123456 H", 28000.00);
    }
    @Test
    public void hasName(){
        assertEquals("Frikkie Van Der Merwe", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){assertEquals("PP 123456 H", databaseAdmin.getNationalInsuranceNumber());}

    @Test
    public void hasSalary(){assertEquals(28000.00, databaseAdmin.getSalary(),0.0);}

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1500.00);
        assertEquals(29500.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(280, databaseAdmin.payBonus(), 0.0);
    }
}
