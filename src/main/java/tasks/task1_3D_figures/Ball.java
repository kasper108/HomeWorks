package tasks.task1_3D_figures;

public class Ball extends  ShapesWithRadius{
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}
