package basic.knights.logic;

import basic.knights.interfaces.Knight;
import basic.knights.interfaces.Quest;

/**
 * BraveKnight
 * 
 * @author moku
 * @date 2023/5/18 21:57:02
 * @version 1.0
 */
public class BraveKnight implements Knight {

    private Quest quest;

    /**
     * 构造器注入
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
