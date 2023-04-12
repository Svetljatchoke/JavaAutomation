package lesson_4;

public class Cat extends Animal {
    final int maxSwimDistance = 0;
    final int maxRunDistance = 200;
    public static int countCat = 0;

    Cat(String name, int amountFood){
        super(name, amountFood);
        countCat++;
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
