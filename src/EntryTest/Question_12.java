package EntryTest;

public class Question_12 {
    /* How many objects will be created after executing the following code?

       Object o1 = new Object();
       Object o2 = o1;
       Object o3 = o1;

       1) 2 ️
       2) 3                 ️
       3) 1 ✔
                 ️

       Detailed response:

       Object o1 = new Object(); - Создается новый объект и присваивается ссылочной переменной o1.

       Object o2 = o1; - При этом ссылочная переменная o1 присваивается ссылочной переменной o2.
       Однако при этом не создается новый объект.
       Вместо этого o2 теперь указывает на тот же объект, на который указывает o1.
       Таким образом, по-прежнему существует только один объект.

       Object o3 = o1; - Здесь выполняется то же самое, что и в предыдущей строке.
       Она присваивает ссылочную переменную o1 ссылочной переменной o3, но не создает новый объект.
       Теперь o3 также указывает на тот же объект, что и o1.

       Таким образом, существует только один объект, созданный с помощью new Object(), на который ссылаются o1, o2 и o3.
     */
}
