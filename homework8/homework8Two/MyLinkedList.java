package homework8.homework8Two;

import java.util.LinkedList;


public class MyLinkedList<E> {
    public static void main(String[] args) {
        MyLinkedList<String> stringLinked = new homework8.homework8Two.MyLinkedList<>();
        stringLinked.add("abc");
        stringLinked.add("abcfghbhnm,");

        System.out.println(stringLinked.size());
        System.out.println(stringLinked.get(0));
        System.out.println(stringLinked.get(1));

        stringLinked.remove(1);
        System.out.println(stringLinked.get(0));

        stringLinked.clear();
        System.out.println(stringLinked.size());
    }


    int modCount = 0;
    private Node<E> lastReturned;
    private Node<E> next;
    private int nextIndex;
    private int expectedModCount = modCount;
    int size = 0;
    Node<E> first;
    Node<E> last;


    Node<E> node(int index) {

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }
    void linkBefore(E e, Node<E> succ) {

        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }
    public void add(E e) {
        lastReturned = null;
        if (next == null)
            linkLast(e);
        else
            linkBefore(e, next);
        nextIndex++;
        expectedModCount++;
    }
    public int size() {
        return size;
    }
    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
    }
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
        modCount++;
    }
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }
    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }
}

  class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;

    Node(Node<E> prev, E element,Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }



}



