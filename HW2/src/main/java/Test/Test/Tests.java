package Test;

import com.company.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class Tests {
    private Model model;

    @Before
    public void runBeforeTests() {
        model = new Model(0, 100);
    }

    @Test
    public void isRandNumInBorders() {
        for (int i = 0; i < 10000; i++) {
            int random = model.rand();
            Assert.assertTrue(random > 0
                    && random < 100);
        }
    }

    @Test
    public void isAttemptAddedInHistoryList() {
        int guessedValue = 30;
        model.defineInputValue(guessedValue);
        List<Integer> list = model.getHistoryList();
        Assert.assertTrue(list.contains(guessedValue));
    }

    @Test
    public void isModelHaveBorders() {
        Assert.assertEquals(0, model.getLeftLimit());
        Assert.assertEquals(100, model.getRightLimit());
    }

}


