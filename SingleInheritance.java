class A {
    void add() {
        System.out.println("Addition from class A: " + (10+20));
    }
}

class B extends A {
    @Override
    void add() {
        super.add();
        System.out.println("Addition from class B: " + (20+30));
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.add();        
    }
}
