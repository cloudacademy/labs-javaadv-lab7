import org.junit.Test;
import static org.junit.Assert.*;

public class ChallengeTwoTest {

    protected void setUp() {
    }

    @Test
    public void test() {
        Numbers<Integer> numbers = new Numbers<>();
        numbers.add(1);
        numbers.add(2);
        double result = ChallengeTwo.sumSquared(numbers);
        // Expected output is 
        // true
        assertTrue(result == 9.0);

        Numbers<Float> nums = new Numbers<>();
        nums.add(-1.0f);
        nums.add(1.0f);
        result = ChallengeTwo.sumSquared(nums);
        // Expected output is 
        // true
        assertTrue(result == 0.0);
    }
}