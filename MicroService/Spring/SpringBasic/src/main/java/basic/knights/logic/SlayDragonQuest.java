package basic.knights.logic;

import basic.knights.interfaces.Quest;

import java.io.PrintStream;

/**
 * SlayDragonQuest
 *
 * @author moku
 * @date 2023/5/18 22:10:57
 * @version 1.0
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public SlayDragonQuest(String s) {
    }

    @Override
    public void embark() {
        System.out.println("Embarking on quest to slay the dragon!");
//        stream.println("Embarking on quest to slay the dragon!");
    }
}
