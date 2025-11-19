public class heapp {

    public int[] arr = new int[100];
    public int size = 0;

    heapp() {
        int[] arr = { -1 };
        int size;
    }

    public void insert(int val) {

        size = size + 1;
        int idx = size;
        arr[idx] = val;

        while (idx > 1) {
            int parent = idx / 2;
            if (arr[parent] < arr[idx]) {
                swap(parent, idx);
                idx = parent;
            } else {
                return;
            }
        }
    }

    private void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void delete() {
        if (size == 0) {
            System.out.println("Nothing to delete");
            return;

        }

        arr[1] = arr[size--];

        int i = 1;
        while (i < size) {
            int leftidx = 2 * i;
            int rightidx = 2 * i + 1;
            if (leftidx < size && arr[i] < arr[leftidx]) {
                swap(arr[i], leftidx);
                i = leftidx;
            } else if (rightidx < size && arr[i] < arr[rightidx]) {
                swap(arr[i], rightidx);
                i = rightidx;
            } else {
                return;
            }
        }

    }

    public static void main(String[] args) {
        heapp h = new heapp();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.delete();
        h.print();
    }
}
