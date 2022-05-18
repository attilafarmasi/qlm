package hu.progmatic;

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
            advertisementList.add(ad);
            System.out.println(advertisementList);
    }

    // Következő reklám megjelenítése a megadott napon.
    public void showNextAdvertisement(int dayIndex) {

    }
}
