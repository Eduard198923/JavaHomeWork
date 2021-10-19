package homework8;


public class MyArrayList<T> {
    private final int INIT_SIZE = 16;
    private Object[] array = new Object[INIT_SIZE];
    private int size;


    public void add(T item) {
        if(size == array.length-1)
            array[size++] = item;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < size; i++)
            array[i] = array[i+1];
        array[size] = null;
        size--;

    }

    public int size() {
        return size;
    }

    public void clear() {
        Object[] es = array;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }
}