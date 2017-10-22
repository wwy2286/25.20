import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        int numObjects;
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Please enter number of objects");
        numObjects = keyboard.nextInt();
        System.out.println("" + numObjects + " Objects");
        System.out.println("Please enter the weights of objects (1-9)");
        for (int i = 0; i<numObjects; i++){
            list.add(keyboard.nextInt());
        }
        System.out.println(list);
        LinkedList<Bin> bin = new LinkedList<>();
        bin.add(new Bin());
        System.out.println("The size of bin is " + bin.size());

        while (0<list.size()){

            for (int j = 0; j<bin.size(); j++) {
                if (list.get(0) <= bin.get(j).getBinRemainder()) {
                    bin.get(j).addElement(list.get(0));
                    bin.get(j).setRemainder(bin.get(j).getBinRemainder() - list.get(0));
                    list.remove(0);
                    break;
                } else if (j==bin.size()-1){
                    bin.add(new Bin());
                    bin.get(j+1).addElement(list.get(0));
                    bin.get(j+1).setRemainder(bin.get(j+1).getBinRemainder() - list.get(0));
                    list.remove(0);
                    break;
                }
            }
        }

        for (int i = 0; i<bin.size(); i++){
            System.out.println("Container " + (i+1) + " contains objects with weight " + bin.get(i));
        }




       //int [] numbBuckets = new int [5];
    }

}
