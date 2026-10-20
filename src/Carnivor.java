public class Carnivor extends Plants {

    public Carnivor(PlantName name, double height) {
        super(name, PlantType.CARNIVORE, height);
    }

    // Polymorfism: Växtens egen implementation av calculate() anropas beroende på objektets typ.
    @Override
    public double calculate() {
        return 0.1 + (0.2 * getHeight());
    }
}