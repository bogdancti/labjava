package lab4;



public class student extends person{

    private int[] grades = new int[5];


    public void setGrades() {
        for(int i = 0 ; i < grades.length; i++){
            System.out.println("Introduceti  nota " + (i+1) + " : ");
            this.grades[i] = scanner.nextInt();
        }
    }

    public int[] getGrades(){
        return grades;
    }
}
