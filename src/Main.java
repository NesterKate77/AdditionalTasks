import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
//           “Число больше десяти”, если меньше – “Число меньше десяти”.

//        int number;
//        System.out.print("Введите ваше число:");
//        number = scanner.nextInt();
//        if (number < 10) {
//            System.out.println("Число меньше десяти ");
//        } else {
//            if (number > 10) {
//                System.out.println("Число больше десяти");
//            }
//        }

//        1а. Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
//           “Число больше десяти”, если меньше – “Число меньше десяти”.

//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        if (number < 10) System.out.println("Число меньше 10");
//        if (number > 10) System.out.println("Число больше 10");
//        if (number == 10) System.out.println("Число равно 10");

//        2. Пользователь вводит в консоли два числа, выводим сообщение “первое число
//        больше/меньше, чем второе” в зависимости от результата их сравнения.
//
//        System.out.print("Введите ваше первое число:");
//        int number1 = scanner.nextInt();
//        System.out.print("Введите ваше второе число:");
//        int number2 = scanner.nextInt();
//        if (number1 < number2) System.out.println("Первое число меньше второго ");
//        if (number1 > number2) System.out.println("Первое число больше второго ");
//        if (number1 == number2) System.out.println("Числа равны");


//        3. Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
//        сообщение, является ли треугольник равнобедренным, равносторонним или
//        разносторонним.

//        System.out.print("Введите первую сторону треугольника:");
//        int side1 = scanner.nextInt();
//        System.out.print("Введите вторую сторону треугольника:");
//        int side2 = scanner.nextInt();
//        System.out.print("Введите третью сторону треугольника:");
//        int side3 = scanner.nextInt();
//        if (side1 == side2 && side1 == side3) System.out.println("Треугольник равносторонний");
//        else if (side1 == side2 || side2 == side3 || side1 == side3)
//            System.out.println("Треугольник равнобедренный");
//        else
//            System.out.println("Треугольник разносторонний");

//        4. Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
//        количество отрицательных и положительных чисел.

//        int[] numbers = new int[4];
//        for (int i = 0; i <= 3; i++) {
//            System.out.print("Введите число #" + (i + 1) + ": ");
//            numbers[i] = scanner.nextInt();
//        }
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i <= 3; i++) {
//            if (numbers[i] > 0) a++;
//            if (numbers[i] < 0) b++;
//        }
//        System.out.println("Отрицательных чисел " + b);
//        System.out.println("Положительных чисел " + a);

//        4. Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
//        количество отрицательных и положительных чисел (другой способ).

//        int a1 = 0;
//        int b1 = 0;
//        int number1;
//        for (int i = 0; i <= 3; i++) {
//            System.out.print("Введите число #" + (i + 1) + ": ");
//            number1 = scanner.nextInt();
//            if (number1 > 0) a1++;
//            if (number1 < 0) b1++;
//        }
//        System.out.println("Отрицательных чисел " + b1);
//        System.out.println("Положительных чисел " + a1);

//        5. Пользователь вводит в консоли три числа, выводим самое большое из них.

//        System.out.print("Введите первое число:");
//        int number1 = scanner.nextInt();
//        System.out.print("Введите второе число:");
//        int number2 = scanner.nextInt();
//        System.out.print("Введите третье число:");
//        int number3 = scanner.nextInt();
//        if (number1 > number2 && number1 > number3)
//            System.out.println("Самое большое число "+number1);
//        if (number2 > number1 && number2 > number3)
//            System.out.println("Самое большое число "+number2);
//        if (number3 > number1 && number3 > number2)
//            System.out.println("Самое большое число "+number3);

//        5. Пользователь вводит в консоли три числа, выводим самое большое из них (другой способ).

//        int number4;
//        int res = -2000000000;
//        for (int i = 0; i <= 2; i++) {
//            System.out.print("Введите число #" + (i + 1) + ": ");
//            number4 = scanner.nextInt();
//            if (number4 > res) res = number4;
//        }
//        System.out.println("Самое большое число " + res);

//        6. Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
//        наибольшего и наименьшего из них.

//        int number6;
//        int resMin = 2000000000;
//        int resMax = -2000000000;
//        for (int i = 0; i <= 2; i++) {
//            System.out.print("Введите число #" + (i + 1) + ": ");
//            number6 = scanner.nextInt();
//            if (number6 > resMax) resMax = number6;
//            if (number6 < resMin) resMin = number6;
//        }
//        System.out.println("Сумма = " + (resMax+resMin));

//        7. Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или
//        нечетное.

//        System.out.print("Введите число:");
//        int number7 = scanner.nextInt();
//        if (number7%2==0)
//            System.out.println("Число четное");
//        else
//            System.out.println("Число нечетное");

//        8. Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
//        товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
//        хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
//        [сумма сдачи]”.

//        double meat = 11.99;
//        double bread = 1.70;
//        double milk = 2.15;
//        System.out.println("1. Мясо цена: " + meat + "руб.");
//        System.out.println("2. Хлеб цена: " + bread + "руб.");
//        System.out.println("3. Молоко цена: " + milk + "руб.");
//        System.out.print("Выберите номер товара: ");
//        int number8 = scanner.nextInt();
//        System.out.print("Введите сумму денег: ");
//        double number9 = scanner.nextDouble();
//        switch (number8) {
//            case 1:
//                if (number9 == meat)
//                    System.out.print("Спасибо за покупку!");
//                if (number9 < meat)
//                    System.out.print("Денег не хватает!");
//                if (number9 > meat)
//                    System.out.print("Ваша сдача: " + (number9 - meat));
//                break;
//            case 2:
//                if (number9 == bread)
//                    System.out.print("Спасибо за покупку!");
//                if (number9 < bread)
//                    System.out.print("Денег не хватает!");
//                if (number9 > bread)
//                    System.out.print("Ваша сдача: " + (number9 - bread));
//                break;
//            case 3:
//                if (number9 == milk)
//                    System.out.print("Спасибо за покупку!");
//                if (number9 < milk)
//                    System.out.print("Денег не хватает!");
//                if (number9 > milk)
//                    System.out.print("Ваша сдача: " + (number9 - milk));
//                break;
//        }

//        9. Вывести в консоль таблицу умножения на 4.

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " x 4 = " + (i * 4));
//        }

