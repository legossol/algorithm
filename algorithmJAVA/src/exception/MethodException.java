package exception;

public class MethodException {
    public static void main(String args[]) throws Exception {
        method1();  // 같은클래스내의 static 멤버이므로 객체생성 없이 직접 호출 가능
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception
    {
        throw new Exception();
    }
}
