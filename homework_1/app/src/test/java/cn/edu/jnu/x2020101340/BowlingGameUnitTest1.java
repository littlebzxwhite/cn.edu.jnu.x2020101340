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
        for(int i = 0; i < 20; i++) {
            game1.roll (0);
        }
        assertEquals(0, game1.score());
    }
}
