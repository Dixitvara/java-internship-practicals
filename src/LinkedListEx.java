import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(2);
        ll.add(25);
        ll.add(19);
        System.out.println(ll);

        // Q1 ---------------------------------------------
        System.out.println("-------------------------Q1-----------------------");
        ll.addLast(41);
        System.out.println(ll);

        // Q2 ---------------------------------------------
        System.out.println("-------------------------Q2-----------------------");
        for (Integer i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Q3 ---------------------------------------------
        System.out.println("-------------------------Q3-----------------------");
        Iterator<Integer> iterator = ll.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Q4 --------------------------------------------
        System.out.println("-------------------------Q4-----------------------");
        System.out.println(ll.reversed());

        // Q5 --------------------------------------------
        System.out.println("-------------------------Q5-----------------------");
        ll.add(5, 69);
        System.out.println(ll);

        // Q6 --------------------------------------------
        System.out.println("-------------------------Q6-----------------------");
        System.out.println(ll);
        ll.addFirst(1);
        ll.addLast(63);
        System.out.println(ll);

        // Q7 --------------------------------------------
        System.out.println("-------------------------Q7-----------------------");
        System.out.println(ll);
        ll.offerFirst(40);
        System.out.println(ll);

        // Q8 --------------------------------------------
        System.out.println("-------------------------Q8-----------------------");
        System.out.println(ll);
        ll.offerLast(77);
        System.out.println(ll);

        // Q9 --------------------------------------------
        System.out.println("-------------------------Q9-----------------------");
        LinkedList<Integer> shortLL = new LinkedList<>();
        shortLL.add(77);
        shortLL.add(59);
        shortLL.add(50);
        ll.addAll(3, shortLL);
        System.out.println(ll);

        // Q10--------------------------------------------
        System.out.println("-------------------------Q10----------------------");
        System.out.println("first ele : " + ll.getFirst());
        System.out.println("last ele : " + ll.getLast());

        // Q11--------------------------------------------
        System.out.println("-------------------------Q11----------------------");
        for(int i = 0; i < ll.size(); i++){
            System.out.println("LL[" + i + "] : " + ll.get(i));
        }

        // Q12--------------------------------------------
        System.out.println("-------------------------Q12----------------------");
        ll.remove(5);
        System.out.println(ll);

        // Q13--------------------------------------------
        System.out.println("-------------------------Q13----------------------");
        ll.pollFirst();
        ll.pollLast();
        System.out.println(ll);

        // Q14--------------------------------------------
        System.out.println("-------------------------Q14----------------------");
        ll.clear();
        System.out.println(ll);

        // Q15--------------------------------------------
        System.out.println("-------------------------Q15----------------------");
        System.out.println(shortLL);
        Collections.swap(shortLL, 0,2);
        System.out.println(shortLL);

        // Q16--------------------------------------------
        System.out.println("-------------------------Q16----------------------");
        Collections.shuffle(shortLL);
        System.out.println(shortLL);

        // Q17--------------------------------------------
        System.out.println("-------------------------Q17----------------------");
        ll.add(120);
        ll.add(0);
        ll.add(64);
        System.out.println("LL :" + ll);
        System.out.println("shortLL :" + shortLL);

        LinkedList<Integer> newCombinedLL = new LinkedList<>();
        newCombinedLL.addAll(ll);
        newCombinedLL.addAll(shortLL);
        System.out.println("combined : " + newCombinedLL);

        // Q18--------------------------------------------
        System.out.println("-------------------------Q18----------------------");
    }
}