import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class AccountClassTest {

    @Test
    @Parameters({"\"Kek Cheburek\", true","\"KekCheburek\",false","\"Kek Cheburek \",false","\" Kek Cheburek\",false","\" Kek Cheburek \",false"})
    public void checkUserName(String name, Boolean expected){
        Account account = new Account(name);
        assertEquals(expected, account.checkNameToEmboss());
    }
}
