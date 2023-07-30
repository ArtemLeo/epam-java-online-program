package EntryTest;

public class Question_22 {
    /* What changes need to be made at the line //1 to successfully compile the code?

       class Test {
          public static void main(String[] args) {
             int i = getX();
          }
          private int getX() {
             return 10;
          }
       }

       1) public static final void getX() {
       2) public static int getX() {  ✔
       3) static void getX() {
       4) public int getX() {
                 ️

       Detailed response:

       Чтобы успешно выполнить getX() в main методе, необходимо сделать getX() доступным в main методе.
       Так как main метод static, getX() метод также должен быть static.

     */
}
