public class Main {
    public static void main(String[] args) {
        SourceBE se0 = new SourceBE();
        SourceBE se1 = new SourceBE();
        SourceBE se2 = new SourceBE();

        ConsumerBE ce0 = new ConsumerBE();
        ConsumerBE ce1 = new ConsumerBE();
        ConsumerBE ce2 = new ConsumerBE();
        ConsumerBE ce3 = new ConsumerBE();
        ConsumerBE ce4 = new ConsumerBE();
        ConsumerBE ce5 = new ConsumerBE();

        se0.tree.addBelow(ce0);
        se0.tree.addBelow(se1);
        se0.tree.addBelow(se2);

        se1.tree.addBelow(ce1);
        se1.tree.addBelow(ce2);
        se2.tree.addBelow(ce3);
        se2.tree.addBelow(ce4);
        se2.tree.addBelow(ce5);
        se0.tree.show();
    }
}
