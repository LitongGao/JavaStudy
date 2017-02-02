package com.Study.ClassAndObject;

import java.util.Arrays;

public class dataTypeTest {
	
	public static void main(String[] args){
	
	//dataType[] arrayRefVar;
	int size = 4;
	double[] myList = new double[size];
	myList[0] = 12.03;
	myList[2] = 43.333;
	myList[1] = 234.322;
	myList[3] = 12;
	double total = 0;
	for (int i = 0; i< myList.length; i++){
		total += myList[i];
	}	
	System.out.println("Total is " + total);

	double max = 0;
	for (int i = 0; i< myList.length; i++){
		if (max < myList[i]) max = myList[i];
	}
	System.out.println("Max is " + max);
	
	for (double element:myList) {
		System.out.println(element);
	}
	
	Arrays.fill(myList, max);
	
	for (double element:myList) {
		System.out.println(element);
	}
	
	int[] intArray = {1,4,5,2,3};
	printArray(intArray);
	}
	
	public static void printArray(int[] array) {
		Arrays.sort(array);
		for (int element:array) {
			System.out.println(element);
		}
	}
	
	public static void assignNewValue(int[] array) {
		
	}
}
