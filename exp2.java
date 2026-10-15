package sahana;

class Addition {
    int a = 10;
    int b = 20;

    void display() {
        int sum = a + b;

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Sum: " + sum);
    }
}

public class exp2 {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.display();
    }
}