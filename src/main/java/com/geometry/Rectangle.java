package com.geometry;

public class Rectangle {

    private final int lengthOfSide;

    private final int breathOfSide;

    public Rectangle(int lengthOfSide,int breathOfSide){

        this.lengthOfSide = lengthOfSide;
        this.breathOfSide = breathOfSide;

    }

    public int areaOfRectangle() throws IllegalArgumentException {

        if(lengthOfSide<0 || breathOfSide<0){
            throw new IllegalArgumentException("It should be greater than zero");
        }

        return lengthOfSide*breathOfSide;
    }

    public int perimeterOfRectangle() throws IllegalArgumentException {

        if(lengthOfSide<0 || breathOfSide<0){
            throw new IllegalArgumentException("It should be greater than Zero");
        }

        return 2*(lengthOfSide+breathOfSide);
    }

    public static Rectangle createSquare(int lengthOfSide,int breathOfSide) throws IllegalArgumentException{

        if(lengthOfSide<0 || breathOfSide<0){
            throw new IllegalArgumentException("It should be greater than zero");
        }

        return new Rectangle(lengthOfSide,breathOfSide);
    }
}
