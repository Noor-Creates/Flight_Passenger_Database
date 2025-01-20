import java.util.*;
import java.io.*;

public class Flight {
    private static ArrayList<Passenger> passengers;

    public Flight()
    {
        passengers = new ArrayList<>();
    }

    public void addDataFromFile(String fileName) {
        String passportNo, lastName;
        char gender;
        try {
            File fw = new File(fileName);
            Scanner sc = new Scanner(fw);
            while (sc.hasNext())
            {
                passportNo = sc.next();
                lastName = sc.next();
                gender = sc.next().charAt(0);
                Passenger x = new Passenger(passportNo, lastName, gender);
                if (!(passengers.contains(x))) {
                    passengers.add(x);
                } else
                    System.out.println("The name is already in the list try again");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int genderFrequency(char gender) {
        int count = 0;
        for (Passenger x : passengers) {
            if (x.getGender() == gender)
                count++;
        }
        return count;
    }

    public static void printSorted() {
        Collections.sort(passengers);
        for (Passenger x : passengers)
            System.out.println(x);
    }
}
    
