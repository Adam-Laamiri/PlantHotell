public class Amount_of_liquid {

    public double calculate(double plantHeight) {
        return plantHeight * 0.5;
    }

    public String findLiquid(PlantType plantType) {

        for (Liquids liquid : Liquids.values()) {
            if (liquid.getPlantType() == plantType) {
                return liquid.name();
            }
        }

        return null;
    }
}