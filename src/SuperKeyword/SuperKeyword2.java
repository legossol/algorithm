package SuperKeyword;
class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class SuperKeyword2 extends Point{
    int z;

    SuperKeyword2(int x, int y, int z){
        //아래와 같이 x,y는 부모의 것이기때문에 부모의 것을 자손이 초기화하면 안된다.
        /*this.x = x;
        this.y = y;*/
        //아래와같이 해야한다.자손은 무조건 자신이 가진 것만 초기화 해야한다.
        super(x,y);//Point(int x,int y)즉 부모의 기본생성자를 호출
        this.z = z;
    }
}
