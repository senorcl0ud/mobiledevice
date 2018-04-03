package animals;

public class Animal {
    private String food;
    protected String breed;
    private boolean isMammal;


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }



    public Animal(String food, boolean isMammal){
        this.food = food;
        this.isMammal = isMammal ;

    }

    public String eat(){
        return "All animals eat;";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
}
