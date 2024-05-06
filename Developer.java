import java.util.ArrayList;

public class Developer extends Employee {
    public ArrayList<Technology> listOfFamiliarTechnologies = new ArrayList<>();
    public ArrayList<Developer> listOfDevelopers = new ArrayList<>();
    public int numberOfDevelopers = 0;
    public int devBonus = 0;
    public int baseSalary = 3000;
    public int calculateSalary() {
        int toBePaid = 0;
        toBePaid += baseSalary + (2023 - yearOfEmployment) * 1000;
        return toBePaid + devBonus;
    }

    public Developer(String name, String lname, String city, String email, String PESEL, int yearOfEmployment) {
        this.name = name;
        this.lname = lname;
        this.city = city;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
        numberOfDevelopers += 1;
    }
    public void addDevToList(Developer developer){
        listOfDevelopers.add(developer);
    }

    public void addTechnology(Technology technology){
        listOfFamiliarTechnologies.add(technology);
        for (Technology tech : listOfFamiliarTechnologies) {
            devBonus += tech.getTechBonus();
        }
    }

    public ArrayList<Technology> getListOfFamiliarTechnologies() {
        return listOfFamiliarTechnologies;
    }

    public int getNumberOfDevelopers() {
        return numberOfDevelopers;
    }
}
