package hu.progmatic;

public class Advertisement {
    private final String name;
    int maxAppearance;
    private final double weight;

    int napiMaxMegjelenes;

    public void setNapiMaxMegjelenes(int napiMaxMegjelenes) {
        this.napiMaxMegjelenes = napiMaxMegjelenes;
    }

    public int getNapiMaxMegjelenes() {
        return napiMaxMegjelenes;
    }

    public Advertisement(String name, int maxAppearance, double weight, int napiMaxMegjelenes) {
        this.name = name;
        this.maxAppearance = maxAppearance;
        this.weight = weight;
        this.napiMaxMegjelenes = napiMaxMegjelenes;
    }

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
/*
    // A reklám összes megjelenése.
    // Hashtable<nap index, napi megjelenések száma>
    public Hashtable<Integer,Integer> getAllAppearences(){
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i = 0; i < numberOfDays; i++){
            int s = table.put(i, );
        }
        return table;
    };*/
}
