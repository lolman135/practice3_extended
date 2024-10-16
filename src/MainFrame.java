import javax.swing.*;
import java.awt.*;

/**
 * Class {@code MainFrame} makes {@code JFrame} frame that displays visual
 * representation of working pattern "Decorator" by decorating displayed figure
 * @author Kusovskyi Kyrylo
 */
public class MainFrame {

    private final JFrame frame;

    /**
     * Constructor of this class. After creating object of this class makes simple empty window
     * where later displays figure.
     */
    public MainFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(220, 220);

        Figure circle = new Circle(Color.RED);
        Figure circleWithBorder = new BorderDecorator(circle, 2f);
        Figure circleWithBorderAndShadow = new ShadowDecorator(circleWithBorder);

        System.out.println(circleWithBorderAndShadow.getDescription());

        JPanel circlePlace = drawFigure(circleWithBorderAndShadow, 50, 30);
        frame.add(circlePlace);
    }

    /**
     * Method to draw figure
     * @param figure figure
     * @param x the x coordinate
     * @param y the y coordinate
     * @return JPanel object - figure
     */
    private JPanel drawFigure(Figure figure, int x, int y){
        return new JPanel(){
            public void paintComponent(Graphics g){
                figure.draw(x, y, g);
            }
        };
    }

    /**
     * Displays frame
     */
    public void show(){
        frame.setVisible(true);
    }
}
