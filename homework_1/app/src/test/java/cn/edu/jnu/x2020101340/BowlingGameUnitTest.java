package cn.edu.jnu.x2020101340;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {


    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test20Zeros()
    {
        repeatedRoll(0, 20);
        assertEquals(0, game.score());
    }
    @Test
    public void test20Twos()
    {
        repeatedRoll(2,20);
        assertEquals(40,game.score());
    }

    @Test
    public void testASpare()
    {
        rollASpare();
        game.roll(7);
        repeatedRoll(0,17);
        assertEquals(24,game.score());
    }

    @Test
    public void testAStrike()
    {
        rollAStrike();
        game.roll(4);
        game.roll(5);
        repeatedRoll(0,16);
        assertEquals(28,game.score());
    }

    @Test
    public void testFullStrike()
    {
        repeatedRoll(10,12);
        assertEquals(300,game.score());
    }

    private void rollAStrike() {
        game.roll(10);
    }

    private void rollASpare() {
        game.roll(3);
        game.roll(7);
    }

    private void repeatedRoll(int pin, int times) {
        for (int i = 0; i < times; i++)
        {
            game.roll(pin);
        }
    }

}