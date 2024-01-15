package lab7;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //problema1Var1();
        //problema1Var2();
        //problema2var1();
        //problema2var2();
        //problema3var1();
        //problema3var2();


    }
    public static void problema1Var1(){
        List<Integer> numereIntregi = Arrays.asList(15, 10, 5, 9, 7, 15);

        AtomicReference<Integer> sum = new AtomicReference<>(0);
        numereIntregi.forEach(n ->{
            sum.set(sum.get() + n);
        });

        System.out.println(sum.get() / numereIntregi.size());
    }

    public static void problema1Var2(){
        List<Integer> numere = Arrays.asList(15, 10, 5, 9, 7, 15);
        double rez = numere.stream().mapToDouble(i -> i.doubleValue())
                .average()
                .orElse(0.0);
        System.out.println(rez);

    }

    public static void problema2var1(){
        List<String> listaStrigs = Arrays.asList("andrei", "aurel","viorel");
        List<String> listaNoua = new ArrayList<>();

        listaStrigs.forEach( i -> {
            listaNoua.add(i.toUpperCase());
        });

        System.out.println(listaNoua);
    }

    public static void problema2var2(){

        List<String> listaStrigs = Arrays.asList("andrei", "aurel","viorel");
        List<String> upper = listaStrigs.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upper);
    }

    public static void problema3var1(){
        List<Integer> numereIntregi = Arrays.asList(2, 5, 7, 8, 10, 15, 20, 175, 40);

        AtomicReference<Integer> sumaPare = new AtomicReference<>(0);
        AtomicReference<Integer> sumaImpare = new AtomicReference<>(0);

        numereIntregi.forEach(i -> {

            if ( i % 2 == 0){
                sumaPare.set(sumaPare.get() + i);
            }else{
                sumaImpare.set(sumaImpare.get() + i);
            }
        });

        System.out.println("Suma numerelor pare este: "+ sumaPare+ "\nSuma numerelor impare este: "+ sumaImpare);
    }

    public static void problema3var2(){
        List<Integer> numereIntregi = Arrays.asList(2, 5, 7, 8, 10, 15, 20, 175, 40);
        int sumaPare = numereIntregi.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumaImpare = numereIntregi.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Suma numerelor pare este: "+ sumaPare+ "\nSuma numerelor impare este: "+ sumaImpare);




    }

}
