import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.midi.Soundbank;
public class DrawGraphics {
    private ArrayList<BouncingBox> boxes;


RoseDrawing rose;
BoyDrawing boy;
SunDrawing sun;
/** Initializes this class for drawing. */
public DrawGraphics() {
    boxes = new ArrayList<>();
Random random = new Random();
Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA};

for (int i = 0; i < 7; i++) {
    int x = random.nextInt(700) + 50; 
    int y = random.nextInt(400) + 50; 
    int xSpeed = random.nextInt(11) - 5; 
    int ySpeed = random.nextInt(11) - 5; 
    Color color = colors[i % colors.length]; 

    BouncingBox box = new BouncingBox(x, y, color);
    box.setMovementVector(xSpeed, ySpeed);
    boxes.add(box);
}
rose = new RoseDrawing(100, 350);
boy = new BoyDrawing(200, 350);
sun = new SunDrawing(500, 100);
}
/** Draw the contents of the window on surface. Called 20 times per second. */
public void draw(Graphics surface) {
// surface.drawLine(50, 50, 250, 250);

for (BouncingBox box : boxes) {
    box.draw(surface);
}

rose.draw(surface);
boy.draw(surface);
sun.draw(surface);
}

}
