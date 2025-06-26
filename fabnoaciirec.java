public class fabnoaciirec {

    public static void main(String[] args) {
        int ans = Fabnocii(6);
        System.out.println(ans);
    }

    static int Fabnocii(int num) {
        if (num < 2) {
            return num;
        }

        return Fabnocii(num - 1) + Fabnocii(num - 2);

    }
}
