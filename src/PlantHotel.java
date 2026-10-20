import java.util.HashMap;
import java.util.Map;

// ARV: PlantHotel ärver från AmountOfLiquid med "extends".
// Det innebär att PlantHotel får tillgång till den publika metoden
// findLiquid() utan att behöva implementera den själv.

public class PlantHotel extends AmountOfLiquid {

    // INKAPSLING: Fälten är private så att de inte kan nås direkt
    // från andra klasser. Klassen styr själv hur informationen används.
    private final PlantName plantName;
    private final Map<PlantName, Plants> plantItems;

    public PlantHotel(PlantName plantName) {
        this.plantName = plantName;
        plantItems = new HashMap<>();

        plantItems.put(PlantName.LAURA, new Palm(PlantName.LAURA, PlantName.LAURA.getPlantHeight()));
        plantItems.put(PlantName.OLOF, new Palm(PlantName.OLOF, PlantName.OLOF.getPlantHeight()));
        plantItems.put(PlantName.IGGE, new Cactus(PlantName.IGGE, PlantName.IGGE.getPlantHeight()));
        plantItems.put(PlantName.MEATLOAF, new Carnivor(PlantName.MEATLOAF, PlantName.MEATLOAF.getPlantHeight()));
    }

    public PlantName getPlantName() {
        return plantName;
    }

    private Plants getPlant() {
        return plantItems.get(plantName);
    }

    public PlantType getPlantType() {
        Plants plant = getPlant();

        if (plant == null) {
            return null;
        }

        return plant.getPlantType();
    }

    public double getHeight() {
        Plants plant = getPlant();

        if (plant == null) {
            return -1.0;
        }

        return plant.getHeight();
    }

    public double plantHeight() {
        Plants plant = getPlant();

        if (plant == null) {
            return -1.0;
        }

        // POLYMORFISM: Variabeln plant har referenstypen Plants,
        // men kan referera till ett objekt av typen Palm, Cactus
        // eller Carnivor. Därför anropas rätt implementation av
        // calculate() beroende på vilken typ objektet faktiskt har.
        return plant.calculate();
    }

    public String getLiquid() {
        PlantType type = getPlantType();

        if (type == null) {
            return null;
        }

        return findLiquid(type);
    }
}