package University;

/**
 * Created by lsm on 03.05.2017.
 */
public class Error {
    private final int maxClassOwner = 10, minClassOwner = 1;
    private final int maxErrorCode = -10000, minErrorCode = -100000;
    private final int defValError = -1;
    private final int defValOk = 0;
    private int errCode;
    private int classOwner;
    private String description;

    public Error(int errCode, int classOwner, String description) {
        if (CheckErrCode(errCode, classOwner) != -1) {
            this.errCode = errCode;
        }

        this.classOwner = classOwner;
        this.description = description;
    }

    private int CheckClassOwner(int pClassOwner) {
        int result;
        if (pClassOwner >= minClassOwner & pClassOwner <= maxClassOwner){
            result = pClassOwner;
        } else {
            result = defValError;
        }
        return result;
    }

    private int CheckErrCode(int pErrCode, int classOwner) {
        int result = defValError;
        if (CheckClassOwner(classOwner) != defValError) {
            if (pErrCode >= minErrorCode * classOwner & pErrCode <= maxErrorCode) {
                result = pErrCode;
            }
        }
        return result;
    }

    public int getMaxErrorCode() {
        return maxErrorCode;
    }

    public int getMinErrorCode() {
        return minErrorCode;
    }
}
