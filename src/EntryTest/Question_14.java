package EntryTest;

public class Question_14 {
    /* What will be the result of following code?

       public class MyClass {
          public static void main(String[] args) {
             int x = 3;
             int y = 5;
             System.out.print(x / y + " ");
             System.out.print((double) x / y + " ");
             System.out.print(1.0 * x / y);


       1) 0.6 0.6 0.6
       2) 0 0.6 0.6  ✔
       3) Compilation error
       4) 0 0.6 0
                 ️

       Detailed response:

       int x = 3; Инициализирует целочисленную переменную 'x' значением 3
       int y = 5; Инициализирует целочисленную переменную 'y' значением 5
       System.out.print(x / y + " "); Результат выводится в int, поэтому 3/5 = 0
       System.out.print((double) x / y + " "); Результат выводится в double, поэтому 3/5 = 0.6
       System.out.print(1.0 * x / y); Результат выводится в int, поэтому 3/5 = 0,
       но при умножении на 1.0, мы получаем double.
     */
}
