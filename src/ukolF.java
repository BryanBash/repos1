package ukolF;

public class ukolF {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 3, 4, 4, 0, 8, 5, 5, 6, 7, 8, -2};
        int[] result = maxMin(array,true);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println(pocetVyskytu(array,5));

    }

    static int pocetVyskytu(int[] array, int hodnota) {
        int pocet = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == hodnota) {
                pocet++;
            }
        }
        return pocet;
    }

    static int[] maxMin(int[] array, boolean findFirst) {
        int max = array[0];
        int min = array[0];
        int pozMax = 0;
        int pozMin = 0;
        if (findFirst) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    pozMax = i;
                }
                if (array[i] < min) {
                    min = array[i];
                    pozMin = i;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= max) {
                    max = array[i];
                    pozMax = i;
                }
                if (array[i] <= min) {
                    min = array[i];
                    pozMin = i;
                }
            }
        }
        return new int[]{max, pozMax, min, pozMin};
    }
}
