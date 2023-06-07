import java.util.Scanner;
class Multiplication extends Thread{
public void run()
{
try{
for(int i=0;i<=10;i++){
System.out.println(i + "x5:"+(i*5));
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("Multiplication Thread interuppted");
}
}
}
class prime extends Thread{
int limit,count,flag,i,j;
prime(int limit){
this.limit = limit;
}
public void run(){
try{
int j=2;
while(count<limit){
flag=1;
for(i=2;i<=(j-1);i++){
if(j%i==0)
{
flag=0;
break;
}
}
if(flag==1)
{
System.out.println("prime number:"+j);
count++;
}
j++;
Thread.sleep(500);
}
}
catch(InterruptedException e){
System.out.println(" prime thread interuppted ");
}
}
}
class Threads {
public static void main(String[] args)
{
Multiplication mul=new Multiplication();
Scanner sc =new Scanner(System.in);
System.out.print("enter the no of prime number:");
int h=sc.nextInt();
prime p = new prime(h);
mul.start();
p.start();
}
}

