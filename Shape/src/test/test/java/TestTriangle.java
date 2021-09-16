package test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.kpi.tef.Point;
import ua.kpi.tef.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTriangle {
    Triangle triangle;
    Triangle triangle2;

    @BeforeEach
    void init(){
        triangle = new Triangle(new Point(4, 3), new Point(8, 8), new Point(12, 3));
        triangle2 = new Triangle(new Point(5, 4), new Point(9, 9), new Point(13, 4));
    }

    @Test
    void square(){
        assertEquals(triangle.square(), 20.0);
    }

    @Test
    void perimeter(){
        assertEquals(triangle.perimeter(), 20.806248474865697);
    }

    @Test
    void move(){
       triangle.move(1,1);
       assertEquals(triangle.square(), 20.0);
       assertEquals(triangle.perimeter(), 20.806248474865697);
       assertEquals(triangle.getPointA(), triangle2.getPointA());
       assertEquals(triangle.getPointB(), triangle2.getPointB());
       assertEquals(triangle.getPointC(), triangle2.getPointC());
    }
}
