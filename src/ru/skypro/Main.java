package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("№1");
    var a = 1;
    byte b = 2;
    short c = 25000;
    int d = 345;
    long e = 783L;
    float i = 6.7f;
    double g = -1.1;
    System.out.println("Т.к. в задании не указано, что нужно выводить значения переменных на консоль, я их просто инициализировала.");

    System.out.println("№2");
    float boxerOneWeight = 78.2f;
    float boxerTwoWeight = 82.7f;
    float togetherWeight = boxerOneWeight+boxerTwoWeight;
    System.out.println("Общий вес двух боксеров " + togetherWeight + " кг");
    float differenceWeight = boxerTwoWeight-boxerOneWeight;
    System.out.println("Разница в весе боксеров составляет " + differenceWeight + " кг");

    System.out.println("№3");
    byte bananas = 5;
    byte bananasWeight1 = 80;
    short milk = 200;
    byte milkWeight100 = 105;
    byte icecream = 2;
    byte icecream1 = 100;
    byte eggs = 4;
    byte egg1 = 70;
    int generalBananasWeight = bananas * bananasWeight1;
    int numberMilk = milk / 100;
    int generalMilkWeight = milkWeight100 * numberMilk;
    int generalIcecreamWeight = icecream * icecream1;
    int generalEggsWeight = egg1 * eggs;
    float generalWeight = generalBananasWeight + generalMilkWeight + generalIcecreamWeight + generalEggsWeight;
    System.out.println("Общий вес завтрака составит " + generalWeight + " г");
    float generalWeightKg = generalWeight / 1000;
    System.out.println("Общий вес завтрака составит " + generalWeightKg + " кг");

    System.out.println("№4");
    short difference = 7;
    int differenceGr = difference * 1000;
    short lostV1 = 250;
    short lostV2 = 500;
    int daysV1 = differenceGr / lostV1;
    System.out.println("Если терять по 250 г в день, то спортсмен сбросит 7 кг за " + daysV1 + " дней");
    int daysV2 = differenceGr / lostV2;
    System.out.println("Если терять по 500 г в день, то спортсмен сбросит 7 кг за " + daysV2 + " дней");
    int averageDays = (daysV1 + daysV2) / 2;
    System.out.println("В среднем может потребоваться " + averageDays + " дней, чтобы сбросить 7 кг");

    System.out.println("№5");
    int mashaNow = 67760;
    int denisNow = 83690;
    int kristinaNow = 76230;
    int mashaPov = mashaNow * 110 / 100;
    int mashaNowYear = mashaNow * 12;
    int mashaPovYear = mashaPov * 12;
    int mashaDifferenceYear = mashaPovYear - mashaNowYear;
    System.out.println("Маша теперь получает " + mashaPov + " рублей в месяц. Годовой доход вырос на " + mashaDifferenceYear + " рублей");
    int denisPov = denisNow * 110 / 100;
    int denisNowYear = denisNow * 12;
    int denisPovYear = denisPov * 12;
    int denisDifferenceYear = denisPovYear - denisNowYear;
    System.out.println("Денис теперь получает " + denisPov + " рублей в месяц. Годовой доход вырос на " + denisDifferenceYear + " рублей");
    int kristinaPov = kristinaNow * 110 / 100;
    int kristinaNowYear = kristinaNow * 12;
    int kristinaPovYear = kristinaPov * 12;
    int kristinaDifferenceYear = kristinaPovYear - kristinaNowYear;
    System.out.println("Кристина теперь получает " + kristinaPov + " рублей в месяц. Годовой доход вырос на " + kristinaDifferenceYear + " рублей");
    }
}
