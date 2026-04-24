abstract class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    abstract void show();
}
class Child extends Student{
    int roll;
    Child(String name, int age, int roll){
        super(name, age);
        this.roll = roll;
    }
    void show(){
        System.out.println(name + " " + age + " " + roll);
    }
}
public class Main{
    public static void main(String[] args){
        Child c = new Child("John", 20, 101);
        c.show();
    }
}   