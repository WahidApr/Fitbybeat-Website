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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fitbybeat.com/')

WebUI.click(findTestObject('Object Repository/Page_Fit by Beat/span_Schedule'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/h2_Studio 1'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/h2_Studio 2'))

WebUI.switchToWindowTitle('Schedule – Fit by Beat')

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/span_Book now'))

WebUI.switchToWindowTitle('Registration')

WebUI.click(findTestObject('Object Repository/Page_Registration/p_Step 1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_Select class Brazilian Jiu Jitsu (ID_87850d'), 
    '71', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_Select dateWednesday, 26 August 2026'), 
    '2026-08-26', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_Select time1930 - 20301930 - 2030193_dcfdca'), 
    '19:30:00', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_Select quantity12345'), '1', true)

WebUI.click(findTestObject('Object Repository/Page_Registration/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Write your name_name'), 'Akun demo')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Write your email_email'), 'akundemo@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Write your whatsapp number_whatsapp'), '83920372986393')

WebUI.click(findTestObject('Object Repository/Page_Registration/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Home  Booking (step 3)Step 3Please chec_838d2b'))

WebUI.click(findTestObject('Object Repository/Page_Registration/p_Step 3'))

WebUI.click(findTestObject('Object Repository/Page_Registration/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Registration/p_Success'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Registration/p_Thank you for your booking'))

