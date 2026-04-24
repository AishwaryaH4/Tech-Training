import java.util.*;
class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Person: " + name + "," + age;
    }
}

public class Ar1 {
    public static void main(String[] args){
        ArrayList<Person> p = new ArrayList<>();

        p.add(new Person("John", 23));
        p.add(new Person("Jane", 20));

        System.out.println(p);

    }
}
