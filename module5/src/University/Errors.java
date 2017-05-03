package University;

/**
 * Created by lsm on 03.05.2017.
 */
public class Errors{
    private Error[] errors;
    private Error dummy;
    private Constants constants;

    public Errors() {
        constants = new Constants();
        dummy = new Error(constants);
        errors = new Error[constants.maxErrorCode - constants.minErrorCode];
        UserErrors();
        StudentErrors();
    }

    private void SetError(int errCode, byte classOwner, String description) {
        dummy.SetError(errCode, classOwner, description);
        for(int i = 0; i < constants.maxErrorCode; i++) {
            if (errors[i].isNull()) {
                errors[i] = dummy;
                break;
            }
        }
    }

    private void AddUserError(int pErrCode, String pErrDesc){
        final byte classOwner = 1;
        SetError(pErrCode, classOwner, pErrDesc);
    }
    private void AddStudentError(int pErrCode, String pErrDesc){
        final byte classOwner = 2;
        SetError(pErrCode, classOwner, pErrDesc);
    }
    private void UserErrors(){
        AddUserError(-10001, "User error 1");
        AddUserError(-10002, "User error 2");
        AddUserError(-10003, "User error 3");
        AddUserError(-10004, "User error 4");
    }
    private void StudentErrors(){
        AddUserError(-20001, "User error 1");
        AddUserError(-20002, "User error 2");
        AddUserError(-20003, "User error 3");
        AddUserError(-20004, "User error 4");
    }

    public Constants getConstants() {
        return constants;
    }

    public String GetErrorByCode (int pErrCode) {
      int i;
      for (i = 0; i < this.errors.length; i++) {
            if (errors[i].getErrCode() == pErrCode) {
                break;
            }
        }
      return errors[i].getDescription();
    }
    public Error[] GetErrorByClass(int pOwnerClass) {
        int i, cnt = 0;
        for (i = 0; i < this.errors.length; i++) {
            if (errors[i].getClassOwner() == pOwnerClass) {
                cnt++;
            }
        }
      return new Error[cnt];
    }

}
