package sahana;

class Interest {
    double principal = 10000;
    double rate = 5;
    double time = 2;

    void display() {
        double si = (principal * rate * time) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Simple Interest: " + si);
    }
}

public class exp8 {
    public static void main(String[] args) {
        Interest i = new Interest();
        i.display();
    }
}