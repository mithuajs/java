// 1ti array er moddhe theke sobcheye choto number ta ber korar program:
public class arraytosmallnumber {
    public static void main(String[] args) {
        int arr []= {5,7,4,2,9,10,12};
        int main = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<main) {
                main=arr[i];
            }
        }
        System.out.println("The main number is: " + main);
}
}


// out put: 2
