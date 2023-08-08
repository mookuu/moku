package basic;

import basic.knights.interfaces.Quest;
import basic.knights.logic.BraveKnight;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * BraveKnightTest
 *
 * @author moku
 * @date 2023/5/18 22:13:15
 * @version 1.0
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        // 创建Quest接口的mock实现
        Quest mockQuest = mock(Quest.class);
        // 注入mock Quest
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        // 验证Quest的mock实现的embark方法仅被调用了一次
        verify(mockQuest, times(1)).embark();
    }
}
