
// Aggregation : Partial ownership

class Student4{
    String name;
    Student4(String name){
        this.name=name;
    }
}
class Department{
    String deptName;
    Student4 st;
    Department(String deptName, Student4 st){
        this.deptName = deptName;
        this.st = st;
    }
    void show(){
        System.out.println(st.name + " belongs to " + deptName);
    }
}

public class Main4 {
    public static void main(String[] args){
        Student4 s = new Student4("Aish");
        Department d = new Department("Computer Science", s);
        d.show();
    }
    
}

// Student4 can exist independently outside Department (created separately), so this is weak has-a = aggregation.
// Department does not own/create Student4.
// Student4 can exist without Department.
// Their lifecycles are independent.
// That is exactly a weak has-a relationship, i.e., aggregation (not composition).