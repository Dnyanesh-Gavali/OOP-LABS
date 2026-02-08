package com.Lab4;

interface Function{
	int evaluate(int x);
}

class Half implements Function{
	public int evaluate(int x){
		return x/2;
	}
}

class Client{
	public int[] halfArray(int[] arr) {

        int[] result = new int[arr.length]; 
        Half h  =new Half();

        for (int i = 0; i < arr.length; i++) {
            result[i] = h.evaluate(arr[i]);          
        }

        return result;
    }
}

public class HalfArray_6 {
	public static void main(String[] args) {
		int number[] = {10, 20, 30 , 40 ,50};
		
		Client half = new Client();
		
		number = half.halfArray(number);
		
		for (int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	} 
}
