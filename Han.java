package ck_pro;

import java.util.Scanner;

public class Han {
    public int  place,finplace;
    public char alp[]={'C','B','A'},pla1[]=new char[3],pla2[]=new char[3],pla3[]=new char[3];
	void proces()
	{
	
		pla1=alp;
	pla2[0]=pla1[2];
	pla1[2]='\0';
	System.out.println(pla1);
	System.out.println(pla2);
	System.out.println(pla3);
	System.out.println("------------End of Operation 1----------");
	pla2[1]=pla1[1];
	pla1[1]='\0';
	System.out.println(pla1);
	System.out.println(pla2);
	System.out.println(pla3);
	System.out.println("------------End of Operation 2----------");
	pla3[0]=pla1[0];
	pla1[0]='\0';
	System.out.println(pla1);
	System.out.println(pla2);
	System.out.println(pla3);
	System.out.println("------------End of Operation 3----------");
	pla3[1]=pla2[1];
	pla2[1]='\0';
	pla3[2]=pla2[0];
	pla2[0]='\0';
	System.out.println(pla1);
	System.out.println(pla2);
	System.out.println(pla3);
	System.out.println("------------End of Operations----------");
	}
	
	public static void main(String args[])
	{   Han ob=new Han();
	ob.proces();
	}
}
