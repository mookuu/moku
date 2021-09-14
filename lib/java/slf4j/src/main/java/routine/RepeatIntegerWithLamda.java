package routine;

import java.util.function.IntConsumer;

/**
 * @description:
 * @author: Kan
 * @date: 2021/3/2 23:44
 */
public class RepeatIntegerWithLamda {

    /**
     * 基本类型函数式接口
     * @param n
     * @param action
     */
    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }
}
