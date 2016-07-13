
#include<stdio.h>
#include<graphics.h>
#include<conio.h>

int main(){
int side1,side2,side3,side4,side5,side6,side7,side8;
   int gd = DETECT,gm;
   initgraph(&gd, &gm, "C:\\TC\\BGI");
   printf("enter the value for the first rectangle");
scanf("%d%d%d%d",&side1,&side2,&side3,&side4);
prinntf("enter the value for the second rectangle");
scanf("%d%d%d%d",&side5,&side6,&side7,&side8);
   /* Draw rectangle on screen */
   rectangle(side1, side2,side3, side4);
   rectangle(side5,side6,side7,side8);
   if(side1<=side5 || side5<=side1) &&(side3<=side6 || side6<=side3)
   {
   printf("true");
}
  

   getch();
   closegraph();
   return 0;
}
