import java.util.*;
public class matrix{
public static void main(String[] args)
{
int m,n;
Scanner sc=new Scanner (System.in);
System.out.println("enter row:");
m=sc.nextInt();
System.out.println ("enter column:");
n=sc.nextInt();
int[][] matrix1=new int[m][n];
int[][] matrix2=new int[m][n];
int[][] matrix3=new int[m][n];
System.out.println ("enter first matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix1[i][j]=sc.nextInt();
}
}
System.out.println ("enter second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix2[i][j]=sc.nextInt();
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
System.out.println ("addition of 2 matrix is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
System.out.print(matrix3 [i][j]+"\t");
}
System.out.println();
}
}

