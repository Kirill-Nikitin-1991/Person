import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class PersonTest {

    @DataProvider(name = "isTeenager")
    Object[][] isTeenager() {
        return new Object[][] {
                {19}
        };
    }

    @Test
    public <age> void test1 (age) {
        boolean age;
        boolean result = Person.isTeenager(age);
        assertTrue (result);
    }


}
