package alex.course.treenode.sum;

public class P2 {

    public boolean checkTree(TreeNode root) {
        int sum = root.left.val + root.right.val;
        if(sum != root.val) return false;
        return true;
    }
}
