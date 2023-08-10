public class Garden {
    public static void main(String[] args) {
        Plants plant1 = new Plants();
        Plants plant2 = new Plants();
        Plants plant3 = new Plants();

        plant1.plant = "Stokrotki";
        plant1.aboutPlant = "Podlewać dwa razy w tygodniu";
        plant1.waterRequirment = 0.7;
        String plant1Info = "Roslina " + plant1.plant + "," + " Nawodnienie: "
                + plant1.aboutPlant
                + ": "
                + plant1.waterRequirment
                + " litra.";

        plant2.plant = "Paproć";
        plant2.aboutPlant = "Podlewać raz w tygodniu";
        plant2.waterRequirment = 0.5;

        String plant2Info = "Roslina " + plant2.plant + "," + " Nawodnienie: "
                + plant2.aboutPlant
                + ": "
                + plant2.waterRequirment
                + " litra.";

        plant3.plant = "Konwalie";
        plant3.aboutPlant = "Podlewać raz w tygodniu";
        plant3.waterRequirment = 0.6;

        String plant3Info = "Roslina " + plant3.plant + "," + " Nawodnienie: "
                + plant3.aboutPlant
                + ": "
                + plant3.waterRequirment
                + " litra.";


        System.out.println(plant1Info);
        System.out.println(plant2Info);
        System.out.println(plant3Info);

        double dailyWaterConsumption = plant1.waterRequirment +
                plant2.waterRequirment +
                plant3.waterRequirment;
        double weeklyWaterConsumption = dailyWaterConsumption * 7;
        double yearlyWaterConsumption = dailyWaterConsumption * 365;

        System.out.println("------------------------------------------------");
        System.out.println("Dzienne zapotrzebowanie na wodę: " + dailyWaterConsumption + "l");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: " + weeklyWaterConsumption + "l");
        System.out.println("Roczne zapotrzebowanie na wodę: " + yearlyWaterConsumption + "l");






    }
}