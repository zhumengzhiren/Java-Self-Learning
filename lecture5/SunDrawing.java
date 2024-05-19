import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class SunDrawing {
    private int centerX;
    private int centerY;
    private final int sunDiameter = 100;

    public SunDrawing(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        drawSun(g2d);
    }

    private void drawSun(Graphics2D g2d) {
        // Draw the sun
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(centerX - sunDiameter / 2, centerY - sunDiameter / 2, sunDiameter, sunDiameter);

        // Draw eyes
        // g2d.setColor(Color.BLACK);
        // int eyeY = centerY - 10;
        // g2d.fillOval(centerX - 20, eyeY, 10, 10);
        // g2d.fillOval(centerX + 10, eyeY, 10, 10);

        // Draw smile
        // g2d.drawArc(centerX - 25, centerY - 10, 50, 30, 0, -180);

        // Draw rays
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(3.0f));
        for (int i = 0; i < 8; i++) {
            double angle = 2 * Math.PI / 8 * i;
            int rayX1 = (int) (centerX + (sunDiameter / 2) * Math.cos(angle));
            int rayY1 = (int) (centerY + (sunDiameter / 2) * Math.sin(angle));
            int rayX2 = (int) (centerX + (sunDiameter / 2 + 20) * Math.cos(angle));
            int rayY2 = (int) (centerY + (sunDiameter / 2 + 20) * Math.sin(angle));
            g2d.drawLine(rayX1, rayY1, rayX2, rayY2);
        }
    }
}
