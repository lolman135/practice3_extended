import java.awt.*;

public class BorderDecorator extends FigureDecorator{

    private float borderWidth;

    public BorderDecorator(Figure decoratedFigure, float borderWidth) {
        super(decoratedFigure);
        this.borderWidth = borderWidth;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + (int) borderWidth + "px. width border";
    }

    @Override
    public void draw(int x, int y, Graphics g) {

        Graphics2D g2d = (Graphics2D) g; // Приведение к Graphics2D
        g2d.setColor(Color.BLACK); // Установка цвета в черный
        g2d.setStroke(new BasicStroke(borderWidth)); // Установка толщины линии в пикселях
        g2d.drawOval(x-1, y-1, 102, 102);

        super.draw(x, y, g);
    }
}
