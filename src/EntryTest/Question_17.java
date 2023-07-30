package EntryTest;

public class Question_17 {
    /* What will be the result of following code?

       class Test {
          public static void main(String[] args) {
             int[] arr = {1, 2, 3, 4};
             call_array(arr[0], arr);
             System.out.println(arr[0] + ", " + arr[1]);
          }
          static void call_array(int i, int arr[]){
             arr[i] = 6;
             i = 5;
          }
       }

       1) Compilation error
       2) 1, 2
       3) 5, 6
       4) 1, 6 ✔
                 ️

       Detailed response:

       arr[0] остается неизменным и = '1'
       arr[1] изменен на '6' внутри call_array метода

     */
}
