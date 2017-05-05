package University;

/**
 * Created by lsm on 03.05.2017.
 */
public class Error {
    
    private int errCode;
    private byte owner;
    private String description;

    public void SetError(int errCode, byte owner, String description) {
    if (CheckErrCode(errCode, owner) != Constants.defValError) {
                this.errCode = errCode;
            }
            this.owner = owner;
            this.description = description;
    }

    private int Checkowner(int powner) {
        int result;
        if (powner >= Constants.minOwner & powner <= Constants.maxOwner){
            result = powner;
        } else {
            result = Constants.defValError;
        }
        return result;
    }

    private int CheckErrCode(int pErrCode, int owner) {
        int result = Constants.defValError;
        if (Checkowner(owner) != Constants.defValError) {
            if (pErrCode >= Constants.minErrorCode * owner & pErrCode <= Constants.maxErrorCode) {
                result = pErrCode;
            }
        }
        return result;
    }

    public boolean isNull() {
        boolean result = false;
        if (this.errCode == Constants.ZERO && this.getowner() == Constants.ZERO && this.description == "") {
            result = true;
        }
    return result;
    }

    public int getErrCode() {
        return errCode;
    }

    public byte getowner() {
        return owner;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxErrorCode() {
        return Constants.maxErrorCode;
    }

    public int getMinErrorCode() {
        return Constants.minErrorCode * this.owner;
    }

    @Override
    public String toString() {
        return "Error{" +
                "errCode=" + errCode +
                ", owner=" + owner +
                ", description='" + description + '\'' +
                '}';
    }
}
