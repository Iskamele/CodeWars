package Kyu7.T10_GrowthOfAPopulation;

class NewArge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;

        while (p0 < p){
            p0 += (int) (p0 * (percent / 100) + aug);
            years++;
        }

        return years;
    }
}
