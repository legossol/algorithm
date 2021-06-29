package SuperKeyword;
class Pointer{
    int x;
    int y;

    Pointer(int x,int y){
        super();//Object()없어도 자동으로 넣어준다.
        this.x=x;
        this.y=y;
    }
    String getLocation(){
        return "x:"+x+",y::"+y;
    }
}
class ChildPointer extends Pointer{
    int z;
    ChildPointer(int x,int y,int z){
        super(x,y);//Pointer()호출
        this.z =z;
    }
    String getLocation(){//오버라이
        return "x:"+x+",y::"+y + ", z :::"+z;
    }
}
class MethodChild extends Pointer{
    MethodChild(int x,int y){
        super(x,y);
    }
    //부모와 자식이 똑같은 로직을 가지고 있으면 중복해서 입력할 필요없이
    //SuperKeyword를 통해서 매서드를 호출해 올 수 있다.
    String getLocation(){
        return super.getLocation();

    }
}
public class UsintSuperKeyword{
    public static void main(String[] args) {

        ChildPointer p = new ChildPointer(1,2,3);
        System.out.println(p.getLocation());

    }

}
