import java.util.Date;

public class CopyInImmutableObjects {
    public static void main(String[] args){
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
    }
}

final class Period{
    private final long start;
    private final long end;

    public Period(Date start, Date end) {
        this.start = start.getTime();
        this.end = end.getTime();
        if (this.start < this.end)
            throw new IllegalArgumentException(start + "after" + end);
    }

    public Date start(){
        return new Date(start);
    }

    public Date end(){
        return new Date(end);
    }

}