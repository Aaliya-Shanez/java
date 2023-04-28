import java.util.*;
class Cpu {
int price=34000;
class processor {
int noofCores=4;
String manufactures="intel corp";
void display() {
System.out.println("noofCores:"+ noofCores);
System.out.println("manufacture:"+ manufactures);
}
}
void display(){
processor p= new processor();
p.display();
System.out.println("price:"+ price);
}
static class Ram{
int memory =8;
String manufacture="intercode";
void display(){
System.out.println("memory"+ memory);
System.out.println("manufacture:"+ manufacture);
}
}
}
class Cpus{
public static void main (String[] args){
Cpu c1 = new Cpu();
c1.display();
Cpu.Ram r1 =new Cpu.Ram();
r1.display();
}
}
