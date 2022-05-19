package hu.progmatic;

public class Advertisement {
    private final String name;
    private final int maxAppearance;
    private final double weight;

    int napiMaxMegjelenes;
    int osszesMegjelenes;

    public Advertisement(String name, int maxAppearance, double weight) {
        this.name = name;
        this.maxAppearance = maxAppearance;
        this.weight = weight;
    }

    // Maximális megjelenési szám.
    public int getMaxAppearance() {
        return maxAppearance;
    }

    // Megjelenési súly.
    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setNapiMaxMegjelenes(int napiMaxMegjelenes) {
        this.napiMaxMegjelenes = napiMaxMegjelenes;
    }

    public int getNapiMaxMegjelenes() {
        return napiMaxMegjelenes;
    }

    public int getOsszesMegjelenes() {
        return osszesMegjelenes;
    }

    public void setOsszesMegjelenes(int osszesMegjelenes) {
        this.osszesMegjelenes = osszesMegjelenes;
    }

    /*
        // Utolsó n napon a megjelenések száma.
        public int lastAppearence(int dayIndex, int numberOfDays){
            int sum = 0;
            for(int i = dayIndex; i < dayIndex + numberOfDays; i++){
                sum += ;
            }
            return sum;
        };
    */
    // Reklám megjelenítése az adott napra.
    public void showAdvertisement(){
        System.out.println("Reklám neve: " + this.name + "\n"
                + "Maximális megjelenési szám: " + this.maxAppearance + "\n"
                + "Reklám súlya: " + this.weight);
    };
}
