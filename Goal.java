import java.util.Calendar;
import java.util.Date;

public class Goal {

    public String goalName;
    public int year;
    public int month;
    public int day;
    public double manBonus;
    public Date date;
    public int yearNow = Calendar.YEAR;
    public int monthNow = Calendar.MONTH;

    public Goal( int year, int month, int day,String goalName, double manBonus) {
        this.goalName = goalName;
        this.year = year;
        this.month = month;
        this.day = day;
        if(year == yearNow && month == monthNow){
            this.manBonus = manBonus;
        }



    }
    public double getManBonus() {
            if(year == yearNow && month == monthNow){
                return manBonus;
            }
        return manBonus ;
    }


}
