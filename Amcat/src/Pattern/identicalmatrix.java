package Pattern;



	import java.util.Scanner;
	 
	public class identicalmatrix
	{    
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	       /* Scanner sc = new Scanner(System.in);
	         
	        System.out.println("Enter the no. of rows : ");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Enter the no. of columns : ");
	         
	        int cols = sc.nextInt();*/
	        int rows=3;
	        int cols=3;
	        int matrix[][] = new int[rows][cols];
	         
	        System.out.println("Enter the elements :");
	         
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++)
	            {
	            	
	                matrix[i][j] = sc.nextInt();
	            }
	        }
	         
	        System.out.println("Printing the input matrix :");
	         
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++)
	            {
	                System.out.print(matrix[i][j]+"\t");
	            }
	             
	            System.out.println();
	        }
	        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
	        
	      //printing 2D array  
	      for(int i=0;i<3;i++){  
	       for(int j=0;j<3;j++){  
	         System.out.print(arr[i][j]+" ");  
	       }  
	       System.out.println();  
	      }  
	        //Checking the input matrix for symmetric
	         
	        if(rows != cols)
	        {
	            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
	        }
	        else
	        {
	            boolean symmetric = true;
	             
	            for (int i = 0; i < rows; i++)
	            {
	                for (int j = 0; j < cols; j++)
	                {
	                    if(matrix[i][j] != matrix[j][i])
	                    {
	                        symmetric = false;
	                        break;
	                    }
	                }
	            }
	             
	            if(symmetric)
	            {
	                System.out.println("The given matrix is symmetric...");
	            }
	            else
	            {
	                System.out.println("The given matrix is not symmetric...");
	            }
	        }
	         
	        sc.close();
	    }
	}
	
