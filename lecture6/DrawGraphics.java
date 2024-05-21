import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class DrawGraphics {
    private ArrayList<Mover> movers;

    public DrawGraphics() {
        movers = new ArrayList<>();
        Random random = new Random();
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA};

        for (int i = 0; i < 14; i++) {
            int x = random.nextInt(700) + 50;
            int y = random.nextInt(400) + 50;
            int xSpeed = random.nextInt(11) - 5;
            int ySpeed = random.nextInt(11) - 5;
            Color color = colors[i % colors.length];

            Rectangle box = new Rectangle(20, 20, color);

            Mover mover;
            if (i % 2 == 0) {
                mover = new Bouncer(x, y, box);
            } else {
                mover = new StraightMover(x, y, box);
            }
            mover.setMovementVector(xSpeed, ySpeed);
            movers.add(mover);
        }

        rose = new RoseDrawing(100, 350);
        boy = new BoyDrawing(200, 350);
        sun = new SunDrawing(500, 100);
        kanji = new Kanji();

        
        Mover kanjiMover = new Bouncer(100, 100, kanji);
        kanjiMover.setMovementVector(5, 5);
        movers.add(kanjiMover);

        Mover kanjiMover2 = new StraightMover(200, 200, kanji);
        kanjiMover2.setMovementVector(5, 5);
        movers.add(kanjiMover2);
    }

    public void draw(Graphics surface) {
        for (Mover mover : movers) {
            mover.draw(surface);
        }

        rose.draw(surface);
        boy.draw(surface);
        sun.draw(surface);
    }

    private RoseDrawing rose;
    private BoyDrawing boy;
    private SunDrawing sun;
    private Kanji kanji;
}
