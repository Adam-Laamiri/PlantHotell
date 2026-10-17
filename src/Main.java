import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till plant hotellet!");
        System.out.println("Ange vilken plant som ska vattnas :] (Laura, Olof, Igge, Meatloaf):");

        String input = scanner.nextLine().trim().toUpperCase();

        try {
            // Convert the user's input into a PlantName enum
            PlantName plantName = PlantName.valueOf(input);

            // Create the plant
            Plants plant = new Plants(plantName);

            // Display information about the plant
            System.out.println("\n--- Växt Information ---");
            System.out.println("Namn: " + plant.getPlantName());
            System.out.println("Typ: " + plant.getPlantType());
            System.out.println("höjd: " + getStoredHeight(plant));

            System.out.println("vätske mängd: " + plant.plantHeight());
            System.out.println("vätske typ: " + plant.getLiquid());

        } catch (IllegalArgumentException e) {
            System.out.println("förlåt! denna växten finns inte.");
            System.out.println("Tillgängliga växter: Laura, Olof, Igge, Meatloaf");
        }

        scanner.close();
    }

    private static double getStoredHeight(Plants plant) {
        return plant.plantHeight() / 0.5;
    }
}