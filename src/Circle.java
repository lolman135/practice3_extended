import java.awt.*;

public class Circle implements Figure{

    private final int diameter = 100;

    protected Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void draw(int x, int y, Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, diameter, diameter);
    }
}
