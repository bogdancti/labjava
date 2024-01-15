package lab5;

public class Employee {
    private String name;
    private String email;
    private Integer hourRate;
    private Integer capacity;
    private Integer freeDays;


    public Employee(String name, String email, Integer hourRate, Integer capacity, Integer freeDays){
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public Integer calculateDailyIncome(){
        Integer rez = hourRate * capacity;
        return rez;
    }

    public void calculateMonthlyIncome(){
        int rez = calculateDailyIncome() * (21 - freeDays );
        System.out.println("monthly income = " + rez + " $");
    }
}
