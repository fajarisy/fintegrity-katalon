package customKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.eclipse.persistence.sessions.serializers.KryoSerializer

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.exception.BrowserNotOpenedException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


/**
 *
 * This function is created to help easy login
 * Fill the parameter which is URL, UserName and password
 *
 * */


public class LoginHelper {

	@Keyword
	public void DoLogin(String aplicationURL, String userName, String password){
		try {
			WebUI.navigateToUrl(aplicationURL)
			KeywordUtil.logInfo("Login Have Been Initiated")
		} catch(BrowserNotOpenedException){
			WebUI.openBrowser(aplicationURL)
			KeywordUtil.logInfo("Browser is not opened, Login Have Been Re-Initiated")
		}
		WebUI.waitForPageLoad(120,FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(GlobalVariable.wait_short_time)
		WebUI.maximizeWindow()

		WebUI.takeScreenshot('D:\\screenshot.png')
		WebUI.waitForElementVisible(findTestObject('Object Repository/LoginLogout/Page_ Login/input_frmMainbtnLogin'), 90, FailureHandling.STOP_ON_FAILURE)
		WebUI.sendKeys(findTestObject('Object Repository/LoginLogout/Page_ Login/input_frmMainuserName'), userName)
		WebUI.sendKeys(findTestObject('Object Repository/LoginLogout/Page_ Login/input_frmMainpassword'), password)

		WebUI.click(findTestObject('Object Repository/LoginLogout/Page_ Login/input_frmMainbtnLogin'))
		KeywordUtil.markPassed("Login Completed!")
	}
}
