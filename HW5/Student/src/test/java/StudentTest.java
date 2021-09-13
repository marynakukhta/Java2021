import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {
    Student one;
    Student two;
    Student three;

    @BeforeEach
    public void Initialize(){
         one = new Student("Ann", 12, "A");
         two = new Student("Ann", 12, "A");
         three = new Student("Ann", 16, "B");
    }

    @Test
    public void isEquals(){
        assertTrue(one.equals(two));
        assertFalse(one.equals(three));
        assertFalse(two.equals(three));
    }

    @Test
    public void isHashGood(){
        assertTrue(one.hashCode() == two.hashCode());
        assertFalse(one.hashCode() == three.hashCode());
    }
}
