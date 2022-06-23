package Animal;

public class Animal {
    private int age;
    private int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public Animal() {
    }

    public void run(){
        System.out.println("跑步");
    }

    public void eat(){
        System.out.println("进食");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
