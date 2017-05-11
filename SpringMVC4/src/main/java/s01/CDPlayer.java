package s01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sg-0036936 on 11/05/2017.
 */
@Component
public class CDPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }

}
