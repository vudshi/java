package University;

/**
 * Created by lsm on 03.05.2017.
 */
public class Error {
    private Constants constants;
    private int errCode;
    private byte classOwner;
    private String description;

    public Error(Constants constants) {
        if (this.constants != constants) {
            this.constants = constants;
        }
    }

    public void SetError(int errCode, byte classOwner, String description) {
        if (this.constants != null) {
            if (CheckErrCode(errCode, classOwner) != this.constants.defValError) {
                this.errCode = errCode;
            }
            this.classOwner = classOwner;
            this.description = description;
        }
    }

    private int CheckClassOwner(int pClassOwner) {
        int result;
        if (pClassOwner >= this.constants.minClassOwner & pClassOwner <= this.constants.maxClassOwner){
            result = pClassOwner;
        } else {
            result = this.constants.defValError;
        }
        return result;
    }

    private int CheckErrCode(int pErrCode, int classOwner) {
        int result = this.constants.defValError;
        if (CheckClassOwner(classOwner) != this.constants.defValError) {
            if (pErrCode >= this.constants.minErrorCode * classOwner & pErrCode <= this.constants.maxErrorCode) {
                result = pErrCode;
            }
        }
        return result;
    }

    public boolean isNull() {
        boolean result = false;
        if (this.errCode == constants.ZERO & this.getClassOwner() == constants.ZERO & this.description == "") {
            result = true;
        }
    return result;
    }

    public int getErrCode() {
        return errCode;
    }

    public byte getClassOwner() {
        return classOwner;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxErrorCode() {
        return constants.maxErrorCode;
    }

    public int getMinErrorCode() {
        return this.constants.minErrorCode * this.classOwner;
    }

    @Override
    public String toString() {
        return "Error{" +
                "errCode=" + errCode +
                ", classOwner=" + classOwner +
                ", description='" + description + '\'' +
                '}';
    }
}
