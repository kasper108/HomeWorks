package tasks.task1_3D_figures;

public class Cylinder extends ShapesWithRadius{
    private double h;

    public Cylinder(double radius, double h) {
        super(Math.PI * radius * radius * h, radius);
        this.h = h;
    }
}
