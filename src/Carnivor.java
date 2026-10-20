// ARV: Carnivor ärver från Plants och återanvänder dess egenskaper
// och metoder, exempelvis namn, växttyp och höjd.
public class Carnivor extends Plants {

    public Carnivor(PlantName name, double height) {
        super(name, PlantType.CARNIVORE, height);
    }

    // POLYMORFISM: @Override innebär att Carnivour implementerar
    // sin egen version av calculate(), som ersätter den ärvda
    // metodens implementation (här deklarerad via interfacet).
    @Override
    public double calculate() {
        return 0.1 + (0.2 * getHeight());
    }
}