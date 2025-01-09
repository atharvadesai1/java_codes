
class A {
    public void arrange(){
        System.out.println("Welcome I am A");
    }
}

class B extends A{
    @Override
    public void arrange(){
        System.out.println("Welcome I am B");
    }
}

class Dummy {
    public static void main(String[] args) {
        A first = new A();
        B second = new B();

        second.arrange();

    }
}