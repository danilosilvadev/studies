package s01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sg-0036936 on 10/05/2017.
 */

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public CompactDisc cd() {
        return new CompactDisc();
    }

}
