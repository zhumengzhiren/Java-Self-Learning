import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Kanji implements Sprite {
    private int width;
    private int height;

    public Kanji() {
        width = 100;  // 假设宽度为100像素
        height = 100; // 假设高度为100像素
    }

    @Override
    public void draw(Graphics surface, int leftX, int topY) {
        Graphics2D g2d = (Graphics2D) surface;
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));

        // 绘制“最”字的各个部分

        // 横线1
        g2d.drawLine(leftX + 10, topY + 20, leftX + 90, topY + 20);

        // 横线2
        g2d.drawLine(leftX + 10, topY + 40, leftX + 90, topY + 40);

        // 横线3
        g2d.drawLine(leftX + 10, topY + 60, leftX + 90, topY + 60);

        // 横线4
        g2d.drawLine(leftX + 10, topY + 80, leftX + 90, topY + 80);

        // 竖线1
        g2d.drawLine(leftX + 30, topY + 10, leftX + 30, topY + 90);

        // 竖线2
        g2d.drawLine(leftX + 70, topY + 10, leftX + 70, topY + 90);

        // 撇
        g2d.drawLine(leftX + 50, topY + 10, leftX + 20, topY + 50);

        // 捺
        g2d.drawLine(leftX + 50, topY + 10, leftX + 80, topY + 50);

        // 横折钩
        g2d.drawLine(leftX + 50, topY + 50, leftX + 50, topY + 70);
        g2d.drawLine(leftX + 50, topY + 70, leftX + 40, topY + 90);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
