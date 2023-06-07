import java.util.*;
import java.util.Scanner;
class Publisher
{
String pubname;
Publisher(String pubname)
{
this.pubname=pubname;
}
void display()
{
System.out.println("Publisher\t:"+pubname);
}
}
class Book extends Publisher
{
String title;
String author;
Book(String pubname,String title,String author)
{
super(pubname);
this.title=title;
this.author=author;
}
void display()
{
super.display();
System.out.println("Title\t\t:"+ title);
System.out.println("Author\t\t:"+ author);
}
}
class Literature extends Book
{
String type;
Literature(String pubname,String title,String author,String type)
{
super(pubname,title,author);
this.type=type;
}
void display()
{
super.display();
System.out.println("Type\t\t:"+ type);
}
}
class Fiction extends Book
{
String genre;
Fiction(String pubname,String title,String author,String genre)
{
super(pubname,title,author);
this.genre=genre;
}
void display()
{
super.display();
System.out.println("Genre\t\t:"+genre);
}
}
class Books
{
public static void main (String[] args)
{
Literature[] l= new Literature[2];
Fiction[] f= new Fiction[2];
l[0]=new Literature("Harper collins","The Alchemist","Paulo coelo","Drama");
l[1]=new Literature("DC books","Arachar","K.R Meera","Novel");
f[0]=new Fiction("Cassel","Macbeth","William shakspeare","Tragedy");
f[1]=new Fiction("Pengui books"," The legend of khasak","O.V vijayan","Magical realism");
System.out.println("\t Literature");
System.out.println("-------------------------------------------------");
for(int i=0;i<l.length;i++)
{
System.out.println("#"+(i+1));
l[i].display();
}
System.out.println("\tFiction");
System.out.println("-------------------------------------------------");
for(int i=0;i<f.length;i++)
{
System.out.println("#"+(i+1));
f[i].display();
}
}
}
