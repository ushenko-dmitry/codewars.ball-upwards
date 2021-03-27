
import by.ushenkoDmitry.codewars.ballUpwards.BallService;
import org.junit.Test;
import static org.junit.Assert.*;

public class BallServiceTest {

    @Test
    public void max_ball_1 () {
        int t = BallService.maxBall(15);
        assertEquals(t, 4);
    }
    
    @Test
    public void max_ball_2 () {
        int t = BallService.maxBall(25);
        assertEquals(t, 7);
    }
    
    @Test
    public void max_ball_3 () {
        int t = BallService.maxBall(37);
        assertEquals(t, 10);
    }
    
    @Test
    public void max_ball_4 () {
        int t = BallService.maxBall(45);
        assertEquals(t, 13);
    }
    
    @Test
    public void max_ball_5 () {
        int t = BallService.maxBall(99);
        assertEquals(t, 28);
    }
    
    @Test
    public void max_ball_6 () {
        int t = BallService.maxBall(85);
        assertEquals(t, 24);
    }
    
}
