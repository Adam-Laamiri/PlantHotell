public enum PlantName {
    LAURA(5.0),
    IGGE(1.0),
    OLOF(0.2),
    MEATLOAF(0.7);

    private double plantHeight;

    PlantName(double plantHeight){
        this.plantHeight = plantHeight;
    }

    public double getPlantHeight() {
        return plantHeight;
    }
}
