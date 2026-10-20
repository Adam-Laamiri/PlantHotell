public class Palm extends Plants {

    public Palm(PlantName name, double height) {
        super(name, PlantType.PALM, height);
    }

    // Polymorfism: Växtens egen implementation av calculate() anropas beroende på objektets typ.
    @Override
    public double calculate() {
        return getHeight() * 0.5;
    }
}