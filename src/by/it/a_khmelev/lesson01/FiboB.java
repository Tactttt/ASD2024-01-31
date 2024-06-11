package by.it.a_khmelev.lesson01;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        ArrayList<BigInteger> nums = new ArrayList<>(n);
        nums.add(BigInteger.ZERO); // F(0)
        nums.add(BigInteger.ONE);  // F(1)

        for (int i = 2; i <= n; i++) {
            BigInteger f = nums.get(i - 2).add(nums.get(i - 1));
            nums.add(f);
        }

        // здесь нужно реализовать вариант с временем O(n) и памятью O(n)
        return nums.get(n);
    }
}
