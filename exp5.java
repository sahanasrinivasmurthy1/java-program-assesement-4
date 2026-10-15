package sahana;

class Square {
    int number = 5;

    void display() {
        int square = number * number;

        System.out.println("Number: " + number);
        System.out.println("Square: " + square);
    }
}

public class exp5 {
    public static void main(String[] args) {
        Square s = new Square();
        s.display();
    }
}
