
// Association : This is association because Student3 uses Teacher, but neither owns the other permanently.


class Teacher{
    String name;
    Teacher(String name){
        this.name = name;
    }
}
class Student3{
    String name;
    Student3(String name){
        this.name = name;
    }
    void learn(Teacher t){                     // Teacher t -> reference variable , t = reference variable (points to a Teacher object)
        System.out.println(name + " is learning from " + t.name);
    }
    
}

public class Main3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Dr. Smith");
        Student3 s = new Student3("Alice");
        s.learn(t);                            // passes teacher t to student s.
    }
}
