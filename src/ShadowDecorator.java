import java.awt.*;

/**
 * Class {@code ShadowDecorator} extends {@link FigureDecorator}.
 * Adds shadow for the figure.
 * @author Kusovskyi Kyrylo
 */
public class ShadowDecorator extends FigureDecorator{

    private final Color shadowColor = new Color(0, 0 ,0, 80);

    /**
     * Constructor of this class
     * @param decoratedFigure figure to decorate
     */
    public ShadowDecorator(Figure decoratedFigure) {
        super(decoratedFigure);
    }

    /**
     * @return description of this figure
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " with shadow";
    }

    /**
     * Draws described figure with shadow
     * @param x the x coordinate
     * @param y the y coordinate
     * @param g Graphics object allows to draw figure
     */
    @Override
    public void draw(int x, int y, Graphics g) {

        g.setColor(shadowColor);
        int shadowOffset = 10;
        g.fillOval(x + shadowOffset, y + shadowOffset, 102, 102);

        super.draw(x, y, g);
    }
}