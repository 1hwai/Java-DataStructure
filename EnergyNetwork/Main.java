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

        se0.tree.addChild(ce0);
        se0.tree.addChild(se1);
        se0.tree.addChild(se2);

        se1.tree.addChild(ce1);
        se1.tree.addChild(ce2);
        se2.tree.addChild(ce3);
        se2.tree.addChild(ce4);
        se2.tree.addChild(ce5);

        SourceBE se3 = new SourceBE();
        SourceBE se4 = new SourceBE();
        SourceBE se5 = new SourceBE();
        // se3.tree.setParent(se4);
        // se2.tree.setParent(se4);

        se5.tree.setParent(se4);
        se4.tree.setParent(se3);
        se2.tree.setParent(se3);

        System.out.println("se2: " + se2 + " | se3: " + se3 + " | se4: " + se4 + " | se5: " + se5);

        se0.tree.show();

    }
}
