import org.junit.Test;
import static org.junit.Assert.*;

public class ChallengeOneTest {

    protected void setUp() {
    }

    private String arrayToString(String[] arr) {
        String str = arr[0];
        for(int i = 1; i < arr.length; i++) {
            str += ", " + arr[i];
        }
        return str;
    }

    @Test
    public void test() {
        var result = ChallengeOne.fruitColors(new Fruit[]{new Banana(), new Orange()});
        assertTrue(arrayToString(result).equals("Yellow, Orange"));

        result = ChallengeOne.fruitColors(new Fruit[]{new Orange(), new Orange(), new Banana()});
        assertTrue(arrayToString(result).equals("Orange, Orange, Yellow"));
    }
}