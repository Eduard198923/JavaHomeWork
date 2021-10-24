package homework8;

public interface MyArrayInterface<E> {
    boolean add(E e);
    void remove(int index);
    E  get(int index);
    int size();
     void clear();

}
