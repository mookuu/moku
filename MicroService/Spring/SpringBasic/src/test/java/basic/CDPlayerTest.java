package basic;

import basic.audio.interfaces.CompactDisc;
import basic.audio.interfaces.MediaPlayer;
import basic.config.CDPlayerConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

/**
 * CDPlayerTest
 *
 * @author moku
 * @date 2023/5/21 23:05:33
 * @version 1.0
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull("false", cd);
    }

    @Test
    public void play() throws Exception {
        String text = tapSystemOut(() -> {
            player.play();
        });
//        assertEquals("Playing Title by Artist\r\n", text);
        assertTrue(text.contains("Playing Title by Artist"));
    }
}
