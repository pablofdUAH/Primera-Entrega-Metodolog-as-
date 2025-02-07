package ent1.eja.e3;

public class Employee {
    private int id;
    private String firstName;
    private String lastname;
    private int salary;
    public Employee(int id,String firstName,String lastname,int salary){
        this.id = id;
        this.firstName=firstName;
        this.lastname=lastname;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public String getName(){
        return firstName+" "+lastname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
    return    salary*12;
    }
    public int raiseSalary(int percent){
        salary = salary + salary*percent/100;
        return (salary + salary*(percent/100));
    }

    @Override
    public String toString(){
        return "Employee[id="+id+",name="+getName()+",salary="+salary+"]";
    }
}

