import java.util.Scanner;

public class MatrixADD {

	public static void main(String[] args) {
		//Matrix mat1[][]=new Matrix();
		
		int [][]mat1,mat2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****************MATRIX 1****************");
		
		mat1=intialiseMatrix();
		Display(mat1);
		
		System.out.println("*****************MATRIX 2****************");		
		
		
		mat2=intialiseMatrix();
		Display(mat2);
		
	boolean ans=compare(mat1,mat2);
	if(ans){
		int result[][]=addition(mat1,mat2);
		Display(result);
	}
	else
		System.out.println("--ADDITION NOT POSIIBLE !!!!!!!!!");
		
		
		
	}
	public static int[][] intialiseMatrix(){
		int [][]mat1;
		Matrix m=new Matrix();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows in Matrix::");
		//m.setRow(sc.nextInt());
		mat1=new int[sc.nextInt()][];
		for(int i=0;i<mat1.length;i++)
		{
			System.out.println("Enter no of colomun for row "+(i+1)+"::");
			mat1[i]=new int [sc.nextInt()];
		}
		System.out.println("------------------Enter the data for Matrix-----------");
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat1[i].length;j++){
				mat1[i][j]=sc.nextInt();
				//System.out.print(mat1[i][j]);
			}
		}
		return mat1;
		
		
		
		
	}
	public static void Display(int mat1[][]){
		System.out.println("----------------DATA Entered for Matrix-----------");
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat1[i].length;j++){
				//mat1[i][j]=sc.nextInt();
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	
	public static boolean compare(int mat1[][],int mat2[][]){
		int flag=1;
		if(mat1.length==mat2.length){
			for(int i=0;i<mat1.length;i++){
				if(mat1[i].length!=mat2[i].length)
					flag=0;
			}
		}
		if(flag==1)	
			return true;
		else 
			return false;
	}	
	

	public static int[][] addition(int mat1[][],int mat2[][]){
		int result[][];
		result= new int [mat1.length][];
		for(int j=0;j<mat1.length;j++){
			result[j]=new int [mat1[j].length];}
		
		Scanner sc =new Scanner(System.in);
		System.out.println("-----------------ADDITION is------------");
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat1[i].length;j++){
				result[i][j]=mat1[i][j]+mat2[i][j];
				}
		}
		return result;
		//Display(result);
		
	}

}
