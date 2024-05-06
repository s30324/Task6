import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Goal> listOfManagerGoals = new ArrayList<>();
    private ArrayList<Manager> listOfManagers = new ArrayList<>();
    public int numberOfManagers = 0;
    public int manBonus = 0;
    public int baseSalary = 3000;
    public Manager(String name, String lname, String city, String email, String PESEL, int yearOfEmployment) {
        this.name = name;
        this.lname = lname;
        this.city = city;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
        numberOfManagers += 1;

    }
    public int calculateSalary() {
            int toBePaid = 0;
            toBePaid += baseSalary + (2023 - yearOfEmployment) * 1000;
            return toBePaid + manBonus;
        }
    public void addManToList(Manager manager){
        listOfManagers.add(manager);
    }
    public void addGoals(Goal goal){
        listOfManagerGoals.add(goal);
        for (Goal g : listOfManagerGoals) {
            manBonus += g.getManBonus();
        }
    }

    public ArrayList<Goal> getListOfManagerGoals() {
        return listOfManagerGoals;
    }

    public int getNumberOfManagers() {
        return numberOfManagers;
    }
}
