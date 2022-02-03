class Employee{
    String name;
    String department;
    float salary;
    int allowance = 0;
    Employee(String name,int dep, float salary){ 
        this.name = name;
        this.salary = salary;
        department = "N.A.";
        if(dep ==1){
            department = "Staff";
            allowance = 1500;
        }
        else if(dep == 2){
            department = "Accounts";
            allowance = 2500;
        }
        else if(dep == 3){
            department = "Admin";
            allowance = 3500;
        }
        HRA = 0.4 *salary;
    }
    double HRA;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+ salary);
        System.out.println("Allowance: "+ allowance);
        System.out.println("HRA: "+ HRA);
        System.out.println("Total salary: "+(HRA+allowance+salary));
    }
}
public class CS0801CS201090_A3_Q1{
    public static void main(String[] args) {
        Employee e1 = new Employee("Sidharth", 1, 40000);
        Employee e2 = new Employee("Arun", 2, 50000);
        Employee e3 = new Employee("Sourabh",3, 60000);
        e1.display();
        System.out.println();
        e2.display();
        System.out.println();
        e3.display();
    }
}
