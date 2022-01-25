package com.company;

public class Main {

//    public static void main(String[] args) {
//        System.out.println(multiaplicationTable(1));
//        System.out.println(multiaplicationTable(2));
//        System.out.println(multiaplicationTable(3));
//        System.out.println(multiaplicationTable(4));
//        System.out.println(multiaplicationTable(5));
//        System.out.println(multiaplicationTable(6));
//        System.out.println(multiaplicationTable(7));
//        System.out.println(multiaplicationTable(8));
//        System.out.println(multiaplicationTable(9));
//        System.out.println(multiaplicationTable(10));
//
//    }
//
//    public static String multiaplicationTable(int number){
//        return number * 1 + " "
//                + number * 2 + " "
//                + number * 3 + " "
//                + number * 4 + " "
//                + number * 5 + " "
//                + number * 6 + " "
//                + number * 7 + " "
//                + number * 8 + " "
//                + number * 9 + " "
//                + number * 10;
//  тоже самое ->
//
//        String result = "";
//        for (int i = 1; i <= 10; i++) {
//            Integer num = number * i;
//            result = result + " " + num;
//        }
//        return result;
//
//    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple1 = new Apple();
        apple1.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applePrice);
    }

    public static class Apple{
        public static int applePrice = 0;

        public static void addPrice(int applesPrice){
            Apple.applePrice = Apple.applePrice + applesPrice;
            System.out.println("Стоимость " + applesPrice);
        }
    }

}
