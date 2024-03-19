import java.util.*;
import java.util.Enumeration;

public class ArrList {
    public static void main(String [] args) {
        ArrayList<String> colors = new ArrayList<>();

        // Q1 -----------------------------------------------
        System.out.println("-------------------------Q1-------------------------");
        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add("green");

//        // printing arraylist
        System.out.println(colors);
//
//        // Q2 -----------------------------------------------
        System.out.println("-------------------------Q2-------------------------");
        // iterate through loop
        // for loop
        System.out.println("using for : ");
        for (String s : colors) {
            System.out.println(s);
        }

        // for each
        System.out.println("using for each : ");
        colors.forEach(System.out::println);

        // while loop
        System.out.println("Using while loop : ");
        Iterator<String> iterator = colors.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        // iterator
        System.out.println("Usig iterator : ");
        Enumeration<String> e = Collections.enumeration(colors);
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        // Q3 -------------------------------------------
        System.out.println("-------------------------Q3-------------------------");
        colors.addFirst("pink");
        System.out.println(colors);

        // Q4 -------------------------------------------
        System.out.println("-------------------------Q4-------------------------");
        System.out.println(colors.get(3));

        // Q5 -------------------------------------------
        System.out.println("-------------------------Q5-------------------------");
        System.out.println("before change : " + colors);
        colors.set(3, "black");
        System.out.println("After change : " + colors);

        // Q6 -------------------------------------------
        System.out.println("-------------------------Q6-------------------------");
        colors.remove(2);
        System.out.println("after removing : " + colors);

        // Q7 -------------------------------------------
        System.out.println("-------------------------Q7-------------------------");
        if(colors.contains("gray")){
            System.out.println("element found");
        }else{
            System.out.println("element not found");
        }

        // Q8 -------------------------------------------
        System.out.println("-------------------------Q8-------------------------");
        Collections.sort(colors);
        System.out.println(colors);

        // Q9 ------------------------------------------
        System.out.println("-------------------------Q9-------------------------");
        ArrayList<String> color2 = new ArrayList<>();
        color2.add("black");
//        color2.add("red");
        color2.add("orange");
        color2.add("gray");
        color2.add("blue");

        Collections.copy(color2, colors);
        System.out.println("original arrList : " + colors);
        System.out.println("copied arrList : " + color2);

        // Q10 ----------------------------------------
        System.out.println("-------------------------Q10-------------------------");
        Collections.shuffle(color2);
        System.out.println(color2);

        // Q11 ---------------------------------------
        System.out.println("-------------------------Q11-------------------------");
        System.out.println("Default order : " + colors);
        System.out.println("reversed : " + colors.reversed());

        // Q12 ---------------------------------------
        System.out.println("-------------------------Q12-------------------------");
        System.out.println("original list : " + color2);
        List<String> subList = color2.subList(0,3);
        System.out.println("after extracting : " + subList);

        // Q13 ---------------------------------------
        System.out.println("-------------------------Q13-------------------------");
        Collections.copy(color2, colors);
        System.out.println(colors);
        System.out.println(color2);
        if(colors.equals(color2)){
            System.out.println("Matching arraylist");
        }
        else{
            System.out.println("Not matching arraylist");
        }

        // Q14 ---------------------------------------
        System.out.println("-------------------------Q14-------------------------");
        Collections.swap(colors, 0, colors.indexOf(colors.getLast()));
        System.out.println(colors);

        // Q15 ---------------------------------------
        System.out.println("-------------------------Q15-------------------------");
        ArrayList<String> joinList = new ArrayList<>();
        joinList.addAll(colors);
        joinList.addAll(color2);
        System.out.println(joinList);

        // Q16 ---------------------------------------
        System.out.println("-------------------------Q16-------------------------");
        ArrayList<String> newClonedList = (ArrayList<String>) joinList.clone();
        System.out.println(newClonedList);

        // Q17 ---------------------------------------
        System.out.println("-------------------------Q17-------------------------");
//        newClonedList.clear();
        System.out.println(newClonedList);

        // Q18 ---------------------------------------
        System.out.println("-------------------------Q18-------------------------");
        if(newClonedList.isEmpty()){
            System.out.println("empty list");
        }
        else{
            System.out.println("not empty list");
            System.out.println(newClonedList);
        }

        // Q19------------------------------------
        System.out.println("-------------------------Q19-------------------------");
        joinList.trimToSize();
        System.out.println("After trimming : " + joinList);

        // Q20------------------------------------
        System.out.println("-------------------------Q20------------------------");
        System.out.println(colors);
        colors.ensureCapacity(8);

        // Q21------------------------------------
        System.out.println("-------------------------Q21------------------------");
        System.out.println(colors);
        colors.set(1, "orange");
        System.out.println(colors);

        // Q22------------------------------------
        System.out.println("-------------------------Q22------------------------");
        for(int i=0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }

        System.out.println("Hello world");
    }
}
