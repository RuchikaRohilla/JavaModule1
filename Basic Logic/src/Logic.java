import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		int arr[];
		int ch;
	
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("1.Array\t2.Factors\t3.Factorial\t4.Prime No\t5.Reverse No\t6.Sum of Digit\t7.Fibonnaci\t8.Amstrong No\t9.Perfect No\t.10.Exit\n");
			System.out.println("Enter your choice::::");
			ch=sc.nextInt();
			switch(ch){
			case 1:System.out.println("------------------------------------------------");
			 arr=acceptArray();
			 displayArray(arr);
			break;
			case 2:System.out.println("--------------------------------------------------");
				factor();
				break;
			case 3:System.out.println("---------------------------------------------------");
				factorial();
				break;
			case 4:System.out.println("---------------------------------------------------");
				primeNo();
				break;
			case 5:System.out.println("---------------------------------------------------");
			reverse();
			break;
			case 6:System.out.println("---------------------------------------------------");
				sumOfDigits();
				break;
			case 7:System.out.println("----------------------------------------------------");
				fibbonaci();
				break;
			case 8:System.out.println("----------------------------------------------------");
				armstrong();
				break;
			case 9:System.out.println("-----------------------------------------------------");
					perfectNo();
					break;
			case 10:System.out.println("----------------------------------------------------");
					System.exit(0);
					break;
			default: System.out.println("wrong choice");
				
			}
		}while(ch!=10);
		
		
		
		
	 	
	}
	public	static int[] acceptArray(){
		int arr[];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of array::");
		int count=sc.nextInt();
		arr=new int[count];
		System.out.println("Enter the values");
	
		for(int i=0;i<count;i++){
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	public static void displayArray(int arr[]){
		System.out.println("Array entered is::");
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"\t");
		}
	}
	public static void factor(){
		int no;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no::");
		no=sc.nextInt();
		System.out.println("factors of "+no+"are::");
		for(int i=1;i<=no;i++){
			if(no%i==0){
			System.out.println(i+"\t");	
			}
		}
	}
	public static void factorial(){
	int no,fact=1;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no::");
	no=sc.nextInt();
	for(int i=1;i<=no;i++){
		fact=fact*i;	
		}
	System.out.println("Factorial is::"+fact);
	}
	public static void reverse(){
		int no,reversedNumber=0,remainder=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no::");
		no=sc.nextInt();
		while(no != 0)
	    {
	        remainder = no%10;
	        reversedNumber = reversedNumber*10 + remainder;
	        no /= 10;
	    }

	    System.out.println("Reversed Number ="+reversedNumber);
		
	}
	public static void sumOfDigits(){
		int no,remainder=0,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no::");
		no=sc.nextInt();
		while (no != 0)
		   {
		      remainder = no % 10;
		      sum       = sum + remainder;
		      no        = no/ 10;
		   }

	    System.out.println("sum="+sum);
	}
	public static void fibbonaci(){
		int i, n, t1 = 0, t2 = 1, nextTerm;

	   
	    for (i = 1; i <= 15; ++i)
	    {
	        System.out.println(t1);
	        nextTerm = t1 + t2;
	        t1 = t2;
	        t2 = nextTerm;
	        
	    }
		//displayArray(arr);
		
	}
	public static void primeNo(){
		int no;
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no::");
		no=sc.nextInt();
		//System.out.println("factors of "+no+"are::");
		for(int i=1;i<=no;i++){
			if(no%i!=0){
				flag=false;
				 break;
			}
		}
		
		if(flag){
		System.out.println(no+" is prime no ");
		}
		else {
			System.out.println(no+" is not prime no");
		}
		}
	public static void armstrong(){
		int no,remainder=0;
		double s=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no::");
		no=sc.nextInt();
		int original=no;
		while(no != 0)
	    {
	        remainder = no%10;
	        s = s + remainder*remainder*remainder;
	        no /= 10;
	        
	    }
		
		
		
		
		System.out.println("s="+s);
		if(s==original){
			System.out.println(original+"is an armstrong no.....");
		}
		else{
			System.out.println(original+" is not an armstrong no!!!!! ");
		}
		}
		public static void perfectNo(){
			int no,s=0;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the no::");
			no=sc.nextInt();
			int original=no;
			System.out.println("factors of "+no+"are::");
			for(int i=1;i<no;i++){
				if(no%i==0){
				System.out.println(i+"\t");	
				s=s+i;
				}
			}
			if(s==original){
				System.out.println(original+"is a perfect no");
			}
			else{
				System.out.println(original+"is not a perfect no");
			}
		}
		
		
	
	
}
