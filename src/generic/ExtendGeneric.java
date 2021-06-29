package generic;

//인터페이스로 해도 상관 없다
abstract class Info{
    public abstract  int getLevel();
}
class EmployeeInfoTwo extends Info{
    public int rank;
    EmployeeInfoTwo(int rank){
        this.rank = rank;
    }
    public int getLevel(){
        return this.rank;
    }
}
// HumanTwo의 타입은 Info의 자식만 올 수 있다는 의미
class HumanTwo<T extends Info>{
    public T info;
    HumanTwo(T info){
        this.info = info;
        info.getLevel();//extends Info가 있어야지 에러가 안남
    }
}
public class ExtendGeneric {
    public static void main(String[] args) {
        HumanTwo<EmployeeInfoTwo> p1 = new HumanTwo<EmployeeInfoTwo>(new EmployeeInfoTwo(1));
//        generic.HumanTwo<String> p2 = new generic.HumanTwo<String>("부장");//컴파일 에러
    }
}
