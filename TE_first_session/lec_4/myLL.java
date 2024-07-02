import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class myLL {
  public static void main(String args[]) {
    LinkedList<String> ll = new LinkedList<String>();
    ll.add("Red");
    ll.add("Yellow");
    ll.add("Green");
    ll.add("Violet");
    ll.add("Blue");
    ll.add("Orange");
    ll.add("Brown");
    Iterator<String> itr = ll.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    Iterator<String> descItr = ll.descendingIterator();
    while (descItr.hasNext()) {
      System.out.println(descItr.next());
    }
    System.out.println("Normal LL");
    System.out.println(ll);
    Collections.sort(ll, Collections.reverseOrder());
    System.out.println("Reversed alphabetic sort:");
    System.out.println(ll);
  }
}
// scanner for user
// create thread with arraylist inside
// prints new arraylist inside only if something was updated
//
