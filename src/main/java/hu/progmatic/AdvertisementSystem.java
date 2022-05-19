package hu.progmatic;

import java.util.Hashtable;
import java.util.List;

public class AdvertisementSystem {
    List<Advertisement> advertisementList;

    public AdvertisementSystem(List<Advertisement> advertisementList) {
        this.advertisementList = advertisementList;
    }

    // Reklámok listája.
    public List<Advertisement> getAdvertisementList() {
        return advertisementList;
    }

    // Reklám regisztrálása.
    public void registerAdvertisement(Advertisement ad) {
        if (advertisementList.contains(ad)) {
            System.out.println("A reklámot már tartalmazza a lista");
        } else
            getAdvertisementList().add(ad);
    }

    // Következő reklám megjelenítése a megadott napon.
    public void showNextAdvertisement(int dayIndex) {

    }

    public void showAdvertisementList() {
        for (Advertisement advertisement : advertisementList) {
            advertisement.showAdvertisement();
            System.out.println();
        }
    }

    private int sumWeight() {
        int sumWeight = 0;
        for (Advertisement advertisement : advertisementList) {
            sumWeight += advertisement.getWeight() * 10;
        }
        return sumWeight;
    }

    public void advertisementPerDay(int napiMaxReklamokSzama) {
        Hashtable<String, Integer> table = new Hashtable<>();
        for (Advertisement advertisement : advertisementList) {
            int s = (int) ((napiMaxReklamokSzama / sumWeight()) * advertisement.getWeight() * 10);
            advertisement.setNapiMaxMegjelenes(s);
            table.put(advertisement.getName(), s);
        }
        System.out.println(table);
    }

    public void showAdvertisementPerDay(int numberOfDays) {
        Hashtable<String, Integer> table = new Hashtable<>();
        for (Advertisement advertisement : advertisementList) {
            int diff = advertisement.getMaxAppearance();
            for (int day = 1; day <= numberOfDays; day++) {
                diff -= advertisement.getNapiMaxMegjelenes();
                advertisement.osszesMegjelenes += advertisement.getNapiMaxMegjelenes();
                table.put(advertisement.getName(), advertisement.getOsszesMegjelenes());
                System.out.println(day + ". nap: " + advertisement.getName() + " - Napi megjelenés: " + advertisement.getNapiMaxMegjelenes() + " - Megmaradt " + advertisement.getName() + " reklám száma: " + diff);
                if (diff < advertisement.getNapiMaxMegjelenes()) {
                    advertisement.setNapiMaxMegjelenes(diff);
                    if (diff == 0) {
                        System.out.println(advertisement.getName() + " REKLÁM ELFOGYOTT!");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Reklámok az adott időszakban hányszor jelennek meg:");
        System.out.println(table);
    }

    public void lastAppearances(int dayIndex, int numberOfDays) {
        Hashtable<String, Integer> table = new Hashtable<>();
        for (Advertisement advertisement : advertisementList) {
            int diff = advertisement.getMaxAppearance();
            for (int day = 1; day <= numberOfDays; day++) {
                diff -= advertisement.getNapiMaxMegjelenes();
                if(diff < advertisement.getNapiMaxMegjelenes()) {
                    advertisement.setNapiMaxMegjelenes(diff);
                }
                if(day >= numberOfDays + 1 - dayIndex){
                    System.out.println(day + ". nap: " + advertisement.getName() + " - Napi megjelenés: " + advertisement.getNapiMaxMegjelenes());
                    table.put(advertisement.getName(), advertisement.getNapiMaxMegjelenes() * dayIndex);
                }
            }
        }
        System.out.println();
        System.out.println(table);
    }
}
