package org.example.home4;

public class Perimeter {
    public static double calculateArea(double sideA, double sideB, double sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <=0 ) {
            throw new Exception("Такой стороны не может быть");
        }

        if (sideA>=sideB + sideC || sideB >= sideA + sideC || sideC >=sideB + sideC) {
            throw new Exception("Это вырожденный треугольник");
        }
        double halfP = (sideA + sideB + sideC)/2;
        double square = halfP*(halfP-sideA)*(halfP-sideB)*(halfP-sideC);
        return Math.sqrt(square);

    }
}
