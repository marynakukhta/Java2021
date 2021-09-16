package test.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.kpi.tef.Point;
import ua.kpi.tef.Triangle;

public class TestTriangle {
    Triangle triangle;

    @BeforeAll
    void init(){
        triangle = new Triangle(new Point(4, 3), new Point(8, 8), new Point(12, 3));
    }

    @Test
    void square(){

    }

    @Test
    void perimeter(){

    }

    @Test
    void move(){
        
    }


}
