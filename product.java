import java.util.*;
class product{
int pcode,price;
String pname;
product(int pcode,String pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
}
class products{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println ("enter the product code");
int pcode = sc.nextInt();
System.out.println ("enter the product name");
String pname = sc.next();
System.out.println("enter the price");
int price = sc.nextInt();
product[]ps = new product[3];
ps[0]= new product(pcode,pname,price);
ps[1]= new product(135,"soap",45);
ps[2]= new product(157,"books",200);
int minprice=ps[0].price;
System.out.print("\npcode \tpname \t price");
System.out.println("\n----------------");
for(product p:ps){
System.out.print("\n"+p.pcode+"\t"+p.pname+"\t"+p.price);
if(minprice>p.price)
{
minprice=p.price;
}
}
System.out.println("\nlowest cost product");
for(product p:ps)
{
{
if(minprice==p.price)
{
System.out.print("product code :"+ p.pcode);
System.out.print ("product name:"+ p.pname);
System.out.print ("price:"+ p.price);
}
}
}
}
}


