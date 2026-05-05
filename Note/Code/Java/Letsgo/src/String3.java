import java.lang.classfile.Superclass;

abstract class Employee {
    String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public abstract double ComputeSalary();
    
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "姓名：" + name + "，工资：" + ComputeSalary();
    }
}

class Manager extends Employee {
    private double monthlySalary;
    
    public Manager(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    public double ComputeSalary() {
        return monthlySalary;
    }
    
    @Override
    public String toString() {
        return "经理 - " + super.toString();
    }
}

class Salesman extends Employee {
    private double baseSalary;
    private double salesAmount;
    private double commissionRate;
    
    public Salesman(String name, double baseSalary, double salesAmount, double commissionRate) {
        super(name);
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }
    
    @Override
    public double ComputeSalary() {
        return baseSalary + salesAmount * commissionRate;
    }
    
    @Override
    public String toString() {
        return "销售人员 - " + super.toString();
    }
}

class Worker extends Employee {
    private double dailyWage;
    private int workDays;
    
    public Worker(String name, double dailyWage, int workDays) {
        super(name);
        this.dailyWage = dailyWage;
        this.workDays = workDays;
    }
    
    @Override
    public double ComputeSalary() {
        return dailyWage * workDays;
    }
    
    @Override
    public String toString() {
        return "工人 - " + super.toString();
    }
}


public class String3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        
        employees[0] = new Manager("张三", 15000.0);
        employees[1] = new Manager("李四", 18000.0);
        employees[2] = new Salesman("王五", 5000.0, 50000.0, 0.05);
        employees[3] = new Worker("赵六", 300.0, 22);
        
        System.out.println("===== 雇员工资表 =====");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
        
        System.out.println("\n===== 单独演示 =====");
        Manager manager = new Manager("Tom", 20000.0);
        System.out.println(manager.toString());
        
        Salesman salesman = new Salesman("Alice", 6000.0, 80000.0, 0.08);
        System.out.println(salesman.toString());
        
        Worker worker = new Worker("Bob", 350.0, 20);
        System.out.println(worker.toString());
    }
}
