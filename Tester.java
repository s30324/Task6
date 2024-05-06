import java.util.ArrayList;

public class Tester extends Employee {

    private ArrayList<String> listOfFamiliarTests = new ArrayList<>();
    private ArrayList<Tester> listOfTesters = new ArrayList<>();
    public  int tesBonus = 0;
    public int numberOfTesters = 0;
    public int baseSalary = 3000;
    public Tester(String name, String lname, String city, String email, String PESEL, int yearOfEmployment) {
        this.name = name;
        this.lname = lname;
        this.city = city;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
        numberOfTesters += 1;
    }
    public int calculateSalary() {
        int toBePaid = 0;
        toBePaid += baseSalary + (2023 - yearOfEmployment) * 1000;
        return toBePaid + tesBonus;
    }
    public void addTesToList(Tester tester){
        listOfTesters.add(tester);
    }


    public void addTestType(String string){
        listOfFamiliarTests.add(string);
        tesBonus = tesBonus + 300;
    }

    public ArrayList<String> getListOfFamiliarTests() {
        return listOfFamiliarTests;
    }

    public int getNumberOfTesters() {
        return numberOfTesters;
    }
}
