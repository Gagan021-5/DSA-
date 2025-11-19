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
                swap(parent,idx);
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

    public static void main(String[] args) {
        heapp h = new heapp();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.print();
    }
}
