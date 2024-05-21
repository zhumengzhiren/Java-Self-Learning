import java.awt.Graphics;

public class StraightMover extends AbstractMover {
    public StraightMover(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    @Override
    protected void move() {
        x += xDirection;
        y += yDirection;
    }
}
