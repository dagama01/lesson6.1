package kz.gb.kanat;
public class Cat extends Animal {
    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println("Кот не может бегать больше 200м");
        } else {
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не может плавать!");
    }
}
