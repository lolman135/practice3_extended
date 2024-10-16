import java.awt.*;

import static java.awt.Color.*;

/**
 * Class {@code Circle} is concrete realization of interface {@link Figure}
 * @author Kusovskyi Kyrylo
 */
public class Circle implements Figure{

    protected Color color;

    /**
     * Constructor of this class
     * @param color color of the figure
     */
    public Circle(Color color) {
        this.color = color;
    }

    /**
     * @return description of this figure
     */
    @Override
    public String getDescription() {
        return ColorConverter.convertToWord(color) + " circle";
    }

    /**
     * Draws described figure
     * @param x the x coordinate
     * @param y the y coordinate
     * @param g Graphics object allows to draw figure
     */
    @Override
    public void draw(int x, int y, Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 100, 100);
    }

}
