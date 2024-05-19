import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class BoyDrawing {
    private int centerX;
    private int centerY;
    private final int headWidth = 80;
    private final int headHeight = 80;
    private final int bodyWidth = 3;
    private final int bodyHeight = 120;
    private final int legHeight = 70;
    private final int totalHeight = headHeight + bodyHeight + legHeight;

    public BoyDrawing(int centerX, int baseY) {
        this.centerX = centerX;
        this.centerY = baseY - totalHeight + 100;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        drawBoy(g2d);
    }

    private void drawBoy(Graphics2D g2d) {
        // Draw head
        g2d.setColor(Color.PINK);
        g2d.fillOval(centerX - headWidth / 2, centerY, headWidth, headHeight);

        // Draw eyes
        g2d.setColor(Color.BLACK);
        int eyeY = centerY + headHeight / 3;
        g2d.fillOval(centerX - headWidth / 4, eyeY, 10, 10);
        g2d.fillOval(centerX + headWidth / 4 - 10, eyeY, 10, 10);

        // Draw smile
        g2d.drawArc(centerX - 20, centerY + headHeight / 2, 40, 20, 0, -180);

        // Draw body
        g2d.setColor(Color.BLACK);
        int bodyY = centerY + headHeight;
        g2d.fillRect(centerX - bodyWidth / 2, bodyY, bodyWidth, bodyHeight);

        // Draw arms
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.drawLine(centerX - bodyWidth / 2, bodyY + bodyHeight / 3, centerX - 60, bodyY + bodyHeight / 3 + 30);
        g2d.drawLine(centerX + bodyWidth / 2, bodyY + bodyHeight / 3, centerX + 60, bodyY + bodyHeight / 3 + 30);

        // Draw legs
        int legY = bodyY + bodyHeight;
        g2d.drawLine(centerX - bodyWidth / 2, legY, centerX - 30, legY + legHeight);
        g2d.drawLine(centerX + bodyWidth / 2, legY, centerX + 30, legY + legHeight);
    }
}
