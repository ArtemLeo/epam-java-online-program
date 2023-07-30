package EntryTest;

public class Question_08 {
    /* What is equivalent to the following query? "SELECT*FROM product WHERE price BETWEEN 100 and 200"

       1) SELECT*FROM product WHERE price >= 100 OR price <= 200  ️️
       2) SELECT*FROM product WHERE price >= 100 AND price <= 200 ✔
       3) SELECT*FROM product WHERE price <= 100 OR price >= 200
       4) SELECT*FROM product WHERE price > 100 OR price < 200
       5) SELECT*FROM product WHERE price > 100 AND price < 200
       6) SELECT*FROM product WHERE price < 100 OR price > 200


       Detailed response:

       SELECT * FROM product WHERE price >= 100 AND price <= 200
       Этот запрос получит все строки из таблицы "product",
       в которых столбец "price" находится в диапазоне от 100 до 200 (включительно).
    */
}
