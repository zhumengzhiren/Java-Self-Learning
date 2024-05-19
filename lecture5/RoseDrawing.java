import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class RoseDrawing {
    private int centerX;
    private int centerY;

    public RoseDrawing(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        drawRose(g2d);
    }

    private void drawRose(Graphics2D g2d) {
        // Draw petals
        g2d.setColor(Color.RED);
        int petals = 20;
        int radius = 40;
        for (int i = 0; i < petals; i++) {
            double angle = Math.PI * i / petals;
            int x = (int) (centerX + radius * Math.cos(angle) * Math.sin(angle));
            int y = (int) (centerY + radius * Math.sin(angle) * Math.sin(angle));
            g2d.fillOval(x - 10, y - 10, 20, 20);
        }

        // Draw center
        g2d.setColor(Color.RED);
        g2d.fillOval(centerX - 10, centerY - 10, 20, 20);

        // Draw stem
        g2d.setColor(Color.GREEN);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawLine(centerX, centerY, centerX, centerY + 100);

        // Draw leaves
        g2d.setColor(Color.GREEN);
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.fillOval(centerX - 25, centerY + 50, 20, 10);
        g2d.fillOval(centerX + 5, centerY + 60, 20, 10);
    }
}
