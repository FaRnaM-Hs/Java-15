package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringShould {

    @Test
    void be_presented_by_text_blocks() {
        String text = "<HTML>"
                + "\n"
                + "    <BODY>"
                + "\n"
                + "        Hello World!"
                + "\n"
                + "    </BODY>"
                + "\n"
                + "</HTML>";

        String textBlock = """
                <HTML>
                    <BODY>
                        Hello World!
                    </BODY>
                </HTML>""";

        System.out.println(text);
        System.out.println(textBlock);
        Assertions.assertThat(text).isEqualTo(textBlock);
    }
}
