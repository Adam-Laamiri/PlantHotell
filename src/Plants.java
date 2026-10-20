    // INTERFACE: Plants implementerar interfacet Waterable.
    // Det innebär att klassen måste tillhandahålla metoden calculate()
    // som deklareras i interfacet.
public abstract class Plants implements Waterable {

    // INKAPSLING: Fälten är private, vilket hindrar andra klasser
    // från att komma åt dem direkt. Informationen skyddas och
    // läses via publika getter-metoder, exempelvis getHeight().
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