class Job {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
    double s, result;
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            s = (a + b + c) / 2.0; 
            result = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
            System.out.println("This is a triangle. Area = " + result);
        } else {
            System.out.println("This is not a triangle.");
        }
    }
}