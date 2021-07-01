class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class ClassPolymorphism {
    public static void main(String[] args) {
        //데이터 타입은 부모로 지정되어 있기지만
        //자식에 오버라이딩 되어있기 때문에
        //자식의 메소드가 호출 된다.
        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x());
        //아래는 위에 얘기했듯이 obj가 a 즉 부모의 타입을 하고있기때문에
        //부모에게 없는 메소드는 호출 할 수 없다.
//      System.out.println(obj.y());
        System.out.println(obj2.x());
    }
}
