package EntryTest;

public class Question_03 {
    /* What does the following expression do?
       x = x & (x - 1)

       1) Sets all bits to 1
       2) Makes "x" equal to zero   ✔️
       3) Reset the leftmost bit
       4) Resets the rightmost bit


       Detailed response:

       Выражение x = x & (x - 1) устанавливает x в ноль путем многократного сброса крайнего правого бита на 1 до тех пор, пока не будут сброшены все биты.
       Это происходит потому, что каждая итерация операции x = x & (x - 1) очищает крайний правый 1 бит в x,
       и этот процесс продолжается до тех пор, пока не останется ни одного бита 1, в результате чего x будет равен нулю.
    */
}
