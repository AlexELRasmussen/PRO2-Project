package binartreestuderende;

public class Opgave2 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree15 = new BinaryTree<>(15);
        BinaryTree<Integer> tree11 = new BinaryTree<>(11, null, tree15);

        BinaryTree<Integer> tree25 = new BinaryTree<>(25);
        BinaryTree<Integer> tree30 = new BinaryTree<>(30, tree25,null);
        BinaryTree<Integer> tree22 = new BinaryTree<>(22,tree11,tree30);

        BinaryTree<Integer> tree88 = new BinaryTree<>(88);
        BinaryTree<Integer> tree90 = new BinaryTree<>(90,tree88,null);
        BinaryTree<Integer> tree77 = new BinaryTree<>(77,null,tree90);

        BinaryTree<Integer> tree45 = new BinaryTree<>(45,tree22,tree77);

//        System.out.println(tree45.size());
//        System.out.println("H: " + tree45.height());
//        System.out.println();
//
//        tree45.preorder();
//        System.out.println();
//
//        tree45.inorder();
//        System.out.println();
//
//        tree45.postorder();
//        System.out.println();

        System.out.println(tree45.sum());
    }
}
