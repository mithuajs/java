 //Inheritance  baboher kore java program :

 class Inheritance {

    String name;
    int roll;
    float marks;

    void display() {
        name = "mithu";
        roll = 872191;
        marks = 3.21f;
    }
}

class Result extends Inheritance {

    void getData() {
        System.out.println("name : " + name);
        System.out.println("roll : " + roll);
        System.out.println("marks : " + marks);
    }
}

public class Test  {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.display();
        obj.getData();
    }
}

/* name : mithu
roll : 872191
marks : 3.21 */