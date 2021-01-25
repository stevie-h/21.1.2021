// https://github.com/qa191120/21.01.2021/blob/main/hw.txt


package com.company;

public class Circle
{
    double radius;

    public void printSize()
    {
        System.out.print("The size of the circle is: ");
        System.out.println(Math.PI * Math.pow(radius, 2));
    }

  
public class Main
{
    public static void main(String[] args)
    {
        Circle r5_4 = new Circle();
        Circle r8_7 = new Circle();

        r5_4.radius = 5.4;
        r8_7.radius = 8.7;

        r5_4.printSize();
        r8_7.printSize();

    }

}



