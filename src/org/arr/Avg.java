package org.arr;

public class Avg {
	public static void main(String[] args) {
		int a[]=new int[10];
		a[0]=8;
		a[1]=4;
		a[2]=8;
		a[3]=3;
		a[4]=7;
		a[5]=5;
		a[6]=6;
		a[7]=9;
		a[8]=12;
		a[9]=8;
		float Sum = (a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9]);
		System.out.println("Avg"+(Sum/10));

}
}
