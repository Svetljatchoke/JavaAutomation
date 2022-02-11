package lesson_3;

public class Employee {
    private String name;
    private String position;
    private int age;
    private String email;
    private String phone;
    private int salary;

    public Employee(String name, String position, int age, String email, String phone, int salary){
        this.name = name;
        this.position = position;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void printEmployee(){
        System.out.println(name + ", " + position + ", " + age + ", " + email + ", " + phone + ", " + salary);
    }
}
