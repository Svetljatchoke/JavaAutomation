package lesson_4;

public class Plate {
    private int amountFood;

    Plate(int amountFood){
        if (amountFood >= 0){
            this.amountFood = amountFood;
        }
        else{
            System.out.println("Invalid data");
            this.amountFood = 0;
        }
    }

    public int getAmountFood(){
        return amountFood;
    }

    public void setAmountFood(int amountFood) {
        this.amountFood = amountFood;
    }

    public void decreaseFood(int amountFood){
        this.amountFood -= amountFood;
    }

    public void addFood(int amountFood){
        this.amountFood += amountFood;
    }

    public void info(){
        System.out.println("there are "+ this.amountFood + " food in the plate");
    }
}
