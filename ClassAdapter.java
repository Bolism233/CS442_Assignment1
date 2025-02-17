package assignment01;

public class ClassAdapter<E extends Comparable<? super E>> extends SortedList<E> implements SortedSet<E> {
    
    // Since this class extends SortedList, it already has all
    // the necessary list methods. We only need to override add.
    
    @Override
    public void add(E e) {
        // Only add e if it's not already in the list.
        if (!this.contains(e)) {
            super.add(e);
        }
    }
}
