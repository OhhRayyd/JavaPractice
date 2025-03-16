package Arrays.Easy;

public class Flowers {

    public static void main(String[] args) {
        int[] flowerBed = {0, 0, 1, 0, 0, 1, 0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerBed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (1 == flowerbed.length && flowerbed[0] == 0 && n == 1) {
            return true;
        } else if (1 == flowerbed.length && flowerbed[0] == 1 && n >= 1) {
            return false;
        } else if (1 == flowerbed.length && flowerbed[0] == 1 && n == 0) {
            return true;
        } else if (1 == flowerbed.length && flowerbed[0] == 0 && n == 0) {
            return true;
        }

        for (int i = 0; i <= flowerbed.length - 1; i++) {
            if (n == 0) {
                break;
            }
            if ((i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                continue;
            } else if (i == 0 && flowerbed[i] == 1) {
                continue;
            } else if (i == 0 && flowerbed[i + 1] == 1) {
                continue;
            }
            if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                flowerbed[i] = 1;
                n--;
                continue;
            } else if (i == flowerbed.length - 1 && flowerbed[i] == 1) {
                continue;
            }

            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                if (flowerbed[i] == 1) {
                    continue;
                }
                flowerbed[i] = 1;
                n--;
            }
        }

        return n == 0;
    }
}


