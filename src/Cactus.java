// ARV: Cactus ärver från Plants och återanvänder dess egenskaper
// och metoder, exempelvis namn, växttyp och höjd.
public class Cactus extends Plants {

    public Cactus(PlantName name, double height) {
        super(name, PlantType.KAKTUS, height);
    }

    // POLYMORFISM: @Override innebär att Cactus implementerar
    // sin egen version av calculate(), som ersätter den ärvda
    // metodens implementation (här deklarerad via interfacet).
    @Override
    public double calculate() {
        return 0.02;
    }
}