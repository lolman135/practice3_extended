import java.awt.*;

/**
 * Abstract class {@code FigureDecorator} decorating all
 * classes that implements {@link Figure} interface
 * @author Kusovskyi Kyrylo
 */
public abstract class FigureDecorator implements Figure{

    protected Figure decoratedFigure;

    /**
     * Constructor of this class
     * @param decoratedFigure figure to decorate
     */
    public FigureDecorator(Figure decoratedFigure) {
        this.decoratedFigure = decoratedFigure;
    }

    /**
     * @return description of this figure
     */
    @Override
    public String getDescription() {
        return decoratedFigure.getDescription();
    }

    /**
     * Draws described figure with decorations
     * @param x the x coordinate
     * @param y the y coordinate
     * @param g Graphics object allows to draw figure
     */
    @Override
    public void draw(int x, int y, Graphics g) {
        decoratedFigure.draw(x, y, g);
    }
}
