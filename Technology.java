public class Technology {
    public String technologyName;
    public  double techBonus;


    public Technology(String technologyName, double techBonus) {
        this.technologyName = technologyName;
        this.techBonus = techBonus;
    }


    public double getTechBonus() {
        return techBonus;
    }

    public String getTechnologyName() {
        return technologyName;
    }
}
