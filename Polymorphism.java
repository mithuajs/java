
//Polymorphism in Java program:
public class Polymorphism {

void add(int a, int b) { // method overloading and method name akoi hoile aita hoy thak e 
    System.out.println( (a + b));
}
void add( int  a, int  b , int c ) { // method overloading
    System.out.println((a + b +c ));

}
public static void main(String[] args) {
    Polymorphism obj = new Polymorphism();
    obj.add(10, 20); 
    obj.add(10, 20 ,30); 
}
} 

// 30 60