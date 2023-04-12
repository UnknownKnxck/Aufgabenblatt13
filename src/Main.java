public class Main {

    public static void main(String[] args) {
        int[] values = {5, 7, 4, 20, 40, 30, 6, 3};
        //TEST BINARY TREE
        StringBuilder sbB = new StringBuilder();
        sbB.append("Values added: ");
        BinaryTree binary = new BinaryTree();

        for (int i = 0; i < values.length; i++) {
            binary.insert(values[i]);
            sbB.append(values[i] + " ");
        }
        System.out.println(sbB);
        System.out.println(binary);


        //TEST AVL TREE
        StringBuilder sbA = new StringBuilder();
        sbA.append("Values added: ");
        for (int i = 0; i < values.length; i++) {
            binary.insert(values[i]);
            sbB.append(values[i] + " ");
        }
        AVLTree avl = new AVLTree();
        System.out.println(sbA);
        System.out.println(avl);
    }
}