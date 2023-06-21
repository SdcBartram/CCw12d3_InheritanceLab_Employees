import com.bartram.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob Smith", "QQ 123456 C", 30000.00, "Sales");
    }

    @Test
    public void hasName(){assertEquals("Bob Smith", manager.getName());}

    @Test
    public void hasNationalInsuranceNumber(){assertEquals("QQ 123456 C", manager.getNationalInsuranceNumber());}

    @Test
    public void hasSalary(){assertEquals(30000.00, manager.getSalary(),0.0);}

    @Test
    public void hasDeptName(){assertEquals("Sales", manager.getDeptName());}

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000.00);
        assertEquals(35000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(300, manager.payBonus(), 0.0);
    }
}
