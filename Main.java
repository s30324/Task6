import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();



        Developer dev = new Developer("Wiktor","Krzak","Warsaw","krzakson@gmail.com","45678455676",2020);
        Technology Java= new Technology("Java",500);
        dev.addTechnology(Java);
        employees.add(dev);
        dev.addDevToList(dev);

        Developer dev2 = new Developer("Wiktoar","Krzaak","Warasaw","krzaksaon@gmail.com","456783455676",2018);
        Technology Java2= new Technology("Java",800);
        dev2.addTechnology(Java2);
        employees.add(dev2);
        dev2.addDevToList(dev2);

        Tester tes = new Tester("Piotr","Oponka","Piastów","oponowski@gmail.com","50502469700",2021);
        tes.addTestType("UI/UX");
        employees.add(tes);
        tes.addTesToList(tes);

        Manager man = new Manager("Leon","Sobota","Warsaw","lsobota@gmail.com","04230901443",2019);
        Goal g = new Goal(2024,10,12,"Implementing change",2000);
        man.addGoals(g);
        employees.add(man);
        man.addManToList(man);

        double totalAmount = 0.0;
        for(Employee e : employees){
            totalAmount += e.calculateSalary();
        }



        System.out.println("Total salary to be paid is: " +  totalAmount+ " zl");
    }
}
