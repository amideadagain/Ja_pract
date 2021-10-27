package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), y = scanner.nextDouble(), z = scanner.nextDouble();

	    Vector vector1 = new Vector(x, y, z);
        Vector vector2 = new Vector();

	    vector1.printXYZ();
	    vector2.printXYZ();

	    System.out.println(vector1.vectorLength());
	    System.out.println(vector1.scalar());
	    System.out.println(vector1.angle(vector2));

	    Vector[] vectors = Vector.newVectors(3);
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].printXYZ();
        }

        vectors[0].sum(vectors[1]).printXYZ();
        vector1.crossProduct(vector2).printXYZ();
    }
}
