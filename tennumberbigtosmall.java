import java.util.Arrays;
import java.util.Collections;
public class tennumberbigtosmall {
    public static void main(String[] args) {
        Integer arr [] = {5,2,1,8,1,3,10,25,18,16};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        
    }
}
//[25, 18, 16, 10, 8, 5, 3, 2, 1, 1]