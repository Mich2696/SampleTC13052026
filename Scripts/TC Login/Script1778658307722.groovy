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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as Helper
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
 org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

//String username = "John Doe"
//String password = "ThisIsNotAPassword"

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')
//WebUI.navigateToUrl("https://" + username + ":" + password + "https://katalon-demo-cura.herokuapp.com/profile.php#login")

TestObject username = new TestObject ('username')
username.addProperty('tag', ConditionType.EQUALS, 'input')
username.addProperty('id', ConditionType.EQUALS, 'txt-username')
WebUI.setText(username, 'John Doe')

TestObject password = new TestObject ('password')
password.addProperty('tag', ConditionType.EQUALS, 'input')
password.addProperty('id', ConditionType.EQUALS, 'txt-password')
WebUI.setText(password, 'ThisIsNotAPassword')

TestObject login = new TestObject ('login')
login.addProperty('tag', ConditionType.EQUALS, 'button')
login.addProperty('id', ConditionType.EQUALS, 'btn-login')
WebUI.click(login)

//WebUI.closeBrowser()











