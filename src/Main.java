public class Main {

    public static void main(String[] args) {
        //TEST BINARY TREE
        int values[] = { 5, 7, 4, 20, 40, 30, 6, 3};
        BinaryTree binary = new BinaryTree();

        for (int i = 0; i < values.length; i++) {
            binary.insert(values[i]);
            System.out.println("Value: " + values[i] + " added.");
        }
        binary.printTree();

    }
}