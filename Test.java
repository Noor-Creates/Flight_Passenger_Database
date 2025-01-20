public class Test
{
    public static void main (String[] args){
        Flight myFlight = new Flight();
        myFlight.addDataFromFile("src/passengers.txt");
        System.out.println("Frequency is: " + myFlight.genderFrequency('M'));
        myFlight.printSorted();
    }

}


