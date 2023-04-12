package lesson_4;

public class Dog extends Animal {
    final int maxSwimDistance = 10;
    final int maxRunDistance = 500;
    public static int countDog = 0;

    Dog(String name, int amountFood){
        super(name, amountFood);
        countDog++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance){
            super.run(distance);
        }
        else System.out.println(getName() + " can not run this distance");
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance){
            super.swim(distance);
        }
        else System.out.println(getName() + " can not swim this distance");
    }
}
