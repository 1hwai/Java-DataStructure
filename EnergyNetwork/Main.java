public class Main {
    public static void main(String[] args) {
        SourceBlockEntity gom = new SourceBlockEntity("gom");
        BlockEntity crusher = new BlockEntity("crusher");
        BlockEntity crusher2 = new BlockEntity("crusher");
        gom.checkIn(crusher.getId(), crusher);
        gom.checkIn(crusher2.getId(), crusher2);
        System.out.println(gom.getLoad().values());
        gom.checkOut(crusher2.getId());
        gom.checkOut(crusher2.getId());
        System.out.println(gom.getLoad().values());
    }
}
