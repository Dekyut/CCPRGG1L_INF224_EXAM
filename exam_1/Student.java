public class Student {
    
    String surname;
    String firstname;
    String middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMySurname() {
        System.out.println("My surname is" +  surname);
    }
    public void sayMyFirstName() {
        System.out.println("My first name is" +  firstname);
    }
    public void sayMymiddleInitial() {
        System.out.println("My middle initial is" +  middleInitial);
    }
    public void sayMydateOfBirth() {
        System.out.println("My date of birth is" +  dateOfBirth);
    }
    public void sayMystudentNumber() {
        System.out.println("My student number is" +  studentNumber);
    }
    public void sayMystudentEmailAddress() {
        System.out.println("My email address is" +  studentEmailAddress);
    }
    public void sayAmIAwesone() {
        System.out.println("Am I awesome?" +  iAmAwesome);
    }
}
