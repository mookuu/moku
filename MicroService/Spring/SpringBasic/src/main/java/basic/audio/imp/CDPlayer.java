package basic.audio.imp;

import basic.audio.interfaces.CompactDisc;
import basic.audio.interfaces.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CDPlayer
 *
 * @author moku
 * @date 2023/5/23 21:39:52
 * @version 1.0
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public void setMediaPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    /**
     * Spring会尝试自动装配，如果没有匹配的bean的话，Spring将会让这个bean处于未装配状态，可能会导致NullPointerException
     */
    @Autowired(required = false)
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }
}
