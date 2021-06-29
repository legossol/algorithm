//제네릭이 없다면 아래와 같이 만들 수 있다 하지만 info와 person은 똑같은 코드라 볼 수 있다

class StudentInfo{
    public int grade;
    StudentInfo(int grade){
        this.grade = grade;
    }
}
class StudentPerson{
    public StudentInfo info;
    StudentPerson(StudentInfo info){
        this.info =info;
    }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){
        this.rank = rank;
    }
}
class EmployeePerson{
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info){
        this.info = info;
    }
}
//그래서 이것을 아래와 같이 바꿀 수 있다.
class StuInfo{
    public int grade;
    StuInfo(int grade){
        this.grade = grade;
    }
}
class EmploInfo{
    public int rank;
    EmploInfo(int rank){
        this.rank = rank;
    }
}
class Human<T,S>{
    public T info;
    public S id;
    Human(T info, S id){
        this.info =info;
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
public class HowToUseGeneric {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade);
        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);
        //제네릭 사용 후
        Integer id = new Integer(1);
        Human<EmploInfo, Integer> p1 = new Human<EmploInfo, Integer>(new EmploInfo(1),id);
        System.out.println(p1.id.intValue());

        EmploInfo e = new EmploInfo(1);
        Integer i = new Integer(10);
        Human p2 = new Human(e,i);
        p2.<EmploInfo>printInfo(e);
        //e가 EmploInfo로 추정이 가능해서 제네릭 생략이 가능
       p2.printInfo(e);
    }
}
