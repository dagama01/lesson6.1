package kz.gb.kanat;

public abstract class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

public void run(int length){
    System.out.println(getName() + " пробежал " + length);

}
public void swim(int length){
    System.out.println(getName() + " проплыл " + length);
}

}

