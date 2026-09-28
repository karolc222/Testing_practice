public class Main {

  public static void main(iString[] args) {
    Compass compass = mew Compass();

    System.out.println(compass.rotate(Point.NORTH, Direction.RIGHT));
    System.out.println(compass.rotate(Point.EAST, Direction.RIGHT));
    System.out.println(compass.rotate(Point.NORTH, Direction.LEFT));
    System.out.println(compass.rotate(Point.WEST, Direction.LEFT));
  }
}

