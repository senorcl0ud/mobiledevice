package animals;

public class Cat extends Animal {
    public Cat(String food, boolean isMammal, String breed) {
        super(food, isMammal);
        this.breed = breed;
    }

    @Override
    public String eat(){
        return super.eat() + " but a cat eats: " + getFood() ;
    }


}
