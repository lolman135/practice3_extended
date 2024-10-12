import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private final JFrame frame;

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

    private JPanel drawFigure(Figure figure, int x, int y){
        return new JPanel(){
            public void paintComponent(Graphics g){
                figure.draw(x, y, g);
            }
        };
    }

    public void show(){
        frame.setVisible(true);
    }
}
