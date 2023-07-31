package EntryTest;

public class Question_25 {
    /* What is the result of the following fragment code?

       final char a = 'A', d = 'D';            // Line 1
       char grade = 'B';
       switch (grade) {
          case a:                              // Line 2
          case 'B': System.out.print("great");
          case 'C': System.out.print("good");
          break;
          case d:                              // Line 3
          case 'F': System.out.print("not good");
        }

       1) Compilation error at // Line1  ️️
       2) Compilation error at // Line3
       3) greatgood
       4) great ✔
       5) Compilation error at // Line1


       Detailed response:

       Код объявляет две окончательные переменные char, «a» и «d», и инициализирует их с помощью «A» и «D» соответственно.
       Он объявляет переменную char «grade» и инициализирует ее значением «B».
       Оператор switch используется для проверки значения 'grade'.
       В строке 2 он проверяет, соответствует ли 'grade' - case a. Нет несоответствует.
       После этого case нет оператора break, поэтому - case В -> System.out.print("great");
       Далее код проверяет, соответствует ли 'grade' - case С. Нет несоответствует. Условный оператор закрывается.

    */
}
