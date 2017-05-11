package s01;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * First test of DI
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDTest {

    @Autowired
    private CompactDisc cd;

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    //testing DI
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    //testing autowired
    @Test
    public void play() {
        cd.play();
        assertEquals(
                "PLAY carai", log.getLog());
    }


}
