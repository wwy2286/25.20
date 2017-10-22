import java.util.LinkedList;

public class Bin {
    private LinkedList<Integer> element = new LinkedList<Integer>();
    private final int BINSIZE = 10;
    private int binRemainder=10;

    public Bin(){

    }

    public int getBinRemainder(){
        return binRemainder;
    }

    public void addElement(int i){
        this.element.add(i);
    }

    public void setRemainder(int i){
        this.binRemainder = i;
    }

    public String toString(){
        String output = "[";
        for (int i:element){
            output += " "+i;
        }
        output += " ]";
        return output;
    }
}
