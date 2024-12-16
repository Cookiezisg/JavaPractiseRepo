public class Class {

    int x;
    private int z = 50;
    public Class(int y){
        x = y;
    }


    void voidMethod() {
        System.out.println("this is void method");
    }

    public void publicVoidMethod() {
        System.out.println("this is public void method");
    }

    static void staticVoidMethod(){
        System.out.println("this is static void method");
    }

    public static void main(){
        staticVoidMethod();

        //publicVoidMethod();
        Class classClass = new Class(10);
        classClass.publicVoidMethod();

        

        Main.staticVoidMethod();

        System.out.println(classClass.x);

        Class.staticVoidMethod();

        
    }
}
