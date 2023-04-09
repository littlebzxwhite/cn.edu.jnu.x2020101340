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

    @Test
    public void test20Twos()
    {
        repeatedRoll1(2,20);
        assertEquals(40,game1.score());
    }

    @Test
    public void testASpare()
    {
        rollASpare1();
        game1.roll(7);
        repeatedRoll1(0,17);
        assertEquals(24,game1.score());
    }
    private void repeatedRoll1(int pin, int times) {
        for(int i = 0; i < times; i++) {
            game1.roll (pin);
        }
    }
    private void rollASpare1() {
        game1.roll(3);
        game1.roll(7);
    }


}
