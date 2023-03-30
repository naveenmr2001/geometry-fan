package com.geometry;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.geometry.Rectangle.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    Rectangle rectangleObject = new Rectangle(3,4);

    @Nested
    class RectangleSizeTest {
        @Test
        void toCheckTheRectangleAreaForInputThreeAndFour() throws IllegalArgumentException {

            int exceptedValue = 12;

            int actualValue = rectangleObject.areaOfRectangle();

            assertEquals(exceptedValue,actualValue);

        }

        @Test
        void toCheckThePerimeterOfRectangleForInputFiveAndSix() throws IllegalArgumentException{

            int exceptedValue = 14;

            int actualValue = rectangleObject.perimeterOfRectangle();

            assertEquals(exceptedValue,actualValue);

        }

        Rectangle squareObject = createSquare(6,6);

        @Test
        void toCheckTheAreaOfSquareForInputSix() throws IllegalArgumentException{

            int exceptedValue = 36;

            int actualValue = squareObject.areaOfRectangle();

            assertEquals(exceptedValue,actualValue);

        }

        @Test
        void toCheckThePerimeterOfSquareForInputSix() throws IllegalArgumentException{

            int exceptedValue = 24;

            int actualValue = squareObject.perimeterOfRectangle();

            assertEquals(exceptedValue,actualValue);

        }
    }

}
