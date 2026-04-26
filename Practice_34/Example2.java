public class Example2 {
    public static void main(String[] args) {
        String str = "Java";

        // String -> StringBuilder
        StringBuilder builder = new StringBuilder(str);

        // StringBuilder -> String
        String str2 = builder.toString();

        // String -> StringBuffer
        StringBuffer buffer = new StringBuffer(str2);

        // StringBuffer -> String
        String str3 = buffer.toString();

        // StringBuffer -> StringBuilder
        StringBuilder builder2 = new StringBuilder(buffer.toString());

        // StringBuilder -> StringBuffer
        StringBuffer buffer2 = new StringBuffer(builder.toString());

        System.out.println(str);
        System.out.println(builder);
        System.out.println(str2);
        System.out.println(buffer);
        System.out.println(str3);
        System.out.println(builder2);
        System.out.println(buffer2);
    }
}