import java.awt.*;

/**
 * Interface {@code Figure} describes behavior of other figures that implements this interface.
 * @author Kusovskyi Kyrylo
 */
public interface Figure {

    /**
     * Draws described figure
     * @param x the x coordinate
     * @param y the y coordinate
     * @param g Graphics object allows to draw figure
     */
    void draw(int x, int y, Graphics g);

    /**
     * @return description of this figure
     */
    String getDescription();
}
