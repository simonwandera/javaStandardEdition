package src.assignment.introduction;

public class Introduction {

    public void javaIntroduction() {
        String message = "Good morning";

        float height = 5.9f;
        double weight = 70.5;
        var isStudent = 21;
        char initial = 'P';
        long phoneNumber = 1234567890;

        byte range = 100; //-128 to 127
        short range2 = 1000; //-32,768 to 32,767
        int range3 = 1000000; //-2,147,483,648 to 2,147,483,647 (-2^31 to 2^31-1)
        long range4 = 10000000000L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63-1)



//        bit , bytes

        char letter = '\u0059'; // ASCII value of 'A'
        char a = 'a';
        char b = 68; // ASCII value of 'D'

        System.out.println(letter);

        String name = "Pacific";
        String secondName = null;

        if (name != null && secondName != null) {
            String fullname = name.concat(" ").concat(secondName);
            System.out.println(fullname);
        }else {
            System.out.println("Name is null");
        }





        int age  = 23;

        double newAge = age;

        System.out.println("Age is " + newAge);

        System.out.println(" " + name + "!");


//        System.out.println(message + " " + name + "!");
//        System.out.println("Age: " + age);
//        System.out.println("Height: " + height);
//        System.out.println("Weight: " + weight);
//        System.out.println("Is Student: " + isStudent);
//        System.out.println("Initial: " + initial);
//        System.out.println("Phone Number: " + phoneNumber);

        //    Multi line comments
    /*

    public static void main(String[] args) {
        YesNo sendNotification = YesNo.YES;
        System.out.println("Send Notification: " + sendNotification);
     */


    /*
    step1 . Get account A details
    step2. Check balance


     */

    }
}
