
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> weights = new ArrayList<Integer>();
        weights.add(79);
        weights.add(92);
        weights.add(65);
        weights.add(80);
        System.out.println("The max value of the array is " + Collections.max (weights));
        ;Collections.reverse (weights);
        System.out.println("The reviese of this is= " +(weights) );
    }
}

/*Declare and create an array list called weights which includes
the following values: 79,92,65,
 /
80.
2. Display on the screen the maximum wight by calling a built-in method.
3. Reverse the list.
4. Display on the screen the contents of the list after reversing.
        */

