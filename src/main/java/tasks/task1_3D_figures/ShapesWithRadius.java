package tasks.task1_3D_figures;

public class ShapesWithRadius extends Shape{
    private double radius;

    public ShapesWithRadius(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
