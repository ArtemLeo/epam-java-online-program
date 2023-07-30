package EntryTest;

public class Question_07 {
    /* What will be the result ot following code?

    public class Test {
       public static void main(String[] args) {
          Test p = new Test();
          p.start();
       }
       void start() {
          boolean b1 = false;
          boolean b2 = fix(b1);
          System.out.println(b1 + " " + b2);
       }
       boolean fix(boolean b1) {
          b1 = true;
          return b1;
       }
    }

       1) false false️
       2) true false
       3) false true  ✔️
       4) true true


       Detailed response:

       В методе main создается новый объект p класса Test. Вызывается метод start объекта p.

       Внутри метода start:
       Объявляется булева переменная b1 и инициализируется значением false.
       Объявляется булева переменная b2, которой присваивается результат вызова метода fix с b1 в качестве аргумента.
       Затем значения b1 и b2 выводятся на печать.

       Теперь рассмотрим метод fix:
       Метод fix принимает булевский параметр b1.
       Он устанавливает значение b1 в true.
       Он возвращает значение b1.

       На основе проведенного анализа спрогнозируем вывод:
       В методе start перед вызовом метода fix переменная b1 устанавливается в false.
       В методе fix переменная b1 устанавливается в true.
       Значение b1 не возвращается непосредственно из метода fix, а присваивается b2 в методе start.

       Метод start выводит значение b1 (которое по-прежнему ложно) и значение b2 (которое истинно, так как возвращено методом fix).
    */
}
