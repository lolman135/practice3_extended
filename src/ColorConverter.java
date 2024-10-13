import java.awt.*;

public class ColorConverter {

    public static String convertToWord(Color color) {
        if (color == null) {
            return "Unknown";
        }

        if (color.equals(Color.RED)) {
            return "Red";
        } else if (color.equals(Color.BLUE)) {
            return "Blue";
        } else if (color.equals(Color.GREEN)) {
            return "Green";
        } else if (color.equals(Color.YELLOW)) {
            return "Yellow";
        } else if (color.equals(Color.ORANGE)) {
            return "Orange";
        } else if (color.equals(Color.PINK)) {
            return "Pink";
        } else if (color.equals(Color.CYAN)) {
            return "Cyan";
        } else if (color.equals(Color.MAGENTA)) {
            return "Magenta";
        } else if (color.equals(Color.DARK_GRAY)) {
            return "Dark gray";
        } else if (color.equals(Color.LIGHT_GRAY)) {
            return "Light gray";
        } else if (color.equals(Color.WHITE)) {
            return "White";
        } else if (color.equals(Color.BLACK)) {
            return "Black";
        } else {
            return "Unknown";
        }
    }
}
