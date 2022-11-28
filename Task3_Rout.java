package task3_rout;

public class Task3_Rout {

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 3, 4, 2, 4};
        int[] a = feqArray(n, n.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        System.out.println("");
        System.out.println(count2(a, a.length));
    }
//Q1

    public static int sumOfNum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;

        }
        return sum;
    }

    //Q2
    public static int numOfElement(int[] num) {
        return num.length;
    }

    //Q3
    public static int getMaxNumOfArray(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
//Q4

    public static int minNumOfArray(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    //Q5
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static String numOfEven(int[] arr, int n) {
        int c = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                c++;
                sum += arr[i];
            }
        }
        return "sum of even is " + sum + " count of even is " + c;
    }
//Q6

    public static int count2(int[] arr, int n) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                c++;
            }

        }
        return c;

    }

    //Q7
    public static int[] feqArray(int[] arr, int n) {
        int frq[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            frq[arr[i]]++;
        }
        return frq;
    }

    //Q8
    public static void selection(int[] input, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minId = i;
            int j;
            for (j = i + 1; j < n; j++) {
                if (input[j] < input[minId]) {
                    minId = j;
                }
            }
            int temp = input[minId];

            input[minId] = input[i];
            input[i] = temp;
        }
    }

    //Q9
    public static int binarySearsh(int[] arr, int n, int key) {//{//worstCase O(log2n) bestCase O(1)

        int low = 0;
        int up = n - 1;
        int mid;
        while (low <= up) {
            mid = (low + up) / 2;
            if (arr[mid] > key) {
                up = mid - 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }
//  Q10

    public static int linearSearch(int[] arr, int n, int key) {//worstCase O(n) bestCase O(1)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

}
