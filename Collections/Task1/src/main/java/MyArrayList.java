import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class MyArrayList<E> extends ArrayList<E> {

    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("hello");
        arrayList.add("world!");
        arrayList.remove(0);
        arrayList.clear();
        arrayList.remove("hello");
        System.out.println(arrayList);
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {}

    @Override
    public void replaceAll(UnaryOperator<E> operator) {}
}
