package emphourslinklist;
import java.util.*;

public class EmpHoursLinkList {
    
    public static void main(String[] args) {
        // Nested LinkedList that contains hours worked each day by employee
        LinkedList<LinkedList> hours = new LinkedList<>();
        
        // Extremely long and slow creation and population of LinkedLists within hours (64 add statements)
        LinkedList<Integer> hrs1 = new LinkedList<>();
        hrs1.add(2);
        hrs1.add(4);
        hrs1.add(3);
        hrs1.add(4);
        hrs1.add(5);
        hrs1.add(8);
        hrs1.add(8);
        hours.add(hrs1);
        
        LinkedList<Integer> hrs2 = new LinkedList<>();
        hrs2.add(7);
        hrs2.add(3);
        hrs2.add(4);
        hrs2.add(3);
        hrs2.add(3);
        hrs2.add(4);
        hrs2.add(4);
        hours.add(hrs2);
        
        LinkedList<Integer> hrs3 = new LinkedList<>();
        hrs3.add(3);
        hrs3.add(3);
        hrs3.add(4);
        hrs3.add(3);
        hrs3.add(3);
        hrs3.add(2);
        hrs3.add(2);
        hours.add(hrs3);
        
        LinkedList<Integer> hrs4 = new LinkedList<>();
        hrs4.add(9);
        hrs4.add(3);
        hrs4.add(4);
        hrs4.add(7);
        hrs4.add(3);
        hrs4.add(4);
        hrs4.add(1);
        hours.add(hrs4);
        
        LinkedList<Integer> hrs5 = new LinkedList<>();
        hrs5.add(3);
        hrs5.add(5);
        hrs5.add(4);
        hrs5.add(3);
        hrs5.add(6);
        hrs5.add(3);
        hrs5.add(8);
        hours.add(hrs5);
        
        LinkedList<Integer> hrs6 = new LinkedList<>();
        hrs6.add(3);
        hrs6.add(4);
        hrs6.add(4);
        hrs6.add(6);
        hrs6.add(3);
        hrs6.add(4);
        hrs6.add(4);
        hours.add(hrs6);
        
        LinkedList<Integer> hrs7 = new LinkedList<>();
        hrs7.add(3);
        hrs7.add(7);
        hrs7.add(4);
        hrs7.add(8);
        hrs7.add(3);
        hrs7.add(8);
        hrs7.add(4);
        hours.add(hrs7);
        
        LinkedList<Integer> hrs8 = new LinkedList<>();
        hrs8.add(6);
        hrs8.add(3);
        hrs8.add(5);
        hrs8.add(9);
        hrs8.add(2);
        hrs8.add(7);
        hrs8.add(9);
        hours.add(hrs8);
        
        // LinkedList that contains all the sum total hours worked
        LinkedList<Integer> totalHours = new LinkedList<>();
        
        // Populate the totalHours list with total hours
        for (int row = 0; row < 8; row++) {
            Integer sum = 0;
            for (Object col : hours.get(row)) {
                sum += (Integer) col;
            } // for
            totalHours.add(sum);
        } // for
        
        // Create a copy of the totalHours list, then rearrange the original list in descending order
        LinkedList<Integer> totalHours2;
        totalHours2 = (LinkedList) totalHours.clone();
        Collections.sort(totalHours);
        Collections.reverse(totalHours);
        
        // Nested LinkedList that contains each employee and their hours worked
        LinkedList<LinkedList> employees = new LinkedList<>();
        
        // Populate the employees list (24 add statements)
        LinkedList<Integer> emp1 = new LinkedList<>();
        emp1.add(totalHours.get(0));
        emp1.add(totalHours2.indexOf(totalHours.get(0)));
        employees.add(emp1);
        
        LinkedList<Integer> emp2 = new LinkedList<>();
        emp2.add(totalHours.get(1));
        emp2.add(totalHours2.indexOf(totalHours.get(1)));
        employees.add(emp2);
        
        LinkedList<Integer> emp3 = new LinkedList<>();
        emp3.add(totalHours.get(2));
        emp3.add(totalHours2.indexOf(totalHours.get(2)));
        employees.add(emp3);
        
        LinkedList<Integer> emp4 = new LinkedList<>();
        emp4.add(totalHours.get(3));
        emp4.add(totalHours2.indexOf(totalHours.get(3)));
        employees.add(emp4);
        
        LinkedList<Integer> emp5 = new LinkedList<>();
        emp5.add(totalHours.get(4));
        emp5.add(totalHours2.indexOf(totalHours.get(4)));
        employees.add(emp5);
        
        LinkedList<Integer> emp6 = new LinkedList<>();
        emp6.add(totalHours.get(5));
        emp6.add(totalHours2.indexOf(totalHours.get(5)));
        employees.add(emp6);
        
        LinkedList<Integer> emp7 = new LinkedList<>();
        emp7.add(totalHours.get(6));
        emp7.add(totalHours2.indexOf(totalHours.get(6)));
        employees.add(emp7);
        
        LinkedList<Integer> emp8 = new LinkedList<>();
        emp8.add(totalHours.get(7));
        emp8.add(totalHours2.indexOf(totalHours.get(7)));
        employees.add(emp8);
        // Using indexOf is so much easier than trying to sort the employees list directly that it almost feels like cheating.
        
        // Display each employee and how long they worked last week
        for (LinkedList l : employees) {
            System.out.println("Employee " + ((Integer) l.get(1) + 1) + " worked " + l.get(0) + " hours last week.");
        } // for
    } // void main
} // class EmpHoursLinkList
