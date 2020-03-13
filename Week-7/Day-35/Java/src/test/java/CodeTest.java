import OtherPackage.CodeThatINeed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeTest {

    @Test
    public void returns_certain_value_specified(){
        assertEquals(3, CodeThatINeed.valueThatINeed);
    }



}
