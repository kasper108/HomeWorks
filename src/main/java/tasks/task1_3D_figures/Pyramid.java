package tasks.task1_3D_figures;

public class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super(h * s * 4 / 3);
        this.s = s;
        this.h = h;
    }
}
