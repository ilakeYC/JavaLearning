import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;

/**
 * @author ilakeyc
 * @since 2017/3/9
 */

@ContextConfiguration(classes = CDPlayerConfig.class)
public class Main {

    @Autowired
    private CompactDisc compactDisc;

    public static void main(String[] args) {

    }
}
