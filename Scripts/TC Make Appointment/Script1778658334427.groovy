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

TestObject clickfasility = new TestObject ('clickfasility')
clickfasility.addProperty('tag', ConditionType.EQUALS, 'select')
clickfasility.addProperty('id', ConditionType.EQUALS, 'combo_facility')
WebUI.click(clickfasility)

TestObject selectfasilty = new TestObject ('selectfasilty')
selectfasilty.addProperty('tag', ConditionType.EQUALS, 'option')
selectfasilty.addProperty('value', ConditionType.EQUALS, 'Hongkong CURA Healthcare Center')
WebUI.click(selectfasilty)

TestObject clickcheckbox = new TestObject ('clickcheckbox')
clickcheckbox.addProperty('tag', ConditionType.EQUALS, 'input')
clickcheckbox.addProperty('id', ConditionType.EQUALS, 'chk_hospotal_readmission')
WebUI.click(clickcheckbox)

//TestObject clickdate = new TestObject ('clickdate')
//clickdate.addProperty('tag', ConditionType.EQUALS, 'div')
//clickdate.addProperty('class', ConditionType.EQUALS, 'input-group-addon')
//WebUI.click(clickdate)

TestObject selectdate = new TestObject ('selectdate')
selectdate.addProperty('tag', ConditionType.EQUALS, 'input')
selectdate.addProperty('id', ConditionType.EQUALS, 'txt_visit_date')
WebUI.setText(selectdate, '13/05/2026')

//TestObject comment = new TestObject ('comment')
//comment.addProperty('tag', ConditionType.EQUALS, 'textarea')
//comment.addProperty('placeholder', ConditionType.EQUALS, 'Comment')
//WebUI.waitForElementVisible(comment, 10)
//WebUI.setText(comment, 'testing')

TestObject comment = new TestObject('comment')
comment.addProperty('xpath', ConditionType.EQUALS, "//textarea[@id='txt_comment']")

//WebUI.closeBrowser()


