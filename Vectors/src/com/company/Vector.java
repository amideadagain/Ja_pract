package com.company;

public class Vector {
    private double x;
    private double y;
    private double z;
    private int maxRand = 100;
    private int minRand = 0;

    Vector() {
        this.x = Math.random()*(maxRand-minRand+1)+minRand;
        this.y = Math.random()*(maxRand-minRand+1)+minRand;
        this.z = Math.random()*(maxRand-minRand+1)+minRand;
    }

    Vector(double x, double y) {
        this();
        this.x = x;
        this.y = y;
    }

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void printXYZ() {
        System.out.println(
                "x: " + x + ", "
                + "y: " + y + ", "
                + "z: " + z + ';'
                //+ "Vector length: " + this
        );
    }

    public double vectorLength() {
        return Math.sqrt(scalar());
    }

    public double scalar() {
        return x * x + y * y + z * z;
    }

    public double scalar(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public double[] vectorSumArray(Vector vector) {
        double[] vectorSum = {y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x
        };
        return vectorSum;
    }

    public Vector crossProduct(Vector vector) {
        return new Vector(y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x
        );
    }

    public double angleRad(Vector vector) {
        return scalar(vector) / (vectorLength() * vector.vectorLength());
    }

    public double angle(Vector vector) {
        return angleRad(vector) + 180 / Math.PI;
    }

    public Vector sum(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector subtract(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] newVectors(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector();
        }
        return vectors;
    }
}
