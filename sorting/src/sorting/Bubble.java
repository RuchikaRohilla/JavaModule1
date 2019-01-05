
package sorting;

import java.util.Scanner;

public class Bubble {
	public static void main(String[] args){
		Number n=new Number();
		
		Scanner sc= new Scanner(System.in);		
		System.out.println("Enter the count");
		
		n.setCount(sc.nextInt());
		int no=n.getCount();
		int arr[];
		arr=accept(no);
		System.out.println("--------------------------------");
		
		System.out.println("--------------------------------");
		System.out.println("ASCENDING ORDER:::");
		int ans1[];
		ans1 = bubbleAsc(arr);
		display(ans1);
		System.out.println("DESCENDING ORDER:::");
		int ans2[];
		ans2 = bubbleDesc(arr);
		display(ans2);
		
			
	}
	public static int[] accept(int count){
		int arr[];
		arr=new int[count];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values");
		for(int i=0;i<count;i++){
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	public static int[] bubbleAsc (int arr[]){
		System.out.println("Sorted Array is:");
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
					
			}
		}
		return arr;
	}
	public static int[] bubbleDesc (int arr[]){
		System.out.println("Sorted Array is:");
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
					
			}
		}
		return arr;
	}
	public static void display(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
	}
	
}
