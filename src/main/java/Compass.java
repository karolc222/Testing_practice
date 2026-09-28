public class Compass {
    private Point currentDirection;

    public Point rotate(Point point, Direction direction) {
        int ordinalPoint = point.ordinal();

            if (direction == Direction.RIGHT) {
                ordinalPoint  += 1; 
                ordinalPoint = ordinalPoint % 4;

            } else if (direction == Direction.LEFT) {
                ordinalPoint -= 1;
                ordinalPoint = (ordinalPoint + 4) % 4;
            }

            return Point.values()[ordinalPoint];
        
    }
}