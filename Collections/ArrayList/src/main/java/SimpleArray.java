import com.sun.xml.internal.xsom.XSUnionSimpleType;
import sun.lwawt.macosx.CSystemTray;

import java.util.Iterator;

public class SimpleArray<E> implements Simple<E>{
    private E[] values;

    public SimpleArray() {
        values = (E[]) new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
          return new ArrayIterator<E>(values);
    }

    @Override
    public boolean add(E e) {
       try {
           E[] temp = values;
           values = (E[]) new Object[temp.length + 1];
           System.arraycopy(temp, 0, values, 0, temp.length);
           values[values.length - 1] = e;
           return true;
       } catch (ClassCastException exception){
           exception.printStackTrace();
       }
       return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
        } catch (ClassCastException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }
}
