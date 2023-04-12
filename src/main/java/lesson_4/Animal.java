package lesson_4;

public class Animal {
    public static int countAnimal = 0;
    private String name;
    private boolean satiety;
    private int amountFood;
    Animal(String name, int amountFood){
        this.name = name;
        this.amountFood = amountFood;
        satiety = false;
        countAnimal++;
    }

    public int getAmountFood(){
        return amountFood;
    }

    public void setAmountFood(int amountFood){
        this.amountFood = amountFood;
    }

    public void eat(Plate p){
        if (p.getAmountFood() >= amountFood){
            p.decreaseFood(amountFood);
            satiety = true;
        }
    }

    public String getName(){
        return name;
    }

    public void run(int distance){
        if (distance > 0){
            System.out.println(name + " has run " + distance + " m");
        }
        else if (distance == 0){
            System.out.println(name + " has not run");
        }
        else System.out.println("Invalid data");
    }

    public void swim(int distance){
        if (distance > 0){
            System.out.println(name + " has swum " + distance + " m");
        }
        else if (distance == 0){
            System.out.println(name + " has not swum");
        }
        else System.out.println("Invalid data");
    }

    public void info(){
        System.out.println(name + " has satiety " + satiety);
    }
}
