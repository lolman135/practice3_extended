import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame frame;

    public MainFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(220, 220);
        Circle circle = new Circle(Color.RED);
        System.out.println(circle.getDescription());
        JPanel circlePlace = drawFigure(circle, 50, 30);
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
