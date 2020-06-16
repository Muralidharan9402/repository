

public class Tester {
    public static void main(String[] args) {
        StringFormatter1 output;
        output= (String firstName, String lastName)->firstName+" "+lastName;
        System.out.println(output.format("Harry", "Potter"));
        output= (String firstName, String lastName)->firstName+" - "+lastName;
        System.out.println(output.format("Harry", "Potter"));
        output= (String firstName, String lastName)->firstName.toUpperCase()+" "+lastName.toUpperCase();
        System.out.println(output.format("Harry", "Potter"));
    }

}