import java.util.Iterator;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Stack<Type> implements Iterable<Type> {
    private static class Node<Type> {
        private final Type data;
        private Node<Type> next;

        public Node(final Type data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<Type> top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(Type item) {
        Node<Type> node = new Node<>(item);
        node.next = top;
        top = node;
        size++;
    }

    public Type pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Type item = top.data;
        top = top.next;
        size--;

        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Type> iterator() {
        return new Iterator<>() {
            private Node<Type> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Type next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                Type item = current.data;
                current = current.next;

                return item;
            }
        };
    }
}