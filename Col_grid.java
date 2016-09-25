package ck_pro;

import java.util.Scanner;

public class Col_grid {
public char grid[][]=new char[100][100];
public int m,n;
void getsize()
{
System.out.println("Enter the M * N of the grid");
Scanner s=new Scanner(System.in);
m=s.nextInt();
n=s.nextInt();
s.close();
}
void color()
{
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j%2==0)
			{
				grid[i][j]='b';
			}
			else
			{
				grid[i][j]='w';
			}
		}
	}
}
public void main(String args[])
{
	this.getsize();
	this.color();
    char gr[][]=grid;
	for(char[] g:gr)
	{
	System.out.println(g);
	}
}
}
