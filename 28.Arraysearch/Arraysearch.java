import java.util.*;
import java.util.Arrays;
class Arraysearch {
public static void main(String[]Args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter no. of elements: ");
int size=sc.nextInt();
int numbers[]=new int [size];
System.out.print("\nEnter elements of Array: ");
for (int i=0;i<size;i++)
{
numbers[i]=sc.nextInt();
}
ArraySearch as=new ArraySearch();


do{
System.out.print("\n\nEnter the elements to search: ");
int se=sc.nextInt();
System.out.print("\n\nSearch Methods in Array\n------------------------");
System.out.print("\n1.Linear Search\n2.Simple Binary Search\n3.Recursive Binary Search\n4.Built in Binary Search\n5.Exit");
System.out.print("\n\nEnter your option: ");
int opt=sc.nextInt();
int result=-1;
switch(opt)
{
case 1: result=as.linearsearch(se,numbers);
       if(result!=-1){        
       System.out.println("Item Found");}
       else{System.out.println("Item not Found");}
        System.out.println("\n\nDo you want to exit?\n1.Yes\n2.No");
System.out.print("Choose your option: ");
        int ch=sc.nextInt();
        
        if(ch==1){System.exit(0);}
        break;
case 2: Arrays.sort(numbers);
        result=as.simplebinarysearch(se,numbers);
        if(result!=-1){        
        System.out.println("Item Found");}
        else{System.out.println("Item not Found");}
System.out.println("\n\nDo you want to exit?\n1.Yes\n2.No");
System.out.print("Choose your option: ");
        ch=sc.nextInt();
        if(ch==1){System.exit(0);}
break;
case 3:Arrays.sort(numbers);
       result=as.RecursiveBinarySearch(numbers,0,size-1,se);
if(result>-1)
{
System.out.println(" Item found");
}
else
{
System.out.println("Item not found");
}
System.out.println("\n\nDo you want to exit?\n1.Yes\n2.No");
System.out.print("Choose your option: ");
        ch=sc.nextInt();
        if(ch==1){System.exit(0);}
       break;

case 4:Arrays.sort(numbers);
       result=Arrays.binarySearch(numbers,se);
       if(result>-1)
{
System.out.println(" Item found");
}
else
{
System.out.println("Item not found");}
System.out.println("\n\nDo you want to exit?\n1.Yes\n2.No");
System.out.print("Choose your option: ");
        ch=sc.nextInt();
        if(ch==1){System.exit(0);}
break;

case 5:System.exit(0);
}}while(true);}
//linear search
int linearsearch(int n,int[]numbers)
{
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]==n)
{
return 1;
}
}
return -1;
}
 
//simple binary search
int simplebinarysearch(int n,int[]numbers)
{
int first=0;
int last=numbers.length -1;
int mid=(first+last)/2;
while (first<=last)
{
if(numbers[mid]<n)
{
first=mid+1;
}
else if(numbers[mid]>n){
last=mid-1;
}
else
{
return mid;
}
mid=(first+last)/2;
}
return -1;
}
//recursive binary search
int RecursiveBinarySearch(int[]numbers,int first,int last,int x)
{
if(first<=last)
{
int mid=first+(last-first)/2;
if(numbers[mid]==x)
{
return mid;
}
if(numbers[mid]>x)
{
return RecursiveBinarySearch(numbers,first,mid-1,x);
}
return RecursiveBinarySearch(numbers,mid+1,last,x);
}
return -1;
}
}

