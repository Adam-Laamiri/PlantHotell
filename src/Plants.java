import java.util.HashMap;
import java.util.Map;

public class Plants extends Amount_of_liquid {

    private PlantName plantName;

    private final HashMap<PlantType, Map<PlantName, Double>> plantItems;

    public Plants(PlantName plantName) {
        this.plantName = plantName;

        plantItems = new HashMap<>();
        plantHotell(plantItems);
    }

    public PlantName getPlantName() {
        return plantName;
    }

    public void setPlantName(PlantName plantName) {
        this.plantName = plantName;
    }

    public void plantHotell(
            HashMap<PlantType, Map<PlantName, Double>> plantItems) {

        // Palmerna
        plantItems.put(PlantType.PALM, new HashMap<>());
        plantItems.get(PlantType.PALM).put(PlantName.LAURA, 5.0);
        plantItems.get(PlantType.PALM).put(PlantName.OLOF, 1.0);

        // Kaktuserna
        plantItems.put(PlantType.KAKTUS, new HashMap<>());
        plantItems.get(PlantType.KAKTUS).put(PlantName.IGGE, 0.2);

        // Kötätande växterna
        plantItems.put(PlantType.CARNIVORE, new HashMap<>());
        plantItems.get(PlantType.CARNIVORE).put(PlantName.MEATLOAF, 0.7);
    }

    public double plantHeight() {

        for (Map<PlantName, Double> plants : plantItems.values()) {
            if (plants.containsKey(plantName)) {
                return calculate(plants.get(plantName));
            }
        }

        return -1.0;
    }

    public PlantType getPlantType() {

        for (Map.Entry<PlantType, Map<PlantName, Double>> entry
                : plantItems.entrySet()) {

            if (entry.getValue().containsKey(plantName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public String getLiquid() {
        PlantType type = getPlantType();

        if (type == null) {
            return null;
        }

        return findLiquid(type);
    }
}