import java.awt.Graphics;

public class Bouncer extends AbstractMover {
    public Bouncer(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    @Override
    protected void move() {
        x += xDirection;
        y += yDirection;

        if ((x <= 0 && xDirection < 0) || (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }
        if ((y <= 0 && yDirection < 0) || (y + sprite.getHeight() >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }
}
