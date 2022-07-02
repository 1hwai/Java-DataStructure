import java.util.ArrayList;

public class TreeNode {
    public TreeNode parent;
    public BlockEntity blockEntity;
    public ArrayList<TreeNode> children = new ArrayList<>();

    public TreeNode(BlockEntity blockEntity) {
        this.blockEntity = blockEntity;
    }

    public boolean addBelow(BlockEntity be) {
        TreeNode tree = be.tree; 
        if (children.contains(tree))
            return false;
        be.tree.parent = this;
        children.add(be.tree);
        return true;
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