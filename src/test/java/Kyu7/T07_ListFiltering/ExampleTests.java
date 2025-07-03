package Kyu7.T07_ListFiltering;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExampleTests {

    @Test
    void examples() {
        assertEquals(
            List.of(1, 2),
            Kata.filterList(List.of(1, 2, "a", "b")),
            "For input: [1, 2, \"a\", \"b\"]"
        );
        assertEquals(
            List.of(1, 0, 15),
            Kata.filterList(List.of(1, "a", "b", 0, 15)),
            "For input: [1, \"a\", \"b\", 0, 15]"
        );
        assertEquals(
            List.of(1, 2, 123),
            Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)),
            "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]"
        );
    }

    @Test
    void examples2() {
        assertEquals(
            List.of(1, 2),
            NewKata.filterList(List.of(1, 2, "a", "b")),
            "For input: [1, 2, \"a\", \"b\"]"
        );
        assertEquals(
            List.of(1, 0, 15),
            NewKata.filterList(List.of(1, "a", "b", 0, 15)),
            "For input: [1, \"a\", \"b\", 0, 15]"
        );
        assertEquals(
            List.of(1, 2, 123),
            NewKata.filterList(List.of(1, 2, "aasf", "1", "123", 123)),
            "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]"
        );
    }
}
