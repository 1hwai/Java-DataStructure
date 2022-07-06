public class GeneratorBE extends SourceBE {
    public Electricity outputElectricity;
    public Electricity consumption = new Electricity();

    public GeneratorBE() {
        super();
        outputElectricity = new Electricity(50000);
    }
}
