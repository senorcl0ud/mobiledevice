package people;

public class Main {
    public static void main(String[] args) {
        Person personOne = new Person("Claude" , 22 , new String[]{"sleeping", "eating", "pooping"});
        System.out.println(personOne +" " + personOne.getName() + "'s hobbies are: ");
        for (String hobby : personOne.hobbies) {
            System.out.println(hobby);
        }
        System.out.println(personOne.nativeLanguage());
        System.out.println("-----------------------------------------------");

        Person personTwo = new Person("Zamir" , 21, new String[]{"puzzles", "eating", "anime"});
        System.out.println(personTwo);
        for (String hobby : personTwo.hobbies) {
            System.out.println(hobby);
        }
        System.out.println(personTwo.nativeLanguage());
        System.out.println("-----------------------------------------------");
        for (String hobby : personOne.hobbies) {
            System.out.println(hobby);
        }
        Person personThree = new Person("Isaiah" , 20 , new String[]{"sleeping", "eating", "music"});
        System.out.println(personThree);
        for (String hobby : personThree.hobbies) {
            System.out.println(hobby);
        }
        System.out.println(personThree.nativeLanguage());
        System.out.println("-----------------------------------------------");

        Person personFour = new Person("Dwayne" , 19 , new String[]{"sports", "eating", "gaming"});
        System.out.println(personFour);
        for (String hobby : personFour.hobbies) {
            System.out.println(hobby);
        }
        System.out.println(personFour.nativeLanguage());
        System.out.println("-----------------------------------------------");

        Person personFive = new Person("JoJo" , 19 , new String[]{"anime", "drawing", "eating"});
        System.out.println(personFive);
        for (String hobby : personFive.hobbies) {
            System.out.println(hobby);
        }
        System.out.println(personFive.nativeLanguage());
        System.out.println("-----------------------------------------------");
    }
}