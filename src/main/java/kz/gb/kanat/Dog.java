package kz.gb.kanat;

public class Dog extends Animal {
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void run(int length) {
        if (length > 500){
            System.out.println("Собака не можеть пробежать больше 500 м");
        }
        super.run(length);
    }

    @Override
    public void swim(int length) {
        if(length > 10){
            System.out.println("Собака не может плавать боьше 10 м");
        }
        super.swim(length);
    }
}
