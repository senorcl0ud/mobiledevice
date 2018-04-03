package animals;

public class Main {
    public static void main(String[] args) {
        Animal aAnimal = new Animal("Living Things", true);
        Animal aCat = new Cat("Fish.", true, "tammy");
        Animal aDog = new Dog("Cats.", true, "pit bull");

        Animal[] animalArray = new Animal[]{aCat, aDog};

        for(Animal animal : animalArray){
            System.out.println(animal.eat());
        }


//        System.out.println(aAnimal.eat());
//        System.out.println(aCat.eat());
//        System.out.println(aDog.eat());
//
//        System.out.println("====================================================");
//
//        System.out.println(aCat);
//        System.out.println(aAnimal);
//        System.out.println(aDog);
    }
}
