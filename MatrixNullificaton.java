
import java.util.*;

public class MatrixNullificaton{

	public static int a, b;
	public static int[][] matrix;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter value of a : ");
		a=sc.nextInt();
		System.out.println("Enter value of b : ");
		b=sc.nextInt();
		matrix = new int [a][b];
		intitializMatrix(matrix);
		printMatrix(matrix);
		nullifiyMatrix(matrix);
		printMatrix(matrix);
		
	}

	public static void intitializMatrix(int[][] matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j =0;j<matrix[0].length;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
			//matrix[i][j] = sc.nextInt();
		}
	}

	public static void nullifiyMatrix(int[][] matrix)
	{
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];

		for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					if(matrix[i][j]==0)
					{
						row[i] = true;
						col[j] = true;
					}
				}
				System.out.println();
			}
		for(int i=0; i<matrix.length;i++)
		{
			if(row[i]==true)
				makeRowZero(matrix, i);
		}

		for(int j=0; j<matrix[0].length;j++)
		{
			if(col[j]==true)
				makeColZero(matrix, j);
		}

	}

	public static void makeRowZero(int[][] matrix, int row)
	{
		for(int j = 0; j<matrix[0].length; j++)
		{
			matrix[row][j] = 0 ;
		}

	}
	public static void makeColZero(int[][] matrix, int col)
	{
		for(int i=0; i<matrix.length; i++)
		{
			matrix[i][col] = 0;
		}

	}

	public static void printMatrix(int [][] matrix)
	{
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}