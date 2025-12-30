//2ta tow dimensional array er sum ber korar program...

public class duitowdimensonalarray {
    public static void main(String[] args) {
        int a [][] = {
            {10,20,30},
            {40,50,60}
    };
    int b [][] ={
        {10,20,30},
        {40,50,60}
    };
    int rows = 2;
    int cols = 3;
    int sum[][] = new int[rows][cols];

    //sum korar jonno:
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            sum[i][j] = a[i][j] + b[i][j];
        }
    }

    //output display korar jonno:
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(sum[i][j] + " ");
        }
        System.out.println();
    }
}
}


/* # 20 40 60 
  80 100 120 */