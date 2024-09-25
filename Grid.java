import java.util.*;
class Grid {
    private int width, height;


    public Grid(int width, int height) {
        this.width = width;
        this.height = height;

    }



    public boolean isWithinBounds(Position position) {
        return position.getX() >= 0 && position.getX() < width &&
                position.getY() >= 0 && position.getY() < height;
    }
}
