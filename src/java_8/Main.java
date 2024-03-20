package java_8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>(Arrays.asList(
                new Employee(101, "Siddhesh"),
                new Employee(102, "Dixit"),
                new Employee(103, "Karan"),
                new Employee(104, "Ramesh"),
                new Employee(105, "Suresh")
        ));
        System.out.println("Initial list : " + emp);

        // first approach
/*
        Comparator<Employee> comparator = new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                return o1.getEmpName().compareTo(o2.getEmpName());
            }
        };

        Collections.sort(emp, comparator);
        System.out.println("After sorting list : " + emp);
*/

        // second approach
/*
        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmpName().compareTo(o2.getEmpName());
            }
        });

        System.out.println("After sorting list : " + emp);
*/

        // third approach : using lambda
/*
        Collections.sort(emp, (e1, e2) ->
                e1.getEmpName().compareTo(e2.getEmpName())
        );
        System.out.println("After sorting list : " + emp);
*/

        // fourth approach : method reference
        // class_name :: method_name
        emp.sort(Comparator.comparing(Employee::getEmpName));
        System.out.println("After sorting list : " + emp);

    }
}