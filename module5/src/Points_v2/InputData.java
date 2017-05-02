package Points_v2;

/**
 * Created by lsm on 5/1/2017.
 */
public class InputData {
    private boolean result;
    public boolean allArgIsGood(int a, int b, int c){
        if (a > 0 & b > 0 & b > 0) {
            result = true;
        }
        return result;
    }

    public boolean isResult() {
        return result;
    }

    @Override
    public String toString() {
        return "InputData{" +
                "result=" + result +
                '}';
    }
}
