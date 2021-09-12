package StringBuffer;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("java");
        sb.append("pro");
        System.out.println(sb);
        sb.insert(1,"hi");
        System.out.println(sb);
        sb.setCharAt(1, '2');
        System.out.println(sb);
        sb.replace(1,3,"CHANGE");
        System.out.println(sb);
        sb.replace(0,7,"CHANGE");
        System.out.println(sb);
    }
}

