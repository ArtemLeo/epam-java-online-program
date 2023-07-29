package EntryTest;

public class Question_01 {
    /* Which one statements correct about interfaces and abstract classes?

       1) Can contain nested types️                 ✔️
       2) All fields are constants                   ️
       3) Cannot be declared with the final modifier ✔️
       4) Contain ONLY abstract methods️
                 ️

       Detailed response:

       Can contain nested types: Как интерфейсы, так и абстрактные классы могут содержать вложенные типы,
       такие как другие интерфейсы, абстрактные классы или обычные классы.

       Cannot be declared with the final modifier: Интерфейсы и абстрактные классы в Java не могут быть помечены как "final",
       поскольку они предназначены для расширения или реализации другими классами.

       All fields are constants: Абстрактные классы в Java могут иметь поля, которые не являются константами.
       С другой стороны, интерфейсы в Java могут иметь только константные поля, которые неявно являются public, static и final.

       Contain ONLY abstract methods: Абстрактные классы могут иметь как абстрактные, так и неабстрактные (конкретные) методы.
       Напротив, интерфейсы в Java могут содержать только абстрактные методы (по умолчанию),
       но начиная с Java 8 они также могут содержать статические методы и методы по умолчанию, которые являются конкретными методами с реализациями.
     */
}
