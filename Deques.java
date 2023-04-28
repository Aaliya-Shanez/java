import java.util.*;
public class Deques
{
public static void main(String[]args)
{
Deque<String>deque=new ArrayDeque<String>();
deque.add("a");
deque.add("b");
deque.add("c");
deque.add("d");
deque.add("e");
System.out.println("Elements in dequeue:");
for(String str:deque)
{
System.out.print(str+" ");
}
deque.remove();
System.out.println("\nAfter first element deleted:");
for(String str:deque)
{
System.out.print(str+" ");
}
deque.clear();
System.out.println("\nAfter all element deleted:");
for(String str:deque)
{
System.out.print(str +" ");
}
}
}
