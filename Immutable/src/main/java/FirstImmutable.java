public class FirstImmutable {
    private final int i;

    private FirstImmutable(int i) {
        this.i = i;
    }

    public static FirstImmutable getInstance(int i){
        return new FirstImmutable(i);
    }

    public int getI(){
        return i;
    }
}
