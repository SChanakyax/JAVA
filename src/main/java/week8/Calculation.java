package week8;

public class Calculation {

    public int cal_Add(int x, int y) {
        return x + y;
    }

    public int cal_Diff(int x, int y) {
        return x - y;
    }

    public int cal_Mul(int x, int y) {
        return x * y;
    }

    public float cal_Div(int x, int y) { //if y is not == to 0
        if (y == 0)
            return 0;
        else
            return x / (float) y;
    }

    public int cal_max(int x, int y) {
        return Math.max(x, y);
    }

    public int cal_min(int x, int y) {
        return Math.min(x, y);
    }

    public int cal_max(int x, int y, int z) {
        int max = x;
        int temp;
        if (y > z) {
            temp = y;
        } else {
            temp = z;
        }
        if (temp > max) {
            max = temp;
        }
        return max;
    }
}
