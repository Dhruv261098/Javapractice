public class Employee {

    String name;
    int age;
    double salary;
    String location;

    static void announceMent(){
        System.out.println("Just Employee Details");
    }

    Employee(String name, int age, double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }


    void raiseSalary(){
        this.salary += 0.10 * this.salary;
    }

}
