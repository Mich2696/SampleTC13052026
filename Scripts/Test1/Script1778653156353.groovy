import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

TestObject inputUsername = new TestObject ('inputUsername')
inputUsername.addProperty('tag', ConditionType.EQUALS, 'input')
inputUsername.addProperty('placeholder', ConditionType.EQUALS, 'Username')
WebUI.setText(inputUsername, 'Admin')
WebUI.delay(3)

TestObject inputPassword = new TestObject ('inputPassword')
inputPassword.addProperty('tag', ConditionType.EQUALS, 'input')
inputPassword.addProperty('placeholder', ConditionType.EQUALS, 'Password')
WebUI.setText(inputPassword, 'admin123')
WebUI.delay(3)

TestObject clickLogin = new TestObject ('clickLogin')
clickLogin.addProperty('tag', ConditionType.EQUALS, 'button')
clickLogin.addProperty('type', ConditionType.EQUALS, 'submit')
WebUI.click(clickLogin)
WebUI.verifyElementVisible(clickLogin)
WebUI.delay(3)

