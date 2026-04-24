interface Student1{
    void show();        //no body
}
class Child1 implements Student1{
    String name;
    int age;
    Child1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println(name + " " + age);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Child1 c = new Child1("John", 20);
        c.show();
    }

    
}
