import java.util.*; 
class LinkedLists{
public static void main(String[] args){ 
LinkedList<String>ll=new LinkedList<String>();
ll.add("a");
ll.add("b");
ll.add("c");
ll.add("d");
ll.add("e");
System.out.println("current contents of ll:"+ll);
ll.clear();
System.out.println("contents of ll after deletion:"+ll);
}
}
