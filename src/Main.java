public class Main {
    public static void main(String[] args) {
//        В стране Y население равно 12 миллионов человек.
//        Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
//        Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
//                В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
        float people = 12_000_000f;
        int birthRate = 17;
        int deathRate = 8;

        for (int i = 0; i < 10; i++) {
            float birthForYear = people / 1000 * birthRate;
            float deathForYear = people / 1000 * deathRate;
            people = people + birthForYear - deathForYear;

            System.out.printf("%.2f \n", people);
        }
    }
}
