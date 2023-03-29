package com.geometry;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    RectangleArea rectangleObject = new RectangleArea();

    @Nested
    class RectangleAreaTest{
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
    }



}
