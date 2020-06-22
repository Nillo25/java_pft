package ru.stqa.pft.sandbox;

import java.util.Scanner;

import static ru.stqa.pft.sandbox.Point.distance;

public class MySecondProgram {



  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("введите координаты X первой точки");
    double numX1 = in.nextDouble();
    System.out.println("введите координаты Y первой точки");
    double numY1 = in.nextDouble();
    System.out.println("введите координаты X второй точки");
    double numX2 = in.nextDouble();
    System.out.println("введите координаты Y второй точки");
    double numY2 = in.nextDouble();
    Point p1 = new Point(numX1,numY1);
    Point p2 = new Point(numX2,numY2);
    in.close();


    System.out.println("Расстояние между точками (" + p1.point1() + ") и (" + p2.point2() + ") = " + distance(p1, p2));

  }


}





