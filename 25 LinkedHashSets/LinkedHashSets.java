import java.util.*;
public class LinkedHashSets{
public static void main(String args[]){
LinkedHashSet<String> set=new LinkedHashSet<String>();
set.add("a");
set.add("b");
set.add("c");
set.add("d");
Iterator<String> itr=set.iterator();
System.out.println("The Elements in the set:");
while(itr.hasNext()){
System.out.println(itr.next()+" ");
}
}
}
