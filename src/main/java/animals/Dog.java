package animals;

public class Dog extends Animal{
    public Dog(String food, boolean isMammal, String breed){
        super(food, isMammal);
        this.breed = breed;
    }

    @Override
    public String eat(){
        return  super.eat() + " but a dog eats: " + getFood();
    }


}
