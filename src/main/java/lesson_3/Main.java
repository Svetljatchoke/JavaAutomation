package lesson_3;

public class Main {
    public static void main (String[] args){
        Employee[] arrayEmployee = new Employee[5];
        arrayEmployee[0] = new Employee("Ivanov Ivan", "engineer", 43, "i.ivanov@gmail.com", "154-28-38", 1320);
        arrayEmployee[1] = new Employee("Victorov Victor", "accountant", 41, "v.victorov@gmail.com", "154-28-38", 720);
        arrayEmployee[2] = new Employee("Petrov Petr", "developer", 27, "p.petrov@gmail.com", "154-28-38", 4730);
        arrayEmployee[3] = new Employee("Alexeev Alex", "hr", 38, "a.alexeev@gmail.com", "154-28-38", 2820);
        arrayEmployee[4] = new Employee("Nikolaev Nic", "sale", 52, "n.nikolaev@gmail.com", "154-28-38", 3640);
        for (int i = 0; i < arrayEmployee.length; i++){
            if (arrayEmployee[i].getAge() > 40) arrayEmployee[i].printEmployee();
        }
    }
}
