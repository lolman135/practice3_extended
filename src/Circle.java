import java.awt.*;

public class Circle implements Figure{

    protected Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void draw(int x, int y) {

    }
}
