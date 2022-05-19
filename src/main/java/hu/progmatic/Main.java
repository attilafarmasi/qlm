package hu.progmatic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Advertisement reklam1 = new Advertisement("Adidas", 10, 0.1);
        Advertisement reklam2 = new Advertisement("Nike", 15, 0.4);
        Advertisement reklam3 = new Advertisement("Puma", 20, 0.2);
        List<Advertisement> reklamok = new ArrayList<>();
        reklamok.add(reklam1);
        reklamok.add(reklam2);
        reklamok.add(reklam3);
        AdvertisementSystem a = new AdvertisementSystem(reklamok);

        System.out.println();
        System.out.println("Kezdeti reklám lista:");
        System.out.println();
        a.showAdvertisementList();

        Scanner scanner = new Scanner(System.in);
        String valasz = "";
        System.out.println("Szeretnél reklámot hozzáadni a listához? I/N");
        valasz = scanner.next();
        if(valasz.equals("I")){
            System.out.println("Kérlek add meg a reklám nevét!");
            String nev = scanner.next();
            System.out.println("Kérlek add meg az adott időszakra vonatkozóan a maximális megjelenési számot!(egész pozitív legyen)");
            int max = scanner.nextInt();
            System.out.println("Kérlek add meg a súlyát!(Pl.: 0,2 - ez azt jelenti, hogy 2x annyi alkalommal fordul elő, mint a 0,1 súlyú reklám - vesszőt használj, NE pontot!)");
            double suly = scanner.nextFloat();
            double d = Math.round(suly * 10.0) / 10.0;
            Advertisement advertisement = new Advertisement(nev, max, d);
            advertisement.showAdvertisement();
            System.out.println();
            System.out.println("Új reklám beregisztrálása utáni lista:");
            System.out.println();
            a.registerAdvertisement(advertisement);
            a.showAdvertisementList();
        } else
        System.out.println();

        int maxAdvertisementPerDay = -1;

        do{
            System.out.println("Maximum hány reklám jelenjen meg naponta? (0 és 1000 közötti egész szám lehet)");
            maxAdvertisementPerDay = scanner.nextInt();
            if(maxAdvertisementPerDay > 1000 || maxAdvertisementPerDay < 0){
                System.out.println("Érvénytelen adat!");
            }
        } while (maxAdvertisementPerDay > 1000 || maxAdvertisementPerDay < 0);

        System.out.println();
        System.out.println("Reklámok napi maximum száma a súlyuk alapján: ");
        a.advertisementPerDay(maxAdvertisementPerDay);

        System.out.println();
        int numberOfDays = -1;
        do{
            System.out.println("Hány napot vizsgáljunk? (0 és 30 közötti egész szám lehet)");
            numberOfDays = scanner.nextInt();
            if(numberOfDays > 30 || numberOfDays < 0){
                System.out.println("Érvénytelen adat!");
            }
        } while (numberOfDays > 30 || numberOfDays < 0);
        System.out.println();
        a.showAdvertisementPerDay(numberOfDays);

        System.out.println();
        int dayIndex = -1;
        do{
            System.out.println("Utolsó hány napot vizsgáljuk? (kisebbnek kell lennie, mint a vizsgált napok számának)");
            dayIndex = scanner.nextInt();
            if(dayIndex > numberOfDays || dayIndex < 0){
                System.out.println("Érvénytelen adat!");
            }
        } while (dayIndex > numberOfDays || dayIndex < 0);
        System.out.println("Reklámok megjelenése az utolsó " + dayIndex + " napban:");
        //a.lastAppearances(dayIndex, numberOfDays);
    }
}

