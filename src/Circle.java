import java.awt.*;

import static java.awt.Color.*;

public class Circle implements Figure{

    protected Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String getDescription() {
        return ColorConverter.convertToWord(color) + " circle";
    }

    @Override
    public void draw(int x, int y, Graphics g) {
        g.setColor(RED);
        g.fillOval(x, y, 100, 100);
    }

}
