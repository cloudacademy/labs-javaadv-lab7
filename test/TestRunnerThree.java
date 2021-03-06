import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerThree {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ChallengeThreeTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

        if(result.wasSuccessful())
            System.exit(0);
        else 
            System.exit(1);
    }
}