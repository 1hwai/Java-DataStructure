public class ConsumerBE extends BlockEntity{
    public Electricity inputElectricity = new Electricity();  
    public Electricity consumption;

    public ConsumerBE() {
        super("ConsumerBE");
        consumption = new Electricity(1000);
    }
}
