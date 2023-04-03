public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public void insert(T element) {
        if (root == null) {
            root = new Node<>(element);
        } else {
            insert(root, element);
        }
    }

    private void insert(Node<T> node, T element) {
        if (element.compareTo(node.getValue()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new Node<>(element));
            } else {
                insert(node.getLeft(), element);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node<>(element));
            } else {
                insert(node.getRight(), element);
            }
        }
    }


    public void remove(T element) {

    }

    public Node<T> find(T element) {
        return find(root, element);
    }

    private Node<T> find(Node<T> node, T element) {
        if (node == null || node.getValue().equals(element)) {
            return node;
        } else if (element.compareTo(node.getValue()) < 0) {
            return find(node.getLeft(), element);
        } else {
            return find(node.getRight(), element);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return sb.toString();
    }

    private void toString(Node<T> node) {

    }
}
