public class Cactus extends Plants {

    public Cactus(PlantName name, double height) {
        super(name, PlantType.KAKTUS, height);
    }

    // Polymorfism: Växtens egen implementation av calculate() anropas beroende på objektets typ.
    @Override
    public double calculate() {
        return 0.02;
    }
}