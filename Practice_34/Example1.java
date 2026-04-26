public class Example1 {
    public static void main(String[] args) {
        // StringBuilder: изменяемая строка, не потокобезопасная
        StringBuilder builder = new StringBuilder("Java");

        // 1. append() — добавляет текст в конец
        builder.append(" Core");
        System.out.println("1. append(): " + builder);

        // 2. insert() — вставляет текст по указанному индексу
        builder.insert(4, " SE");
        System.out.println("2. insert(): " + builder);

        // 3. replace() — заменяет часть строки
        builder.replace(5, 7, "EE");
        System.out.println("3. replace(): " + builder);

        // 4. delete() — удаляет символы в диапазоне
        builder.delete(4, 7);
        System.out.println("4. delete(): " + builder);

        // 5. reverse() — разворачивает строку
        builder.reverse();
        System.out.println("5. reverse(): " + builder);

        System.out.println();

        // StringBuffer: изменяемая строка, потокобезопасная
        StringBuffer buffer = new StringBuffer("Programming");

        // 6. length() — возвращает длину строки
        System.out.println("6. length(): " + buffer.length());

        // 7. charAt() — возвращает символ по индексу
        System.out.println("7. charAt(0): " + buffer.charAt(0));

        // 8. setCharAt() — изменяет символ по индексу
        buffer.setCharAt(0, 'p');
        System.out.println("8. setCharAt(): " + buffer);

        // 9. substring() — возвращает подстроку
        System.out.println("9. substring(0, 4): " + buffer.substring(0, 4));

        // 10. capacity() — возвращает текущую емкость буфера
        System.out.println("10. capacity(): " + buffer.capacity());
    }
}