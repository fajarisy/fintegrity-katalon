package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object wait_short_time
     
    /**
     * <p></p>
     */
    public static Object wait_medium_time
     
    /**
     * <p></p>
     */
    public static Object wait_long_time
     
    /**
     * <p></p>
     */
    public static Object wait_js_long_time
     
    /**
     * <p></p>
     */
    public static Object GlobalPassword
     
    /**
     * <p></p>
     */
    public static Object Fintegrity
     
    /**
     * <p></p>
     */
    public static Object FinPass
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            wait_short_time = selectedVariables['wait_short_time']
            wait_medium_time = selectedVariables['wait_medium_time']
            wait_long_time = selectedVariables['wait_long_time']
            wait_js_long_time = selectedVariables['wait_js_long_time']
            GlobalPassword = selectedVariables['GlobalPassword']
            Fintegrity = selectedVariables['Fintegrity']
            FinPass = selectedVariables['FinPass']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
