public class Main {
    public static void main(String[] args) {
        //Задание 1. Блок 1
        System.out.println("Task 1. Block 1");
        int yearsOld = 17;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (yearsOld < 18) {
            System.out.println("Человек ещё не достиг совершеннолетия");
        }

        // Задание 2. Блок 1
        System.out.println("Task 2. Block 1");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек ходит в университет");
        }
        if (yearsOld >= 24) {
            System.out.println("Человек ходит на работу");
        }

        //Задание 3. Блок 2
        System.out.println("Task 3. Block 1");
        int capacity = 102;
        int seatsCount = 60;
        int otherPlaces = capacity - seatsCount;

        int seatsUsed = 13;
        int otherUsed = 34;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть ещё " + (seatsCount - seatsUsed) + " сидячих мест");
        }
        if (seatsUsed == seatsCount) {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherPlaces) {
            System.out.println("Есть ещё " + (otherPlaces - otherUsed) + " стоячих мест");
        }
        if (otherUsed == otherPlaces) {
            System.out.println("Стоячих мест нет");
        }
    }
}