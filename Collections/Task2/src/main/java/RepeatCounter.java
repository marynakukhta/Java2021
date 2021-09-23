import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatCounter {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(RepeatCounter.getCount(arrayList));
    }

    public static Map<Integer, Integer> getCount(ArrayList<Integer> arrayList){
        Map <Integer, Integer> result = new HashMap<>();
        arrayList.stream().forEach(key -> {
            Integer value = result.containsKey(key) ? result.get(key) : 0;
            result.put(key, 1+value);
                });
        return result;
    }
}
