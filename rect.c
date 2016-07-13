
#include<stdio.h>
#include<graphics.h>
#include<conio.h>

int main(){
int side1,side2,side3,side4,side5,side6,side7,side8;
   int gd = DETECT,gm;
   initgraph(&gd, &gm, "C:\\TC\\BGI");
scanf("%d%d%d%d%d%d%d%d",
   /* Draw rectangle on screen */
   rectangle(side1, side2,side3, side4);
   rectangle(side5,side6,side7,side8);
   if(side1<=side5 && side3<=side7)
   {
   printf("true");

  

   getch();
   closegraph();
   return 0;
}
