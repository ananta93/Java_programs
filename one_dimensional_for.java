import java.util.Arrays;

public class one_dimensional_for {

private static void count(int[] arr) {

    Arrays.sort(arr);

    int sum = 0, counter = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println(arr[0] + ": " + counter + " times");
            break;
        } else {
            if (i == (arr.length - 1)) {
                sum += arr[arr.length - 1];
                counter++;
                System.out.println((sum / counter) + " : " + counter
                        + " times");
                break;
            } else {
                if (arr[i] == arr[i + 1]) {
                    sum += arr[i];
                    counter++;
                } else if (arr[i] != arr[i + 1]) {
                    sum += arr[i];
                    counter++;
                    System.out.println((sum / counter) + " : " + counter
                            + " times");
                    sum = 0;
                    counter = 0;
                }
            }
        }
    }
}

public static void main(String[] args) {
    int nums[] = { 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5, 6 };
    count(nums);
}

}