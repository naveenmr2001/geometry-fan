package com.geometry;


// A Class that represents use-defined exception

class ExceptionToHandleTheNegativeNumber extends Exception {
    public ExceptionToHandleTheNegativeNumber(String s)
    {
        super(s);
    }
}
public class RectangleArea{
    public int areaOfRectangle(int lengthOfSide, int breathOfSide) throws ExceptionToHandleTheNegativeNumber {
        if(lengthOfSide<0 || breathOfSide<0){
            throw new ExceptionToHandleTheNegativeNumber("It should be greater than zero");
        }
        return lengthOfSide*breathOfSide;
    }
}
