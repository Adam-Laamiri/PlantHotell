public enum Liquids {
    KRANVATTEN(PlantType.PALM),
    MINERALVATTEN(PlantType.KAKTUS),
    PROTEINDRYCK(PlantType.CARNIVORE);

    private final PlantType plantType;

    Liquids(PlantType plantType){
        this.plantType = plantType;
    }

    public PlantType getPlantType() {
        return plantType;
    }
}
