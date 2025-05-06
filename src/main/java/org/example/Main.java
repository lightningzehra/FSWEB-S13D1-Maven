package org.example;

    public class Main {
        public static void main(String[] args) {


            System.out.println(shouldWakeUp(true, 1));
            System.out.println(hasTeen(15, 22, 45));
            System.out.println(isCatPlaying(false, 35));
            System.out.println(area(5.0,4.0));
        }

        public static boolean shouldWakeUp(boolean isBarking, int clock) {
            if (clock < 0 || clock > 23 || !isBarking) {
                return false;
            }
            return (clock < 8 || clock > 20);
        }

        public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
            return (isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge));
        }

        public static boolean isTeen(int age) {
            return age >= 13 && age <= 19;
        }

        public static boolean isCatPlaying(boolean isSummer, int temp) {
            int lowestTemp = 25;
            int highestTemp = isSummer ? 45 : 35;
            return temp >= lowestTemp && temp <= highestTemp;
        }


        public static double area(double width, double height) {
            if (width < 0 || height < 0) {
                return -1;
            }
            return width * height;
        }

        public static double area(double radius) {
            if (radius < 0) {
                return -1;
            }
            return radius * radius * Math.PI;
        }






}
