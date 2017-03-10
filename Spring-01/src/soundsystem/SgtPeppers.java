package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author ilakeyc
 * @since 2017/3/10
 */

@Component // 告诉 Spring 这个类作为组建类，要为其创建 Bean
public class SgtPeppers implements CompactDisc {

    private String title = "Some Song";
    private String artist = "Some One";

    @Override
    public void play() {
        System.out.println("Play " + title + " by " + artist);
    }
}
