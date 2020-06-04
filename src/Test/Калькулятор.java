package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Калькулятор {
        public static int chislo1, chislo2 = 0;
   public static HashMap<Integer, String> createMap() {
       HashMap<Integer, String> tab = new HashMap<>();
       tab.put(0, "0"); tab.put(1, "I"); tab.put(2, "II"); tab.put(3, "III"); tab.put(4, "IV"); tab.put(5, "V");
       tab.put(6, "VI"); tab.put(7, "VII"); tab.put(8, "VIII"); tab.put(9, "IX"); tab.put(10, "X"); tab.put(11, "XI");
       tab.put(12, "XII"); tab.put(13, "XIII"); tab.put(14, "XIV"); tab.put(15, "XV"); tab.put(16, "XVI"); tab.put(17, "XVII");
       tab.put(18, "XVIII"); tab.put(19, "XIX"); tab.put(20, "XX"); tab.put(21, "XXI"); tab.put(22, "XXII"); tab.put(23, "XXIII");
       tab.put(24, "XXIV"); tab.put(25, "XXV"); tab.put(26, "XXVI"); tab.put(27, "XXVII"); tab.put(28, "XXVIII"); tab.put(29, "XXIX");
       tab.put(30, "XXX"); tab.put(31, "XXXI"); tab.put(32, "XXXII"); tab.put(33, "XXXIII"); tab.put(34, "XXXIV"); tab.put(35, "XXXV");
       tab.put(36, "XXXVI"); tab.put(37, "XXXVII"); tab.put(38, "XXXVIII"); tab.put(39, "XXXIX"); tab.put(40, "XL"); tab.put(41, "XLI");
       tab.put(42, "XLII"); tab.put(43, "XLIII"); tab.put(44, "XLIV"); tab.put(45, "XLV"); tab.put(46, "XLVI"); tab.put(47, "XLVII");
       tab.put(48, "XLVIII"); tab.put(49, "XLIX"); tab.put(50, "L"); tab.put(51, "LI"); tab.put(52, "LII"); tab.put(53, "LIII");
       tab.put(54, "LIV"); tab.put(55, "LV"); tab.put(56, "LVI"); tab.put(57, "LVII"); tab.put(58, "LVIII"); tab.put(59, "LIX");
       tab.put(60, "LX"); tab.put(61, "LXI"); tab.put(62, "LXII"); tab.put(63, "LXIII"); tab.put(64, "LXIV"); tab.put(65, "LXV");
       tab.put(66, "LXVI"); tab.put(67, "LXVII"); tab.put(68, "LXVIII"); tab.put(69, "LXIX"); tab.put(70, "LXX"); tab.put(71, "LXXI");
       tab.put(72, "LXXII"); tab.put(73, "LXXIII"); tab.put(74, "LXXIV"); tab.put(75, "LXXV"); tab.put(76, "LXXVI"); tab.put(77, "LXXVII");
       tab.put(78, "LXXVIII"); tab.put(79, "LXXIX"); tab.put(80, "LXXX"); tab.put(81, "LXXXI"); tab.put(82, "LXXXII"); tab.put(83, "LXXXIII");
       tab.put(84, "LXXXIV"); tab.put(85, "LXXXV"); tab.put(86, "LXXXVI"); tab.put(87, "LXXXVII"); tab.put(88, "LXXXVIII"); tab.put(89, "LXXXIX");
       tab.put(90, "XC"); tab.put(91, "XCI"); tab.put(92, "XCII"); tab.put(93, "XCIII"); tab.put(94, "XCIV"); tab.put(95, "XCV");
       tab.put(96, "XCVI"); tab.put(97, "XCVII"); tab.put(98, "XCVIII"); tab.put(99, "XCIX"); tab.put(100, "C");
       return tab;
   }

    public static int plus(int a, int b) {
            int rezul = a + b;
            return rezul;
        }

        public static int minus(int a, int b) {
            int rezul = a - b;
            return rezul;
        }

        public static int multiply(int a, int b) {
            int rezul = a * b;
            return rezul;
        }

        public static int division(int a, int b) {
            int rezul = a / b;
            return rezul;
        }

        public static String rim(Map<Integer, String> tab, int resul) {
            Iterator<Map.Entry<Integer, String>> it = tab.entrySet().iterator();
            String rezulrim = "";
            while (it.hasNext()) {
                Map.Entry<Integer, String> me = it.next();
                if (me.getKey() == resul)
                    rezulrim = me.getValue();
            }
            return rezulrim;
        }

    private static boolean isDigit(String a, String b) throws NumberFormatException {
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Вас приветствует программа калькулятор. Используйте только римские или только арабские числа.");
        System.out.println("Произведите ваше вычисление введя число_1, действие (+, -, *, /) и число_2 через пробел: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] words = str.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)

        if (isDigit(words[0], words[2]) == false) {
            switch (words[0]) {
                case "I":
                    chislo1 = 1;
                    break;
                case "II":
                    chislo1 = 2;
                    break;
                case "III":
                    chislo1 = 3;
                    break;
                case "IV":
                    chislo1 = 4;
                    break;
                case "V":
                    chislo1 = 5;
                    break;
                case "VI":
                    chislo1 = 6;
                    break;
                case "VII":
                    chislo1 = 7;
                    break;
                case "VIII":
                    chislo1 = 8;
                    break;
                case "IX":
                    chislo1 = 9;
                    break;
                case "X":
                    chislo1 = 10;
                    break;
                default:
                    System.out.println("Вы ввели не корректные символы, введите как сказано раннее");
                    return;
            }

            switch (words[2]) {
                case "I":
                    chislo2 = 1;
                    break;
                case "II":
                    chislo2 = 2;
                    break;
                case "III":
                    chislo2 = 3;
                    break;
                case "IV":
                    chislo2 = 4;
                    break;
                case "V":
                    chislo2 = 5;
                    break;
                case "VI":
                    chislo2 = 6;
                    break;
                case "VII":
                    chislo2 = 7;
                    break;
                case "VIII":
                    chislo2 = 8;
                    break;
                case "IX":
                    chislo2 = 9;
                    break;
                case "X":
                    chislo2 = 10;
                    break;
                default:
                    System.out.println("Вы ввели не корректные символы, введите как сказано раннее");
                    return;
            }

            switch (words[1]) {
                case "+":
                    System.out.println(words[0] + " + " + words[2] + " = " + rim(createMap(), plus(chislo1, chislo2)));
                    break;
                case "-":
                    System.out.println(words[0] + " - " + words[2] + " = " + rim(createMap(), minus(chislo1, chislo2)));
                    break;
                case "*":
                    System.out.println(words[0] + " * " + words[2] + " = " + rim(createMap(), multiply(chislo1, chislo2)));
                    break;
                case "/":
                    System.out.println(words[0] + " / " + words[2] + " = " + rim(createMap(), division(chislo1, chislo2)));
                    break;
                default:
                    System.out.printf("Вы ввели не корректные символы, введите как сказано раннее");
                    return;
            }
        }

        if (isDigit(words[0], words[2]) == true) {
            int ans = 0;
            int num1 = Integer.parseInt(words[0]);
            int num2 = Integer.parseInt(words[2]);

            switch(words[1]) {
                case "+": ans = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + ans);
                    break;
                case "-": ans = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + ans);
                    break;
                case "*": ans = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + ans);
                    break;
                case "/": ans = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + ans);
                    break;
                default:  System.out.printf("Вы ввели не корректные символы, введите как сказано раннее");
                    return;
            }
        }
    }
}

