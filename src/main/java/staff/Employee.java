package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public void raiseSalary(double amountToRaise){
        if (amountToRaise > 0){
            this.salary += amountToRaise;
        }
    }

    public double getPayBonus(){
        return this.salary / 100;
    }

    public void changeName(String newName){
        if (newName != null){
            this.name = newName;
        }
    }
}
