package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    int[] data = new int[]{10, 20, 30, 40, 0, 50, 10, 20, 30, 100, 10, 20};

    @Test
    public void shouldSumAllSales() { //1. тестируем функцию, возвращающую сумму всех продаж
        StatsService service = new StatsService();
        int expected = 340;
        int actual = service.getSumAllSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageMonthSales() { //2. тестируем функцию, возвращающую среднемесячное число продаж
        StatsService service = new StatsService();
        int expected = 28;
        int actual = service.getAverageMonthSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBestMonth() { //3. тестируем функцию, возвращающую индекс лучшего месяца
        StatsService service = new StatsService();
        int expected = 10;
        int actual = service.getBestMonth(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBadMonth() { //4. тестируем функцию, возвращающую индекс худшего месяца
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.getBadMonth(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMonthLowerAverage() { //5. тестируем функцию, возвращающую число месяцев, где продажи ниже среднего
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.getMonthLowerAverage(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMonthHigherAverage() { // 6.тестируем функцию, возвращающую число месяцев, где продажи выше среднего
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.getMonthHigherAverage(data);
        Assertions.assertEquals(expected, actual);
    }
}
