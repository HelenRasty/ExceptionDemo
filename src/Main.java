public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Henry", "Willson", 25);
        try {
            person1.setAge(121);
        } catch(InvalidAgeException excpObj) {
            System.out.println("The age of the person is less than 1 year or greater than 120 years!");
            excpObj.printStackTrace();
        }
    }
}
