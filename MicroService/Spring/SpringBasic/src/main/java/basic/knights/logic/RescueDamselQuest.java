package basic.knights.logic;

import basic.knights.interfaces.Quest;

/**
 * RescueDamselQuest
 *
 * @author moku
 * @date 2023/5/18 22:09:37
 * @version 1.0
 */
public class RescueDamselQuest implements Quest {

    @Override
    public void embark() {
        System.out.println("Embarking on a quest to rescue the damsel.");
    }

}
