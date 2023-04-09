package cn.edu.jnu.x2020101340;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameUnitTest1 {
    private BowlingGame game1;

    @Before
    public void setUp() throws Exception {
        game1 = new BowlingGame();
    }

    @Test
    public void test20Zeros()
    {
        repeatedRoll1(0,20);
        assertEquals(0, game1.score());
    }

    private void repeatedRoll1(int pin, int times) {
        for(int i = 0; i < times; i++) {
            game1.roll (0);
        }
    }
}
