package iterator;

import java.util.Iterator;

public class IteratorObject implements Iterator<String> {

    private final String[] storedValues;
    private int index;

    public IteratorObject(String[] arrayOfValues) {
        this.storedValues = arrayOfValues;
        this.index = 0;
    }

    @Override
    public String next() {
        String value = storedValues[index];
        index++;
        return value;
    }

    @Override
    public boolean hasNext() {
        return index < storedValues.length && storedValues[index] != null;
    }

}
