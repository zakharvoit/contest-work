package lib;

/**
 * @author Zakhar Voit(zakharvoit@gmail.com)
 */
@SuppressWarnings("unused")
public class DoubleUtils {
    static double EPS = 1e-9;

    static public void setEps(double eps) {
        EPS = eps;
    }

    static public boolean equal(double a, double b) {
        return Math.abs(b - a) < EPS;
    }

    static public boolean less(double a, double b) {
        return a < b && !equal(a, b);
    }

    static public boolean great(double a, double b) {
        return a > b && !equal(a, b);
    }

    static public double sqrt(double x) {
        if (less(x, 0))
            throw new RuntimeException("Square root of negative value");
        if (x < 0)
            return 0;
        return Math.sqrt(x);
    }

    static public int round(double x) {
        int floor = (int) (Math.floor(x) + EPS);

        if (less(x - floor, 0.5))
            return floor;
        else
            return floor + 1;
    }

    static public double sqr(double x) {
        return x * x;
    }

    static public boolean isInt(double x) {
        return equal(x, (int) x);
    }
}
