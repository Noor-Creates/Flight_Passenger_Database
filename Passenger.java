
public class Passenger implements Comparable <Passenger> {
    private String passportNo;
    private String lastName;
    private char gender;

    public Passenger() {

    }

    public Passenger(String passportNo, String lastName, char gender) {
        this.passportNo = passportNo;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo)
    {
        this.passportNo = passportNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return ("Passport No " + passportNo + "Last Name " + lastName + "Gender " + gender);
    }

    @Override
    public boolean equals(Object obj) {
        Passenger p = (Passenger) obj;
        return (passportNo.equals( p.passportNo) && lastName.equals(p.lastName) && gender == (p.gender));

    }

    @Override
    public int compareTo(Passenger p) {
        return (this.passportNo.compareTo(p.passportNo));
    }
}







