public class DataType {


    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println("A:" + a);
        int arr[] = {3, 2, 1};
        changeMang(arr);
        System.out.println("Arr index:" + arr[0]);
    }

    private static void changeMang(int[] arr) {
        arr[0] = 222222;

    }

    private static void change(int a) {
        a = 1111;

    }
}
