package homework8;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyArrayInterface<E> {


    public static void main(String[] args) {
        MyArrayInterface<String> strings = new MyArrayList<>();
        strings.add("Eduard");
        strings.add("Eduard12");
        strings.add("Eduard123");
        strings.remove(1);

        System.out.println(strings.get(1));
        System.out.println(strings.size());

        strings.clear();
        System.out.println(strings.get(0));




    }

    private E[] values;
    public MyArrayList() {
        values = (E[]) new Object[0];
    }


        @Override
        public boolean add (E e){
            try{
                E[] temp = values;
                values = (E[]) new Object[temp.length + 1];
                System.arraycopy(temp, 0, values, 0, temp.length);
                values[values.length - 1] = e;
                return true;

            }catch (ClassCastException ex){
                ex.printStackTrace();
            }
            return false;

        }

        @Override
        public void remove(int index){
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index,  amountElementAfterIndex);
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

        @Override
        public E get( int index){
            return values[index];
        }

        @Override
        public int size() {
            return values.length;
        }

        @Override
        public void clear () {
            Arrays.fill(values, null);

        }


        public Iterator<E> iterator () {
            return new ArrayIterator<>(values);
        }


    }

