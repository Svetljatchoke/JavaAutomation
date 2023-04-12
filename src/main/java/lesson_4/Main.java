package lesson_4;

public class Main {
    public static void main(String args[]){
        Cat[] catsArray = new Cat[10];
        catsArray[0] = new Cat("Cat 1", 2);
        catsArray[1] = new Cat("Cat 2", 3);
        catsArray[2] = new Cat("Cat 3", 5);
        catsArray[3] = new Cat("Cat 4", 8);
        catsArray[4] = new Cat("Cat 5", 13);
        catsArray[5] = new Cat("Cat 6", 21);
        catsArray[6] = new Cat("Cat 7", 34);
        catsArray[7] = new Cat("Cat 8", 55);
        catsArray[8] = new Cat("Cat 9", 89);
        catsArray[9] = new Cat("Cat 10", 144);

        Dog[] dogsArray = new Dog[7];
        dogsArray[0] = new Dog ("Dog 1", 25);
        dogsArray[1] = new Dog ("Dog 2", 25);
        dogsArray[2] = new Dog ("Dog 3", 25);
        dogsArray[3] = new Dog ("Dog 4", 25);
        dogsArray[4] = new Dog ("Dog 5", 25);
        dogsArray[5] = new Dog ("Dog 6", 25);
        dogsArray[6] = new Dog ("Dog 7", 25);

        Plate catsPlate = new Plate(100);
        Plate dogsPlate = new Plate(174);
        feedAnimals(dogsArray, dogsPlate);
        howAnimalsSatiety(dogsArray);
        dogsPlate.info();
    }
    static void feedAnimals(Animal[] animalsArray, Plate plate){
        for (int i = 0; i < animalsArray.length; i++){
            animalsArray[i].eat(plate);
        }
    }

    static void howAnimalsSatiety(Animal[] animalsArray){
        for (int i = 0; i < animalsArray.length; i++){
            animalsArray[i].info();
        }
    }
}
