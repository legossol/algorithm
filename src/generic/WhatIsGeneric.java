package generic;

/*클래스 내부에서 사용할 데이터 타입을 나중에 인스턴스를 생성할때 확정하는 것.
* */
class Person<T>{
    public T info;
}
//위와같이 타입을 미리 명시하지 않고 단순히 매개변수를 받듯이 T라고만 명시하고
//나중에(아래와 같이사용할 때) 인스턴스화 할 때(가져다가 사할때) 구체적인 데이터 타입을 언급해서
//T -> String이라는 타입을 가지게 되는것이다.
//사용 이유(2가지): 타입이 안전해진다, 코드의 중복을 제거할 수 있음
public class WhatIsGeneric {
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
}
