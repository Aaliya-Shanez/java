import java.util.Scanner;
class Shapes{
int area(int l){
return l*l;
}
int area(int l,int b){
return l*b;
}
int area(int l,int b,int h){
return((2*l*b)+(2*l*h)+(2*h*b));
}
public static void main(String[] args){	
Shapes s=new Shapes();
System.out.println("Area of square:"+s.area(6));
System.out.println("Area of rectangle:"+s.area(6,3));
System.out.println("Area of cuboid:"+s.area(1,3,5));
}
}
