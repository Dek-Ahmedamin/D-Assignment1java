public class CalcuLateG {
    static double multi(double a, double b) {
        return a * b;
    }
    static double Add(double a, double b) {
        return a + b;
    }
    static double Square(double a) {
        return Math.pow(a, 2);
    }
    static void outline() {
        double gravity =-9.81;
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double initialPosition = 0.0;

        //v = at + u
        double finalvelocity = Add(multi(gravity, fallingTime), initialVelocity);
        System.out.println("The final velocity is: " + finalvelocity);


        // x = 0.5 * at^2 + vit + xi
        double finalposition = Add(multi(0.5 , gravity), multi(Square(fallingTime), gravity));
        System.out.println("The final position is: " + finalposition);
    }
    public static void main(String[] args) {
        outline();
    }
    }