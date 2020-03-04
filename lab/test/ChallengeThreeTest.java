import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChallengeThreeTest {

    protected void setUp() {
    }

    @Test
    public void test() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Sam Thane", 55000));
        employees.add(new Employee("Judy Diaz", 90000));
        employees.add(new Employee("Mark Bourne", 85000));
        List<String> result = ChallengeThree.topSalaryReport(employees, 2, s -> s.toUpperCase());
        assertTrue(result.size() == 2);
        assertTrue(result.get(0).equals("JUDY DIAZ"));
        assertTrue(result.get(1).equals("MARK BOURNE"));

        
        employees = new ArrayList<Employee>();
        employees.add(new Employee("Sam Thane", 55000));
        employees.add(new Employee("Judy Diaz", 9000));
        employees.add(new Employee("Mark Bourne", 8500));
        result = ChallengeThree.topSalaryReport(employees, 1, s -> s);
        assertTrue(result.size() == 1);
        assertTrue(result.get(0).equals("Sam Thane"));
    }
}