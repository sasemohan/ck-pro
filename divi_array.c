#include<stdio.h>
#include<conio.h>
void main()
{
int a[10],b[10],c[10],i,j,k,l,sum1,sum2,num,m;
float avg1,avg2;
clrscr();
printf("enter the number of values in array");
scanf("%d",&num);
for(m=0;m<num;m++)
scanf("%d",&a[m]);

for(i=0;i<n;i++)
{
b[i]=a[i];
for(j=i;j<n;j++)
{
c[j]=a[j];
for(k=0;k<i;k++)
{
sum1=sum1+b[k];
}
for(l=0;l<j;l++)
{
sum2=sum2+c[l];
}
avg1=sum1/i;
avg2=sum2/j;
if(avg1==avg2)
{
goto terminal;
}
}
}
terminal:printf("can be done");
getch();
}
