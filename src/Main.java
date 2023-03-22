import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {

        System.out.println("задача 1");
        int[] weights = new int[]{1, 2, 3};
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        double[] ggg = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights.length; i++) {
            System.out.println(ggg[i]);
        }
        int[] sss = new int[12];
        sss[0] = 10;
        System.out.println(sss[11]);
    }

    public static void task2() {
        System.out.println("задача 2");
        int[] arr = new int[]{1, 2, 3};

        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        double[] ggg = {1.57, 7.654, 9.986};

        for (int index = 0; index < arr.length; index++) {
            if (index == ggg.length - 1) {
                System.out.println(ggg[index]);
                break;
            }
            System.out.print(ggg[index] + ",");
        }
        double[] gggg = {3.12, 23.54114, 8.78545};

        for (int i = 0; i < arr.length; i++) {
            if (i == gggg.length - 1) {
                System.out.println(gggg[i]);
                break;
            }
            System.out.print(gggg[i] + ",");
        }
    }

    public static void task3() {
        System.out.println("задача 3");
        int[] arr = {1, 2, 3};

        for (int index = arr.length - 1; index >= 0; index--) {
            if (index == arr.length - 3) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        double[] ary = {1.57, 7.654, 9.986};

        for (int i = ary.length - 1; i >= 0; i--) {
            if (i == ary.length - 3) {
                System.out.println(ary[i]);
                break;
            }
            System.out.print(ary[i] + ", ");
        }

        double[] hh = {3.12, 23.54114, 8.78545};

        for (int iv = hh.length - 1; iv >= 0; iv--) {
            if (iv == hh.length - 3) {
                System.out.println(hh[iv]);
                break;
            }
            System.out.print(hh[iv] + ",");
        }
    }
    public static void task4() {
        System.out.println("задача 4");
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2!=0) {
                arr[i] += 1;
            }
        }
                System.out.println(Arrays.toString(arr));
            }
        }


