import java.util.*;
public class PriorityQueues{
public static void main(String args[])
{
PriorityQueue<String>queue = new PriorityQueue<String>();
queue.add("a");
queue.add("b");
queue.add("c");
queue.add("d");
queue.add("e");
System.out.print("Queue Elements:");
Iterator<String>itr=queue.iterator();
while(itr.hasNext()){
System.out.print(itr.next()+"  ");
}
}
}


