import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class sOuterTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    void sayHejTest() {
        sOuter.whoIsJenkins();
        assertEquals("Leeeeeroy JEEEEENKINS", outputStreamCaptor.toString()
                .trim());

    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}