package lab5;

public class Cat {
    private String name;
    private String color;
    private Integer age;
    private Integer energyLevel;
    private Integer hungerLevel;
    private Integer moodLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat(String name, String color, Integer age){
        this.name = name;
        this.color = color;
        this.age = age;
        this.energyLevel = 3;
        this.hungerLevel = 3;
        this.moodLevel = 3;

    }

    public void play(){
        this.moodLevel++;
        this.energyLevel--;
        this.miau();
    }

    public void feed(){
        this.moodLevel++;
        this.hungerLevel--;
        this.miau();
    }

    public void sleep(){
        this.energyLevel++;
        this.hungerLevel++;
    }
    public void miau(){
        System.out.println("MIAUUUUUUUU");
    }

}
