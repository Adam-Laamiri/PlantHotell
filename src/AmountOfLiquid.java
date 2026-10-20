public class AmountOfLiquid {

    public String findLiquid(PlantType plantType) {
        for (Liquids liquid : Liquids.values()) {
            if (liquid.getPlantType() == plantType) {
                return liquid.name();
            }
        }

        return null;
    }
}