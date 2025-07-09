package Kyu6.T12_FindTheParityOutlier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OutlierTest {

    @Test
    void sampleTests() {
        assertEquals(3, FindOutlier.find(new int[]{2, 6, 8, -10, 3}));
        assertEquals(206847684,
            FindOutlier.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1,
                7781})
        );
        assertEquals(0, FindOutlier.find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }

    @Test
    void sampleTests2() {
        assertEquals(3, FindOutlierBestSolution.find(new int[]{2, 6, 8, -10, 3}));
        assertEquals(206847684,
            FindOutlierBestSolution.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1,
                7781})
        );
        assertEquals(0, FindOutlierBestSolution.find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }

    @Test
    void sampleTests3() {
        assertEquals(3, NewFindOutlier.find(new int[]{2, 6, 8, -10, 3}));
        assertEquals(206847684,
            NewFindOutlier.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1,
                7781})
        );
        assertEquals(0, NewFindOutlier.find(new int[]{Integer.MAX_VALUE, 0, 1}));

        // even array, but not first element
        assertEquals(1, NewFindOutlier.find(new int[] {1, 2, 4, 6, 8}));
        assertEquals(3, NewFindOutlier.find(new int[] {3, 10, 12, 14, 16}));

        // problematic
        assertEquals(5, NewFindOutlier.find(new int[] {5, 8, 10, 12}));
        assertEquals(7, NewFindOutlier.find(new int[] {7, 20, 22, 24, 26}));

        // odd array, but not first element
        assertEquals(2, NewFindOutlier.find(new int[] {2, 1, 3, 5, 7}));
        assertEquals(4, NewFindOutlier.find(new int[] {4, 9, 11, 13, 15}));

        // edge cases
        assertEquals(0, NewFindOutlier.find(new int[] {0, 1, 3}));
        assertEquals(1, NewFindOutlier.find(new int[] {1, 0, 2}));
        assertEquals(-90, NewFindOutlier.find(new int[] {-83, -83, -90, -67, -85}));
    }
}
