public class heapify {
    public int[] arr = new int[100];
    public int size = 0;

    public void insert(int val) {
        size++;
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

        arr[1] = arr[size];
        size--;

        int i = 1;
        while (true) {
            int left = 2 * i;
            int right = 2 * i + 1;
            int largest = i;

            if (left <= size && arr[left] > arr[largest])
                largest = left;
            if (right <= size && arr[right] > arr[largest])
                largest = right;

            if (largest != i) {
                swap(largest, i);
                i = largest;
            } else {
                break;
            }
        }
    }

    public static void heapifynow(int[] arr, int size, int index) {
        while (true) {
            int largest = index;
            int left = 2 * index;
            int right = 2 * index + 1;

            if (left <= size && arr[left] > arr[largest])
                largest = left;
            if (right <= size && arr[right] > arr[largest])
                largest = right;

            if (largest != index) {
                int temp = arr[largest];
                arr[largest] = arr[index];
                arr[index] = temp;
                index = largest;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        heapify h = new heapify();
        
        System.out.println("After Heapify method:");
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.delete();
        h.print();

        int[] arr = { -1, 54, 55, 52, 50 };
        int size = 4;
        for (int i = size / 2; i >= 1; i--) {
            heapifynow(arr, size, i);
        }
    }
}
