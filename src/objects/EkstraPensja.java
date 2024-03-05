package objects;

import interfaces.Printable;
import interfaces.Randomize;

import java.util.Arrays;
import java.util.Random;

public class EkstraPensja implements Randomize, Printable {


    private Random random = new Random();


    private boolean plus;
    private int[] numbers;
    private int plus_number;


    public EkstraPensja(boolean plus) {
        this.plus = plus;
    }

    @Override
    public EkstraPensja random() {
        int numbers_to_roll = 5;
        numbers = new int[numbers_to_roll];
        for (int i = 0; i < numbers_to_roll; i++) {
            numbers[i] = randomInt();
        }
        if(plus){
            plus_number = random.nextInt(1,5);
        }
        return this;
    }

    private int randomInt(){
        int rt = random.nextInt(1,36);
        if(containsBoard(rt)){
            return randomInt();
        }
        return rt;
    }

    private String numbersToString(){
        StringBuilder sb = new StringBuilder();
        for (int i : numbers){
            sb.append(i);
            sb.append(", ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private boolean containsBoard(int number){
        for (int liczba : numbers){
            if(liczba==number){
                return true;
            }
        }
        return false;
    }
    @Override
    public void print() {
        EkstraPensja ekstraPensja = this;
        System.out.println("Wylosowane liczby: " + numbersToString());
        if(plus){
            System.out.println("Dodatkowa liczba: " + ekstraPensja.plus_number);

        }
    }
}
