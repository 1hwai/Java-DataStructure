import java.util.ArrayList;

public class TreeNode {
    public TreeNode parent;
    public BlockEntity blockEntity;
    public ArrayList<TreeNode> children = new ArrayList<>();

    public TreeNode(BlockEntity blockEntity) {
        this.blockEntity = blockEntity;
    }

    public void addBelow(BlockEntity be) {
        be.tree.parent = this;
        children.add(be.tree);
    }

    public void remove() {
        if (parent != null)
            parent.children.remove(this);
        for (TreeNode node : children) {
            node.parent = null;
        }
        children.clear();
    }

    public void show() {
        System.out.println(blockEntity);
        show(1);
        System.out.println();
    }

    private void show(int depth) {
        for (TreeNode node : children) {
            for (int i = 0; i < depth; i++) System.out.print("  ");
            System.out.println(" └ " + node.blockEntity);
            node.show(depth + 1);
        }
    }


}