import java.util.HashMap;
import java.util.Map;

public class PlantHotel extends AmountOfLiquid {

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

        // Polymorfism: rätt calculate() anropas för växtens klass.
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