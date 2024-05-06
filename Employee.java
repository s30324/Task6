import java.util.ArrayList;

public class Employee {
    public String name;
    public String lname;
    public String city;
    public String email;
    public String PESEL;
    public int yearOfEmployment;
    public int baseSalary = 3000;
    public int salary = baseSalary + (2023 - yearOfEmployment) * 1000;

    public ArrayList<Employee> employees = new ArrayList<>();

    public int calculateSalary(){
        int toBePaid = 0;
        for(Employee e : employees){
            toBePaid += e.baseSalary + (2023 - e.yearOfEmployment) * 1000;
        }
        return toBePaid;
    }


    public void add(Developer developer){
        employees.add(developer);
    }
    public void add(Manager manager){
        employees.add(manager);
    }
    public void add(Tester tester){
        employees.add(tester);
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPESEL() {
        return PESEL;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
