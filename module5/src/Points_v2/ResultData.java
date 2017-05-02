package Points_v2;

/**
 * Created by lsm on 5/1/2017.
 */
public class ResultData {

    public String formatResult (QuadraticEquation q) {
            if (q.getD() >= 0) {
                return "QuadraticEquation{" +
                        "a=" + q.getA() +
                        ", b=" + q.getB() +
                        ", c=" + q.getC() +
                        ". Result x1=" + q.getX1() +
                        ", x2=" + q.getX2() +
                        ", D=" + q.getD() +'}';
            } else {return "QuadraticEquation{" +
                    "a=" + q.getA() +
                    ", b=" + q.getB() +
                    ", c=" + q.getC() +
                    ". Result x1=compl" +
                    ", x2=compl" +
                    ", D=" + q.getD() +'}'; }
        }
}

