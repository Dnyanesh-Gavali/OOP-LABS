package com.Lab4;

import java.util.Scanner;


//Indexing 
/*
 3d 			1d
 (0,0,0)		0
 (0,0,1)		1
 (0,1,0)		2
 (0,1,1)		3
 (1,0,0)		4
 (1,0,1)		5
 (1,1,0)		6
 (1,1,1)		7	
*/
class Matrix3D {
    int sizeX, sizeY, sizeZ;

    Matrix3D(int x, int y, int z) {
        sizeX = x;
        sizeY = y;
        sizeZ = z;
    }

    // set value into 1D array using 3D index
    void set(int value, int indexX, int indexY, int indexZ, int[] oneDArray) {
        int index = (indexX * sizeY * sizeZ) + (indexY * sizeZ) + indexZ;
        
        oneDArray[index] = value;
    }

    // get value from 1D array using 3D index (void method)
    void get(int indexX, int indexY, int indexZ, int[] oneDArray) {
        int index = (indexX * sizeY * sizeZ) + (indexY * sizeZ) + indexZ;
        
        System.out.println("Value at [" + indexX + "][" + indexY + "][" + indexZ + "] = " + oneDArray[index]);
    }
}

public class Matrix3D_1 {
	public static void main(String[] args) {

        int x = 2, y = 2, z = 3;
        int[] oneDArray = new int[x * y * z];

        Matrix3D m = new Matrix3D(x, y, z);

        // Set values
        m.set(10, 0, 0, 0, oneDArray);
        m.set(20, 0, 1, 2, oneDArray);
        m.set(30, 1, 0, 1, oneDArray);

        // Get values
        m.get(0, 0, 0, oneDArray);
        m.get(0, 1, 2, oneDArray);
        m.get(1, 0, 1, oneDArray);
    }
}
