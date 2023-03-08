package Kyu7.T10_GrowthOfAPopulation;

import java.util.stream.Stream;

class ArgeStream {

    public static int nbYear(int p0, double percent, int aug, int l) {
        return (int) Stream.iterate(p0, p -> p < l, p -> p + (int) (p * percent / 100) + aug)
                .count();
    }
}