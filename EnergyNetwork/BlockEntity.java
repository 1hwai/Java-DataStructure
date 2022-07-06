public class BlockEntity {
    public String type;
    public TreeNode tree;

    public BlockEntity(String type) {
        this.type = type;
        tree = new TreeNode(this);
    }
}