//        10. Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х.

//        System.out.print("Введите любое число: ");
//        int number10 = scanner.nextInt();
//        for (int i = 0; i <= number10; i = i + 2) {
//            System.out.println(i);
//        }

//        11. Последовательность фибоначчи.

//        int a = 0;
//        int b = 1;
//        System.out.print(a);
//        while ((a + b) < 10000) {
//            int c = 0;
//            System.out.print("," + b);
//            c = a;
//            a = b;
//            b = c + b;
//        }

//        11a. Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
//        индексом х.

//        System.out.print("Введите любое число: ");
//        int number11 = scanner.nextInt();
//        int a = 0;
//        int b = 1;
//        int c = 0;
//        System.out.print(a);
//        for (int i = 2; i <= number11; i++) {
//            System.out.print("," + b);
//            c = a;
//            a = b;
//            b = c + b;
//            }
//        System.out.println();
//        System.out.print(a);

//        12. Пользователь вводит число. Выводим в консоль факториал этого числа.

//        System.out.print("Введите любое число: ");
//        int number12 = scanner.nextInt();
//        int a = 1;
//        for (int i = 1; i <= number12; i++) {
//            a = a*i;
//        }
//        System.out.print(a);

//        13. Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
//        один символ).

//        System.out.print("Введите любое слово: ");
//        String str = scanner.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }

//        14. Дан массив с целыми числами. Вывести в консоль количество положительных и
//        отрицательных чисел в нем.

//        int[] numbers = {1, 110, -56, 0, -4, 35, -89};
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 0) a++;
//            if (numbers[i] < 0) b++;
//        }
//        System.out.println("Отрицательных чисел " + b);
//        System.out.println("Положительных чисел " + a);

//        15. Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами.

//        int sum = 0;
//        for (int i = 0; i < numbers.length; i = i+2) {
//            sum = sum + numbers[i];
//        }
//        System.out.println("Сумма четных чисел: " + sum);

//        16. Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные
//        значения).

//        int sum = 0;
//        for (int i = 0; i < numbers.length; i = i+1) {
//          if (numbers[i] % 2 == 0)
//              sum = sum + numbers[i];
//        }
//        System.out.println("Сумма четных чисел: " + sum);

//        17. Дан массив с целыми числами. Вывести в консоль наибольшее из них.

//        int res = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > res) res = numbers[i];
//        }
//        System.out.println("Самое большое число " + res);

//        18. Дан двумерный массив 3х3 с целыми числами. Вывести в консоль все числа по
//        диагонали от [0][0] до [3][3].

//        int[][] numbers = {{1, 3, 5}, {2, 4, 6}, {9, 7, 5}};
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++)
//                if (i == j)
//                    System.out.println(numbers [i][j]);
//                }
//        19. Дан двумерный массив 3х3 с целыми числами. Вывести в консоль все числа по
//        диагонали от [0][3] до [3][0].

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++)
//                if (i + j == 2)
//                    System.out.println(numbers[i][j]);
//        }

//        20. Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и
//        вывести наибольшую из них.

//        int[][] numbers = {{1, 3, 5, 4, 0}, {2, 4, 6, 9, 1}, {9, 7, 5, 15, 3}, {4, 6, 2, 1, 0}, {7, 4, 1, 0, 6}};
//        for (int i = 0; i < 5; i++) {
//            int sum = 0;
//            for (int j  = 0; j < 5; j++) {
//                sum = sum + numbers[j][i];
//            }
//            System.out.println(sum);


//        System.out.print("Введите первое число: ");
//        int number1 = scanner.nextInt();
//        System.out.print("Введите второе число: ");
//        int number2 = scanner.nextInt();
//        if (number1 < number2) {
//            System.out.println("Первое число меньше второго");
//        } else {
//            if (number1 > number2)
//                System.out.println("Первое число больше второго");
//        }

        }
    }









