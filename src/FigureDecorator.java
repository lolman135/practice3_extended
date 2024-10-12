import java.awt.*;

public abstract class FigureDecorator implements Figure{

    protected Figure decoratedFigure;

    public FigureDecorator(Figure decoratedFigure) {
        this.decoratedFigure = decoratedFigure;
    }

    @Override
    public String getDescription() {
        return decoratedFigure.getDescription();
    }

    @Override
    public void draw(int x, int y, Graphics g) {
        decoratedFigure.draw(x, y, g);
    }
}
