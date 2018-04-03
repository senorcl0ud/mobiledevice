package people;

public class Person {
    private String name;
    private int age;
    protected double weight;
    private String race;
    private static long id;
    public final boolean breathe = true;
    public String[] hobbies;


    public Person(){
        id++;
    }

    public Person(String name, int age, String[] hobbies){
        this();
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;

    }

    public String nativeLanguage(){
        return  this.name + " speaks English";
    }

    @Override
    public String toString(){
        return "name:  " + name + " age: " + age + " id: " + id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
