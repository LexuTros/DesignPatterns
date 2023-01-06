package iterator;

import java.util.Iterator;

public class IterableObject implements Iterable<String>{

    private final String[] adjustableArray;

    public IterableObject(int sizeArray) {
        adjustableArray = new String[sizeArray];
    }

    public void setArrayValue(int index, String value) {
        adjustableArray[index] = value;
    }

    @Override
    public Iterator<String> iterator() {
        return new IteratorObject(adjustableArray);
    }
}
