class C {
    void sub() {
        System.out.println("Subtraction from class C: " + (20-10));
    }
}

class D extends C {
    @Override
    void sub() {
        super.sub();
        System.out.println("Subtraction from class D: " + (30-10));
    }
}

class E extends D {
    @Override
    void sub() {
        super.sub();
        System.out.println("Subtraction from class E: " + (40-20));
    }
}

public class HeirarchicalInheritance {
    public static void main(String[] args) {
        E e = new E();
        e.sub();        
    }
}
