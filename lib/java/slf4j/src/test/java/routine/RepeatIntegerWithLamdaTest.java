package routine;

import routine.RepeatIntegerWithLamda;

/**
 * @description:
 * @author: Kan
 * @date: 2021/3/2 23:47
 */
public class RepeatIntegerWithLamdaTest {
    public static void main(String[] args) {
        RepeatIntegerWithLamda repeat = new RepeatIntegerWithLamda();
        repeat.repeat(10, i -> System.out.println("Countdown:" + (9 - i)));
    }
}
