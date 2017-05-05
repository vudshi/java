package University;

/**
 * Created by lsm on 03.05.2017.
 */
public class Errors{
    private static Error[] errors;
    public Errors(){
        if (Constants.maxErrorCode < 0 && Constants.minErrorCode < 0) {
            errors = new Error[Constants.maxErrorCode + Constants.minErrorCode];
        } else {
            SelfOut.out(Constants.ERRORS_NOT_LOADED);
        }
    }
    //private static void AddUserError()

    public static final String WRONG_LOGIN = "WRONG_LOGIN";
    public static final String WRONG_PASSWORD = "WRONG_PASSWORD";

}
