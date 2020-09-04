/**
 * @author iverdon
 * @date 2020/9/2 17:00
 */
public class Sixteen {
    public double Power(double base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }
        boolean isNegative = false;
        if (exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double power = Power(base*base, exponent>>1);
        if (exponent%2 != 0){
            power = power*base;
        }
        return isNegative ? 1/power : power;
    }
}
