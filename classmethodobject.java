// class,object and method er maddhome program or 1 theke 100 porjonto natural number er jogfol ber korar program:

public class classmethodobject {
    void display() {
       int sum = 0;
       for(int i = 1; i <= 100; i++) {
          sum += i;
       }
       System.out.println("The sum of first 10 natural numbers is: " + sum);
    }
    public static void main(String[] args) {
         classmethodobject obj = new classmethodobject();
         obj.display();
    }

}

//#5050