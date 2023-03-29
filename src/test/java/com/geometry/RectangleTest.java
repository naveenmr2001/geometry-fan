package com.geometry;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    Rectangle rectangleObject = new Rectangle();

    @Nested
    class RectangleSizeTest {
        @Test
        void toCheckTheRectangleAreaForInputThreeAndFour() throws ExceptionToHandleTheNegativeNumber {

            int exceptedValue = 12;

            int actualValue = rectangleObject.areaOfRectangle(3,4);

            assertEquals(exceptedValue,actualValue);

        }

        @Test
        void toCheckTheExceptionForInputNegativeThreeAndFour(){

            assertThrows(ExceptionToHandleTheNegativeNumber.class,()->rectangleObject.areaOfRectangle(-3,4));

        }


        @Test
        void toCheckThePerimeterOfRectangleForInputFiveAndSix() throws ExceptionToHandleTheNegativeNumber{

            int exceptedValue = 22;

            int actualValue = rectangleObject.perimeterOfRectangle(5,6);

            assertEquals(exceptedValue,actualValue);

        }

        @Test
        void toCheckTheExceptionForInputNegativeFiveAndFour() throws ExceptionToHandleTheNegativeNumber{

            assertThrows(ExceptionToHandleTheNegativeNumber.class,()->rectangleObject.perimeterOfRectangle(-5,4));

        }
    }



}
