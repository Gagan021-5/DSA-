import java.util.*;

class h<T extends Comparable<T>> {
    private ArrayList<T> list;

public Heap(){
    list = new ArrayList<>();
}

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);

    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(int val) {
        list.add(val);
        upheap(list.size() - 1);

    }

    private void upheap(int idx) {
        if (idx == 0)
            return;
        int parent = parent(idx);
        if (list.get(idx).compareTo(list.get(parent)) < 0) {
            swap(idx, parent); // swap the list elements
        }

    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("empty!");
        }

        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int idx) {
        int min = idx;
        int left = left(idx);
        int right = right(idx);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        } else {
            min = right;
        }

        if (min != idx) {
            swap(min, idx);
            downheap(min);
        }
    }

}
