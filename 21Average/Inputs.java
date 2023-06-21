import java.util.Scanner;
class NegativeIntegerException extends Exception{
public NegativeIntegerException(String msg){
super(msg);
}
}
class Inputs{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of integers: ");
int l = sc.nextInt();
int sum = 0;
System.out.println("Enter the numbers:");
try{
for(int i=0; i<l; i++){
int num = sc.nextInt();
// Exception when number is negative
if(num < 0)
throw new NegativeIntegerException(num + " is negative, only positive integers are allowed!");
else {
sum += num;
}
}
//calculates average
double average = sum / l;
System.out.println("Average: "+ average);
} catch(NegativeIntegerException e){
e.printStackTrace();
}
}
}
