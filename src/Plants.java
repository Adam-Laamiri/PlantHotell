public abstract class Plants implements Waterable {

    private final PlantName name;
    private final PlantType plantType;
    private final double height;

    public Plants(PlantName name, PlantType plantType, double height) {
        this.name = name;
        this.plantType = plantType;
        this.height = height;
    }

    public PlantName getName() {
        return name;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    public double getHeight() {
        return height;
    }
}