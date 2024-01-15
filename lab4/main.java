package lab4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog caine = new Dog("ciuciunghezu","labrador");




        int n = 0;
        do{
            System.out.println("\n\n\n1.Exercitiu returnarea mijlocului unui cuvant." +
                    "\n2.Exercitiu suma cifrelor." +
                    "\n3.Exercitiu clasa Dog." +
                    "\n4.Exercitiu clasa Rectangle (aria is perimetrul)." +
                    "\n5.Exercitiu studiul claselor Person, Student, Profesor." +
                    "\n6.Quit." +
                    "\nIntroduceti optiunea: ");
            n = scanner.nextInt();
            scanner.nextLine();
            switch(n){
                case 1:{
                    String word;
                    String rez;

                    System.out.println("Introduceti un cuvant: ");
                    word = scanner.nextLine();
                    rez = retMijloc(word);
                    System.out.printf("mijlocul cuvantului %s este %s",word,rez);
                    break;
                }
                case 2:{
                    sumCifre();
                    break;
                }
                case 3:{
                    Dog caine1 = new Dog("Aurel", "ciobanesc");
                    Dog caine2 = new Dog("Azorel", "labrador");
                    System.out.println("nume initial caine1: "+caine1.getName());
                    System.out.println("Rasa initiala caine1: "+caine1.getBreed());
                    System.out.println("Schimbati nume caie1: ");
                    String a = scanner.nextLine();
                    caine1.setName(a);
                    System.out.println("Schimbati rasa caine1: ");
                    String b = scanner.nextLine();
                    caine1.setBreed(b);
                    System.out.println("nume initial caine2: "+caine2.getName());
                    System.out.println("Rasa initiala caine2: "+caine2.getBreed());
                    System.out.println("Schimbati nume canie2: ");
                    String c = scanner.nextLine();
                    caine2.setName(c);
                    System.out.println("Schimbati rasa caine2: ");
                    String d = scanner.nextLine();
                    caine2.setBreed(d);
                    System.out.println("Numele caine1: "+caine1.getName());
                    System.out.println("Rasa caine1: "+caine1.getBreed());
                    System.out.println("Numele caine2: "+caine2.getName());
                    System.out.println("Rasa caine2: "+caine2.getBreed());
                    break;
                }
                case 4:{
                    Rectangle patrat = new Rectangle();
                    System.out.println("Introduceti latimea patratului: ");
                    int latimea = scanner.nextInt();
                    patrat.setWidth(latimea);

                    System.out.println("Introduceti lungimea patratului: ");
                    int lungimea = scanner.nextInt();
                    patrat.setLength(lungimea);

                    System.out.println("Aria patratului este: "+patrat.getArie());
                    System.out.println("Perimetrul patratului este: "+patrat.getPerimetru());
                    break;
                }
                case 5:{
                    Person person = new Person();
                    System.out.println("Introdu numele persoanei: ");
                    person.setName(scanner.nextLine());
                    System.out.println("Introdu emailul persoanei: ");
                    person.setEmail(scanner.nextLine());


                    Student student = new Student();
                    System.out.println("Introdu numele studentului: ");
                    student.setName(scanner.nextLine());
                    System.out.println("Introdu emailul studentului: ");
                    student.setEmail(scanner.nextLine());
                    System.out.println("Introduceti notele studentului: ");
                    student.setGrades();

                    Profesor profesor = new Profesor();
                    System.out.println("Introduceti numele profesorului: ");
                    profesor.setName(scanner.nextLine());
                    System.out.println("Introduceti emailul profesorului: ");
                    profesor.setEmail(scanner.nextLine());
                    System.out.println("Introduceti cursurile profesorului: ");
                    profesor.setCourses();


                    System.out.println("     Clasa Persoana\n");
                    System.out.println("Nume persoana: "+person.getName());
                    System.out.println("Email persoana: "+person.getEmail());

                    System.out.println("\n\n     Clasa Student\n");
                    System.out.println("Nume student: "+student.getName());
                    System.out.println("Email student: "+student.getEmail());
                    int[] note = student.getGrades();
                    System.out.print("Notele studentului: ");
                    for(int i = 0; i < note.length; i++ ){
                        System.out.print(note[i]+" ");
                    }


                    System.out.println("\n\n     Clasa Profesor\n");
                    System.out.println("Nume profesor: "+profesor.getName());
                    System.out.println("Email profesor: "+profesor.getEmail());
                    String[] cursuri = profesor.getCourses();
                    System.out.print("Cursurile profesorului: ");
                    for(int i = 0; i < cursuri.length; i++ ){
                        System.out.print(cursuri[i]+" ");
                    }

                    System.out.println("\n\nDupa cum putem observa, clasele Student si Profesor sunt subclase ale clasei Person." +
                            "\nCele doua mostenesc proprietatile clasei Person dar au fiecare cate ceva separat." +
                            "\nClasa Student are un camp specific 'grades', iar Clasa Profesor are un camp specific 'courses'." +
                            "\nCu alte cuvinte toate clasele au in comun campurile 'name' si 'email' , iar ca diferente clasele Student si Profesor," +
                            "\nau cate un camp specific lor.");
                    break;
                }
                default:{
                    if (n != 6)
                        System.out.println("Optiune invalida");
                }
            }

        }while(n != 6);
    }
    public static String retMijloc(String a){

        StringBuilder builder = new StringBuilder();

        if( a.length() % 2 == 0){

            builder.append(a.charAt(a.length()/2-1));
            builder.append(a.charAt(a.length()/2));

        } else {

            builder.append(a.charAt(a.length() / 2));
        }
        return builder.toString();
    }
    public static void sumCifre(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar: ");
        int n = scanner.nextInt();
        int aux = n;
        int sum = 0;

        while(n != 0){
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.printf("suma cifrelor numarului %d este %d",aux,sum);
    }

}
