import java.awt.Graphics;

public abstract class AbstractMover implements Mover {
    protected int x;
    protected int y;
    protected int xDirection;
    protected int yDirection;
    protected Sprite sprite;

    public AbstractMover(int startX, int startY, Sprite sprite) {
        this.x = startX;
        this.y = startY;
        this.sprite = sprite;
    }

    @Override
    public void setMovementVector(int xIncrement, int yIncrement) {
        this.xDirection = xIncrement;
        this.yDirection = yIncrement;
    }

    @Override
    public void draw(Graphics surface) {
        sprite.draw(surface, x, y);
        move();
    }

    protected abstract void move();
}
