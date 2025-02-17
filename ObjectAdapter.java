package assignment01;

import java.util.List;

public class ObjectAdapter<E extends Comparable<? super E>> implements SortedSet<E> {
    private SortedList<E> adaptee;
    
    public ObjectAdapter(SortedList<E> adapteeIn) {
        adaptee = adapteeIn;
    }
    
    @Override
    public void add(E e) {
        // Only add e if it's not already in the adaptee.
        if (!adaptee.contains(e)) {
            adaptee.add(e);
        }
    }
    
    @Override
    public boolean contains(E e) {
        // Delegate to adaptee.
        return adaptee.contains(e);
    }
    
    @Override
    public boolean remove(E e) {
        // Delegate to adaptee.
        return adaptee.remove(e);
    }
    
    @Override
    public List<E> asList() {
        // Delegate to adaptee.
        return adaptee.asList();
    }
    
    @Override
    public int size() {
        // Delegate to adaptee.
        return adaptee.size();
    }
    
    @Override
    public String toString() {
        // Delegate to adaptee.
        return adaptee.toString();
    }
}