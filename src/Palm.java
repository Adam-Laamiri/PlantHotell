// ARV: Palm ärver från Plants och återanvänder dess egenskaper
// och metoder, exempelvis namn, växttyp och höjd.
public class Palm extends Plants {

    public Palm(PlantName name, double height) {
        super(name, PlantType.PALM, height);
    }

    // POLYMORFISM: @Override innebär att Palm implementerar
    // sin egen version av calculate(), som ersätter den ärvda
    // metodens implementation (här deklarerad via interfacet).
    @Override
    public double calculate() {
        return getHeight() * 0.5;
    }
}