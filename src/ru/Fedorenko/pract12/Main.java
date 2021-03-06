package ru.Fedorenko.pract12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1 ===================================================================================================

        // Разработать класс Person, в котором имеется функция, возвращающая Фамилию И.О.
        // Функция должна учитывать возможность отсутствия значений в полях Имя и Отчество.
        // Программу оптимизировать с точки зрения быстродействия.

//        Person person1 = new Person("Андрей" ,"Андреев" , "Андреевич");
//        Person person2 = new Person("Андрей", "Андреевич");
//        Person person3 = new Person("Андрей");
//
//        System.out.println(person1.getFIO());
//        System.out.println(person2.getFIO());
//        System.out.println(person3.getFIO());

        // Задание 2 ===================================================================================================

        // Доработать класс адреса, который из полученной строки формата
        // "Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Квартира"
        // ([d] – разделитель, например, «запятая»)
        // выбирает соответствующие части и записывает их в соответствующие поля класса Address.
        // Учесть, что в начале и конце разобранной части адреса не должно быть пробелов.
        // Все поля адреса строковые.
        // Разработать проверочный класс не менее чем на четыре адресных строки.
        // В программе предусмотреть две реализации этого метода:
        //а) разделитель – только запятая (использовать метод split());
        //б) разделитель – любой из символов ,.;- (класс StringTokenizer).

//        Address address1 = new Address();
//        Address address2 = new Address();
//        address1.splitByComma("Страна, регион,город,    улица, дом, квартира    ");
//        address2.splitBySeparator("Страна- регион:город:    улица, дом, квартира    ");
//        System.out.println(address1);
//        System.out.println(address2);


        // Задание 3 ===================================================================================================

        //Реализуйте класс Shirt: Метод toString() выводит объяснение и значение полей построчно.
        //Преобразуйте строковый массив в массив класса Shirt и выведите его на консоль.
        //Дан также строковый массив:


//        String[] shirts = new String[11];
//        shirts[0] = "S001,Black Polo Shirt,Black,XL";
//        shirts[1] = "S002,Black Polo Shirt,Black,L"; shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
//        shirts[3] = "S004,Blue Polo Shirt,Blue,M"; shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
//        shirts[5] = "S006,Black T-Shirt,Black,XL"; shirts[6] = "S007,White T-Shirt,White,XL";
//        shirts[7] = "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S";
//        shirts[9] = "S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
//        Shirt[] sh = Shirt.getArray(shirts);
//        System.out.println(Arrays.toString(sh));


        // Задание 4 ===================================================================================================

        //Разработайте класс, который получает строковое представление телефонного номера
        // в одном из двух возможных строковых форматов:
        //+<Код страны><Номер 10 цифр>, например “+79175655655” или
        //“+104289652211” или
        //8<Номер 10 цифр> для России, например “89175655655”
        //и преобразует полученную строку в формат:
        //+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>

//        Phone.formatPhone("+78005553535");
//        Phone.formatPhone("88005553535");


        // Задание 5 ===================================================================================================

        //В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
        // В методе getLine() используя StringBuilder расставьте все слова в таком порядке,
        // чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
        // Каждое слово должно участвовать 1 раз.

        //Scanner scanner = new Scanner(System.in);
        //FilenameFormat.getLine(scanner.nextLine());

        //слова для теста:
        // в___г б___в и___к а___б г___д е___ё м___н ж___з л___м к___л д___е ж___з к___л ё___ж з___и

//        FilenameFormat.getLine("data.txt");
    }
}
