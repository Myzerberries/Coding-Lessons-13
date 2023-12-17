public class Worker {

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.getAge(65);
        salariedEmployee.collectPay(123456);
        salariedEmployee.terminate("11/11/11");
        salariedEmployee.retire(true);
        salariedEmployee.Name("Bob");
        salariedEmployee.employeeId(555);
        salariedEmployee.birthDate("01/01/55");
        salariedEmployee.endDate("01/01/23");
        salariedEmployee.hireDate("01/01/01");
        salariedEmployee.annualSalary(500_000.00);

        System.out.println(salariedEmployee);
    }

    protected String name;
    protected String birthDate;
    protected String endDate;

    public int getAge(int age){
        return age;
    }

    public double collectPay(double pay){
        return pay;
    }

    public String terminate(String endDate){
        return endDate;
    }

}

class Employee extends Worker{

    protected long employeeId;
    protected String hireDate;

}

class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    //Method for class:
    public boolean retire(boolean retire){
        this.isRetired = retire;
        return retire;
    }

    //Methods for calling:

    public String Name(String name){
        this.name = name;
        return name;
    }

    public double annualSalary(double salary){
        this.annualSalary = salary;
        return salary;
    }

    public String birthDate(String birthDate){
        this.birthDate = birthDate;
        return birthDate;
    }

    public String endDate(String endDate){
        this.endDate = endDate;
        return endDate;
    }

    public String hireDate(String hireDate){
        this.hireDate = hireDate;
        return hireDate;
    }

    public long employeeId(long id){
        this.employeeId = id;
        return id;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
