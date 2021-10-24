package homework8;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator {
    private int index = 0;
    private E[] values;

    ArrayIterator(E[] values){
        this.values = values;
    }

    public boolean hasNext(){
        return index < values.length;
    }

    public E next(){
        return values[index++];
    }
}
