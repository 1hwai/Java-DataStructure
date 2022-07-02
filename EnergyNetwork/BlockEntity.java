public class BlockEntity {
    public String name;
    public TreeNode tree;

    public BlockEntity(String name) {
        this.name = name;
        tree = new TreeNode(this);
    }
}
