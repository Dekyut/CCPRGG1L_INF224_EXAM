public class App {
    public static void main(String[] args)  {
        Student Derek = new Student();

        Derek.firstname = " Derek";
        Derek.surname = " Honrubia";
        Derek.middleInitial = " C";
        Derek.dateOfBirth = " 04/15/2004";
        Derek.studentNumber = 2022104573;
        Derek.studentEmailAddress = " honrubiadc@students.national-u.edu.ph";
        Derek.iAmAwesome =  true;

        Derek.sayMySurname();
        Derek.sayMyFirstName();
        Derek.sayMymiddleInitial();
        Derek.sayMydateOfBirth();
        Derek.sayMystudentNumber();
        Derek.sayMystudentEmailAddress();
        Derek.sayAmIAwesone();
}
}
