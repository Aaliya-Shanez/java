import java.util.*;
class Cpu
{
int price=3400;
class Processor
{
int noofcores=5;
String manufacture="Intel Corp";
void display()
{
System.out.println("No.of cores:" +noofcores);
System.out.println("Manufacture:" +manufacture);
 }
 }
 void display()
{
 Processor p=new Processor();
  p.display();
 System.out.println("Price :" +price);
 }
 static class Ram
 {
 int memory =8;
 String manufacture="Info Technology";
 void display()
 {
 System.out.println("Memory :" +memory);
 System.out.println("Manufacture :" +manufacture);
 }
 }
 }
  public class Cpus
 {
  public static void main(String args[])
 {
Cpu c1=new Cpu();
c1.display();
Cpu.Ram r1=new Cpu.Ram();
r1.display();
}
}


