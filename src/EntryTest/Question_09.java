package EntryTest;

public class Question_09 {
    /* What will be the result ot following code?

    public class A {
       public static void main(String[] args) {
          A a = new A();
          a.met(5, 2);
       }
       void met(int a, int b) {
          b *= a;
          a += b;
          System.out.println(a);
       }
    }

       1) Compilation error
       2) 20
       3) 10  ️
       4) 15 ✔


       Detailed response:

       В методе main создается объект a класса A. На объекте a вызывается метод met с аргументами 5 и 2.
       Теперь проследим за вычислениями внутри метода met:
       b *= a; означает, что b = b * a, поэтому b становится равным 2 * 5 = 10.
       a += b; означает, что a = a + b, поэтому a становится равным 5 + 10 = 15.
       Наконец, оператор System.out.println(a); выведет значение a, равное 15.
    */
}
