package StringBuffer;

public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("최초 : " + sb.toString());
        System.out.println("append 후 : " + sb.toString());

        System.out.println("문자열 길이 : " + sb.length());
        System.out.println("총 capacity : " + sb.capacity());

        sb.append("12345678");
        System.out.println(sb.toString());
        System.out.println("문자열 길이 : " + sb.length());
        System.out.println("총 capacity : " + sb.capacity());

        sb.append("추가된문자");
        System.out.println(sb.toString());

        sb.insert(5,"5번째에 문자추가");
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        sb.deleteCharAt(2);
        System.out.println(sb.toString());

        sb.replace(1,3,"추가");
        System.out.println(sb.toString());



    }
}
