import java.awt.*;

public class ShadowDecorator extends FigureDecorator{

    private final Color shadowColor = new Color(0, 0 ,0, 80);

    public ShadowDecorator(Figure decoratedFigure) {
        super(decoratedFigure);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with shadow";
    }

    @Override
    public void draw(int x, int y, Graphics g) {

        g.setColor(shadowColor);
        int shadowOffset = 5;
        g.fillOval(x + shadowOffset, y + shadowOffset, 102, 102);

        super.draw(x, y, g);
    }
}