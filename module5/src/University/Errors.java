package University;

/**
 * Created by lsm on 03.05.2017.
 */
public class Errors{
    private Error[] errors;
    public Errors() {
        Error dummy = null;
        errors = new Error[dummy.getMaxErrorCode() - dummy.getMinErrorCode()];
    }
    private void UserErrors(){

    }
    private void StudentErrors(){

    }
}
