import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTests {

    @Test
    public void examples() {
        assertEquals("For input: [1, 2, \"a\", \"b\"]", List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")));
        assertEquals("For input: [1, \"a\", \"b\", 0, 15]", List.of(1, 0, 15), Kata.filterList(List.of(1, "a", "b", 0, 15)));
        assertEquals("For input: [1, 2, \"aasf\", \"1\", \"123\", 123]", List.of(1, 2, 123), Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
    }
}