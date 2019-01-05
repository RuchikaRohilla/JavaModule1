package conversion;

import java.awt.DisplayMode;
import java.util.Scanner;

public class Conversion {
	public static void main(String args[]){
		int bno,dno=0,rem=0,i=0,j=0;
		double s=0;
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter binary no::");
		bno=sc.nextInt();
		while (bno!=0){
			rem=bno%10;
			s=s+(Math.pow(2, i)*rem);
			bno=bno/10;
			i++;
		}
		*/System.out.println("decimal equivalent="+s);
		System.out.println("enter decimal no::");
		dno=sc.nextInt();
		int arr[];
		arr=new int[10];
		while(dno!=0){
			arr[j]=dno%2;
			System.out.println(arr[j]);
			j++;
		}
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
		System.out.println("binary equivalent="+s);
		for(int k=arr.length-1;k==0;k++){
			System.out.println(arr[k]);
		}
	}
}
