public class OperatorDemo {
    public static void main(String[] args) {

        /*
        * 1. =, +=, -=, *=, /=, %= 
        */
        int a = 10;         // = 
        a += 5;             // 15
        a -= 3;             // 12
        a *= 2;             // 24
        a /= 4;             // 6
        a %= 4;             // 2

        String s = "Hello"; // =
        s += "Java"; // "Hello Java"
        // s -= "a"; 
        // s *= 2;
        // s /= 2;
        // s %= 2; - Нельзя для String

        /*
        * 2. ? :
        */
       int x = 7, y = 12;
       int max = (x > y) ? x : y;

       String parity = (x % 2 == 0) ? "четное" : "нечетное";
        
        /*
        * 3. || 
        */
        boolean b1 = (x > 0) || (y < 0);

        // Для String напрямую нельзя, но можно через результат сравнения
        boolean hasText = (s != null) || (parity != null);

        /*
        * 4. && 
        */
        boolean b2 = (x > 0) && (y > 0);

        boolean ok = (s != null) && (s.length() > 3);

        /*
        * 5. |
        */
        int p = 6; // 110
        int q = 3; // 011
        int bitOr = p | q; // 111 -> 7

        boolean boolOr = true | false; // true
        // String | String нельзя

        /*
        * 6. ^
        */
        int bitXor = p ^ q; // 101 -> 5
        boolean boolXor = true ^ false; // true

        // String ^ String нельзя

        /*
        * 7. &
        */
        int bitAnd = p & q; // 010 -> 2
        boolean boolAnd = true & false; // false

        // String & String нельзя

        /*
        * 8. ==, !=
        */
        boolean eq1 = (10 == 10); // true
        boolean ne1 = (10 != 5); // false

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        boolean refEq1 = (s1 == s2); // true, ссылки на один литерал
        boolean refEq2 = (s1 == s3); // false, разные объекты
        boolean refNe = (s1 != s3); // true

        // Для сравнения строк используется:
        boolean contentEq = s1.equals(s3); // true

        /*
        * 9. >, >=, <, <=
        */
        boolean cmp1 = (8 > 3);
        boolean cmp2 = (8 >= 8);
        boolean cmp3 = (2 < 5);
        boolean cmp4 = (2 <= 2);

        // String > String нельзя
        // Для строк используется метод compareTo:
        boolean strCmp = ("abc".compareTo("abd") < 0);
        
        /*
        * 10. >>, >>>, <<
        */
        int n = 16; // 00010000
        int left = n << 2; // 64
        int right = n >> 2; // 4
        
        int neg = -16;
        int unsignedRight = neg >>> 2;
        
        // String сдвигать нельзя

        /*
        * 11. +, -
        */
        int sum = 5 + 3;
        int diff = 5 - 3;

        String full = "Hello" + " " + "World";

        /*
        * 12. *, /, %
        */
       int mul = 6 * 4; 
       int div = 7 / 2; // 3
       int mod = 7 % 2; // 1

       double d = 7.0 / 2; // 3.5

       // String * / % нельзя

       /*
       * 13. ++, --, ~, !
       */
        int i = 5;

        // Префиксная форма
        int preInc = ++i; // i сначала станет 6, потом это значение присвоится preInc
        int preDec = --i; // i сначала станет 5, потом это значение присвоится preDec

        // Постфиксная форма
        int postInc = i++; // postInc сначала станет 5, потом i станет 6
        int postDec = i--; // postDec сначала станет 6, потом i станет 5
        
        int bitNot = ~5; // побитовое отрицание 5 = 101 -> 010 = 2
        boolean logicNot = !true; // false

        // Операторы этого пункта к String не применимы

        /*
        * 14. (), []
        */
        int result = (2 + 3) * 4;

        String text = ("Ja" + "va").toUpperCase(); // JAVA
        
        int[] arr = {10, 20, 30};
        int second = arr[1]; // 20

        String[] words = {"one", "two", "three"};
        String firstWord = words[0];

         System.out.println(a);
        System.out.println(s);
        System.out.println(max);
        System.out.println(parity);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(ok);
        System.out.println(hasText);
        System.out.println(bitOr);
        System.out.println(boolOr);
        System.out.println(bitXor);
        System.out.println(boolXor);
        System.out.println(bitAnd);
        System.out.println(boolAnd);
        System.out.println(eq1);
        System.out.println(ne1);
        System.out.println(refEq1);
        System.out.println(refEq2);
        System.out.println(refNe);
        System.out.println(contentEq);
        System.out.println(cmp1);
        System.out.println(cmp2);
        System.out.println(cmp3);
        System.out.println(cmp4);
        System.out.println(strCmp);
        System.out.println(left);
        System.out.println(right);
        System.out.println(unsignedRight);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(full);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(d);
        System.out.println(preInc);
        System.out.println(preDec);
        System.out.println(postInc);
        System.out.println(postDec);
        System.out.println(bitNot);
        System.out.println(logicNot);
        System.out.println(result);
        System.out.println(text);
        System.out.println(second);
        System.out.println(firstWord);
    }
}