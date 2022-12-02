package ru.netology.stats;

public class StatsService {

    public int getSumAllSales(int[] sales) { //1. функция возвращает сумму всех продаж
        int sumSales = 0; //инициализируем сумму продаж
        for (int sale : sales) {
            sumSales = sumSales + sale; //суммируем
        }
        return (sumSales);
    }

    public int getAverageMonthSales(int[] sales) { //2. функция возвращает среднюю сумму продаж в месяц
        return (getSumAllSales(sales) / sales.length); //считаем и возращаем средний результат
    }

    public int getBestMonth(int[] sales) { //3. функция возвращает месяц, в котором был пик продаж
        int bestMonth = 0; //инициализируем индекс лучшего месяца
        int curMonth = 0;// иниализируем текущий месяц
        int bestSales = 0; // инициализируем сумму продаж лучшего месяца
        for (int sale : sales) {
            if (sale >= bestSales) { //если очередной месяц лучше или равен предыдущему то он – лучший
                bestSales = sales[curMonth];
                bestMonth = curMonth;
            }
            curMonth++;
        }
        return (bestMonth + 1); //возвращаем лучший месяц
    }

    public int getBadMonth(int[] sales) { //4. функция возвращает месяц, в котором был спад продаж
        int badMonth = 0; //инициализируем индекс худшего месяца
        int curMonth = 0;// иниализируем текущий месяц
        int badSales = sales[0]; // первый месяц – худший
        for (int sale : sales) {
            if (sale <= badSales) { //если очередной месяц хуже или равен предыдущему то он – худший
                badSales = sales[curMonth];
                badMonth = curMonth;
            }
            curMonth++;
        }
        return (badMonth + 1); //возвращаем лучший месяц
    }

    public int getMonthLowerAverage(int[] sales) { //5. функция возвращает число месяцев, где продажи ниже среднего
        int averageSales = getAverageMonthSales(sales); //вычисляем среднее число продаж
        int monthLower = 0; //инициализируем число месяцев, где продажи были ниже среднего
        for (int sale : sales) {
            if (sale < averageSales) {
                monthLower++; //если продаж было меньше среднего, увеличиваем счетчик
            }
        }
        return (monthLower);
    }

    public int getMonthHigherAverage(int[] sales) { //6. функция возвращает число месяцев, где продажи выше среднего
        int averageSales = getAverageMonthSales(sales); //вычисляем среднее число продаж
        int monthHigher = 0; //инициализируем число месяцев, где продажи были выше среднего
        for (int sale : sales) {
            if (sale > averageSales) {
                monthHigher++; //если продаж было больше среднего, увеличиваем счетчик
            }
        }
        return (monthHigher);
    }


}
