package utils;

public class HitChecker {

    public boolean isHit(double x, double y, double r) {
        return isHitCircle(x, y, r) || isHitSquare(x, y, r) || isHitTriangle(x, y, r);
    }

    public boolean isHitCircle(double x, double y, double r) {
        return ((Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= r) && (x <= 0 && y <= 0));
    }

    public boolean isHitSquare(double x, double y, double r) {
        return (y >= -r) && (x <= r) && (x >= 0) && (y <= 0);
    }

    public boolean isHitTriangle(double x, double y, double r) {
        return ((x<=r/2)&& (y <= ( r / 2 - x)) && (x >= 0) && (y >= 0));
    }
}
