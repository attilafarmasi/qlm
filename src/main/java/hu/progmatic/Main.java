package hu.progmatic;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdvertisementSystem a = new AdvertisementSystem(List.of(
                new Advertisement("Adidas", 10, 0.1),
                new Advertisement("Nike", 15, 0.4),
                new Advertisement("Puma", 20, 0.2)
        ));

//        a.registerAdvertisement(new Advertisement("Fila", 12, 0.3));

        int sumWeight = 0;
        for (Advertisement advertisement : a.advertisementList) {
            sumWeight += advertisement.getWeight() * 10;
        }

        System.out.println();

        for (Advertisement advertisement : a.advertisementList) {
            advertisement.showAdvertisement();
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány reklám jelenjen meg naponta?");
        int napiMaxReklamokSzama = scanner.nextInt();

        System.out.println("Hány nappot vizsgáljunk?");
        int numberOfDays = scanner.nextInt();

        Hashtable<String, Integer> table = new Hashtable<>();
        for (Advertisement advertisement : a.advertisementList) {
            int s = (int) ((napiMaxReklamokSzama / sumWeight) * advertisement.getWeight() * 10);
            advertisement.setNapiMaxMegjelenes(s);
            table.put(advertisement.getName(), s);
        }
        System.out.println(table);

        for (int day = 1; day <= numberOfDays; day++) {
            for (Advertisement advertisement : a.getAdvertisementList()) {
                advertisement.maxAppearance -= advertisement.getNapiMaxMegjelenes();
                System.out.println(day + ". nap: " + advertisement.getName() + " - Napi megjelenés: " + advertisement.getNapiMaxMegjelenes() + " - Megmaradt " + advertisement.getName() + " reklám száma: " + advertisement.maxAppearance);
            }
        }
    }
}

