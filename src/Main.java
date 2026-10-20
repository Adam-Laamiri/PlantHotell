import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till plant hotellet!");
        System.out.println("Ange vilken växt som ska vattnas (Laura, Olof, Igge, Meatloaf):");

        String input = scanner.nextLine().trim().toUpperCase();

        try {
            PlantName plantName = PlantName.valueOf(input);
            PlantHotel plant = new PlantHotel(plantName);

            System.out.println("\n--- Växtinformation ---");
            System.out.println("Namn: " + plant.getPlantName());
            System.out.println("Typ: " + plant.getPlantType());
            System.out.println("Höjd: " + plant.getHeight());
            System.out.println("Vätskemängd: " + plant.plantHeight() + "L");
            System.out.println("Vätsketyp: " + plant.getLiquid());

        } catch (IllegalArgumentException e) {
            System.out.println("Den växten finns inte.");
            System.out.println(
                    "Tillgängliga växter: Laura, Olof, Igge, Meatloaf"
            );
        }

        scanner.close();
    }

    //rolig typewriter animation
    /*
    public static void typePrintln(String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            Thread.sleep(50);
        }
        System.out.println();
    }

     */
}