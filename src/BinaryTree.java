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
        root = remove(root, element);
    }

    private Node<T> remove(Node<T> node, T element) {
        if (node == null) {
            return null;
        }

        int cmp = element.compareTo(node.getValue());
        if (cmp < 0) {
            node.setLeft(remove(node.getLeft(), element));
        } else if (cmp > 0) {
            node.setRight(remove(node.getRight(), element));
        } else {
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            } else {
                Node<T> successor = find_min(node.getRight());
                node.setValue(successor.getValue());
                node.setRight(remove(node.getRight(), successor.getValue()));
            }
        }
        return node;
    }

    private Node<T> find_min(Node<T> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
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


    //TODO: CHANGE WAY THE BINARY TREE GETS PRINTED DIO CANE
    public String toString() {
        StringBuilder sb = new StringBuilder();
        printBinaryTree(root, 0, sb);
        return sb.toString();
    }

    private void printBinaryTree(Node<T> node, int depth, StringBuilder sb) {
        if (node == null) {
            sb.append(getIndentation(depth)).append("-\n");
            return;
        }
        printBinaryTree(node.getRight(), depth + 1, sb);
        sb.append(getIndentation(depth)).append(node.getValue()).append("\n");
        printBinaryTree(node.getLeft(), depth + 1, sb);
    }

    private String getIndentation(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("    ");
        }
        return sb.toString();
    }

}
