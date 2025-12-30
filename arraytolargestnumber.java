//array hothe sobcheye boro number ta ber korar program:
public class arraytolargestnumber {
    public static void main(String[] args) {
        int arr []= {5,7,4,2,9,10,12};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max ) {  //bigger number ber korar jonno ">" sign use kora hoy ar, choto number ber korar jonno "<" sign use kora hoy.
                max =arr[i];
            }
        }
        System.out.println("The main number is: " + max);
    }
}

// out put: The main number is: 12