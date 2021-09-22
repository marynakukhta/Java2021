import java.util.Iterator;

public class SimpleArray<E> implements Simple<E>{
    private E[] values;

    public SimpleArray(E[] values) { 
        this.values = values;
    }


    @Override
    public Iterator<E> iterator() {
          return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void update(int index, E e) {

    }
}
