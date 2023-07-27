package OOps;

public class MultipleInheritance {
    public static void main(String[] args) {
        uses obj = new uses();
        obj.add();
        obj.div();// method call

    }

}

class uses implements suming, divigen {
    public void add() {// method definition
        int a, b, c;
        a = 5;
        b = 4;
        c = a + b;
        System.out.println("SUm= " + c);
    }

    public void div() {
        int a, b, c;
        a = 10;
        b = 5;
        c = a / b;
        System.out.println("Division result= " + c);
    }

}

interface suming {
    void add();// declaring function // Abstract method
}

interface divigen {
    void div();// declaring function
}