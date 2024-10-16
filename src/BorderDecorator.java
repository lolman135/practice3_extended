import java.awt.*;

/**
 * Class {@code BorderDecorator} extends {@link FigureDecorator}.
 * Adds border for the figure.
 * @author Kusovskyi Kyrylo
 */
public class BorderDecorator extends FigureDecorator{

    private float borderWidth;

    /**
     * Constructor of this class
     * @param decoratedFigure figure to decorate
     * @param borderWidth width of the border
     */
    public BorderDecorator(Figure decoratedFigure, float borderWidth) {
        super(decoratedFigure);
        this.borderWidth = borderWidth;
    }

    /**
     * @return description of this figure
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " with " + (int) borderWidth + "px. width border";
    }

    /**
     * Draws described figure with border
     * @param x the x coordinate
     * @param y the y coordinate
     * @param g Graphics object allows to draw figure
     */
    @Override
    public void draw(int x, int y, Graphics g) {

        Graphics2D g2d = (Graphics2D) g; // Приведение к Graphics2D
        g2d.setColor(Color.BLACK); // Установка цвета в черный
        g2d.setStroke(new BasicStroke(borderWidth)); // Установка толщины линии в пикселях
        g2d.drawOval(x-1, y-1, 102, 102);

        super.draw(x, y, g);
    }
}
