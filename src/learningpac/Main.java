package learningpac;
/**
 * @author Mukhlynin Nikita
 * @version 1.1
 * @since 1.0
 * This is my main class, here I will write my <strong>code</strong>
 * <img src="doc-files/pibble.png" alt="pibble"/>
 */
public class Main {

    /**
     * This is int fields where I will store my values
     */
    int myFields;

    /** 
     * Here start point of the program
     * @param args command line values
     * @throws Exception when something goes wrong
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    /**
     * This fields will return i
     * @param i some int value
     * @param s some other String value
     * @return i from params
     * @throws RuntimeException if something goes wrong this exception will be throw
     */
    int getMyFields(int i, String[] s) throws RuntimeException {
        return i;
    }

    /**
     * @deprecated please use newMethod()
     */
    void oldMethod() {

    }

    /**
     * this is some description with some link {@link OtherClass#otherMethod()}
     * @see OtherClass#otherMethod()
     * @see "chapter 1"
     */
    void newMethod() {

    }
}
