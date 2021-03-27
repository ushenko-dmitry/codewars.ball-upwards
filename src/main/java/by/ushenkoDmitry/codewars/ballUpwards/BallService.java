package by.ushenkoDmitry.codewars.ballUpwards;

public class BallService {

    public static Integer maxBall(Integer v) {
        return calcBall(v, 0, 0d);
    }
    
    private static Integer calcBall(Integer v, Integer t, Double h) {
        Double v_p = v.doubleValue() * 1000 / 36000;
        Double g = 9.81 / 10;
        Double t_p = t.doubleValue() * 10;
        Double currH = v_p * t_p / 10 - g /10 * 0.5 * t_p/10 * t_p/10;
        if (currH >= h) {
            h = currH;
            t++;
            t = calcBall(v, t, h);
        } else {
            t--;
        }
        return t;
    }

}
