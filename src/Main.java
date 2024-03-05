import objects.EkstraPensja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Komendy: ");
        System.out.println("Ekstra Pensja = ep <ilosc_losowan>");
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        while (!end){
            String input = scanner.nextLine();
            if(input.startsWith("ep")) {
                if (input.contains(" ")) {
                    int i = Integer.valueOf(input.split(" ")[1]);
                    for (int j = 0; j < i; j++) {
                        EkstraPensja ekstraPensja = new EkstraPensja(true);
                        ekstraPensja.random();
                        ekstraPensja.print();
                        System.out.println();
                    }
                } else {
                    EkstraPensja ekstraPensja = new EkstraPensja(true);
                    ekstraPensja.random();
                    ekstraPensja.print();
                }
            }
        }
    }
}