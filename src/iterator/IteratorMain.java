package iterator;

public class IteratorMain {
    public static void main(String[] args) {
        IterableObject stringCollection = new IterableObject(10);

        stringCollection.setArrayValue(0, "Value1");
        stringCollection.setArrayValue(1, "Value2");
        stringCollection.setArrayValue(2, "Value3");
        stringCollection.setArrayValue(3, "Value4");

        for(String string : stringCollection) {
            System.out.println(string);
        }
    }
}
