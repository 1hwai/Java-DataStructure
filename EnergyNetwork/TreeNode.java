import java.util.ArrayList;

public class TreeNode {
    public TreeNode parent;
    public BlockEntity blockEntity;
    public ArrayList<TreeNode> children = new ArrayList<>();

    public TreeNode(BlockEntity blockEntity) {
        this.blockEntity = blockEntity;
    }

    public boolean setParent(BlockEntity be) {
        if (be.tree == this) 
            return false;
        if (parent != null) {
            parent.children.remove(this);
            parent.children.add(be.tree);
        }
        be.tree.children.add(this);
        parent = be.tree;
        return true;
    }

    public boolean addChild(BlockEntity be) {
        TreeNode tree = be.tree; 
        if (be.tree.parent == this || children.contains(tree))
            return false;
        be.tree.parent = this;
        children.add(be.tree);
        return true;
    }

    public void remove() {
        rmParent();
        rmChildren();
    }

    public void rmParent() {
        if (parent == null) return;
        parent.children.remove(this);
        parent = null;
    }

    public void rmChild(BlockEntity be) {
        if (be.tree.parent != this) return;
        be.tree.parent = null;
        children.remove(be.tree);
    }

    public void rmChildren() {
        children.forEach((node) -> node.parent = null);
        children.clear();
    }

    public void show() {
        System.out.println(blockEntity);
        show(1);
        System.out.println();
    }

    private void show(int depth) {
        for (TreeNode node : children) {
            for (int i = 1; i < depth; i++) System.out.print("  ");
            System.out.println(" └ " + node.blockEntity);
            node.show(depth + 1);
        }
    }

}