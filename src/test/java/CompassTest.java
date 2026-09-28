import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CompassTest {

    @Test
    @DisplayName("returns East when passed North and Right")

    void rotateNorthRightReturnsEast() {
        //arrange: create/setup what the test needs 
        Compass compass = new Compass();

        //act: call the method being tested 
        Point result = compass.rotate(Point.NORTH, Direction.RIGHT);

        //assert: check result
        assertEquals(Point.EAST, result);
    }

    @Test 
    @DisplayName("rotates correctly when turning right")
    void rotatesRightFromEveryPoint() {

        Compass compass = new Compass();

        assertAll(
            () -> assertEquals(Point.EAST, compass.rotate(Point.NORTH, Direction.RIGHT)),
            () -> assertEquals(Point.SOUTH, compass.rotate(Point.EAST, Direction.RIGHT)),
            () -> assertEquals(Point.WEST, compass.rotate(Point.SOUTH, Direction.RIGHT)),
            () -> assertEquals(Point.NORTH, compass.rotate(Point.WEST, Direction.RIGHT))
        );
    }

    @Test
    @DisplayName("rotates correctly when turning left")
    void rotatesLeftFromEveryPoint() {

        Compass compass = new Compass();

        assertAll(
            () -> assertEquals(Point.WEST, compass.rotate(Point.NORTH, Direction.LEFT)),
            () -> assertEquals(Point.SOUTH, compass.rotate(Point.WEST, Direction.LEFT)),
            () -> assertEquals(Point.EAST, compass.rotate(Point.SOUTH, Direction.LEFT)),
            () -> assertEquals(Point.NORTH, compass.rotate(Point.EAST, Direction.LEFT))
        );
    }
}



