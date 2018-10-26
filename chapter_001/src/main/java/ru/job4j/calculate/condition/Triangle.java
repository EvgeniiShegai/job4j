package ru.job4j.calculate.condition;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;
    private double ab;
    private double ac;
    private double bc;

    public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

    public double area() {
        double res = -1.0;
         ab = this.a.distanceTo(this.b);
         ac = this.a.distanceTo(this.c);
         bc = this.b.distanceTo(this.c);
         double per = period(ab, ac, bc);
         if (this.exist(ab, ac, bc)) {
             res = Math.sqrt(per * (per - ab) * (per - ac) * (per - bc));
         }
        return res;
    }

    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    private boolean exist(double ab, double ac, double bc) {
        boolean rsl = false;
        if (ab != 0 && bc != 0 && ac != 0) {
            rsl = true;
        }
        return  rsl;
    }

}
