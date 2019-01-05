import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	Rectangle r1[]=calAreaParameter();
	display(r1);
	}
	
	
	
	public static  Rectangle[] calAreaParameter(){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the count::");
	int count= sc.nextInt();
	
	Rectangle r1[]= new Rectangle[count];//to create references for the objects
	
	for(Rectangle a:r1){
		a= new Rectangle();//memory allocation to array of objects
		
		System.out.println("Enter the Length of the Rectangle:::");
		a.setLength(sc.nextInt());
		
		System.out.println("Enter the Breadth of the Rectangle:::");
		a.setBreadth(sc.nextInt());
		
		a.setArea(a.getLength()*a.getBreadth()); 
		System.out.println("AREA ::"+a.getArea());
		
		int parameter=2*(a.getLength()+a.getBreadth());
		a.setParameter(parameter); 
		System.out.println("Parameter ::"+a.getParameter());
	}
	return r1;
	
	}
	
	public static void display(Rectangle r1[]){
		System.out.println("LENGTH:\t"+"BREADTH:\t"+"AREA\t"+"Parameter\n");
		System.out.println("-------------------------------------\n");
		for(Rectangle a: r1 ){
		
		System.out.println(a.getLength()+"\t"+a.getBreadth()+"\t"+a.getArea()+"\t"+a.getParameter());
		}
		System.out.println("-------------------------------------\n");
}
}
