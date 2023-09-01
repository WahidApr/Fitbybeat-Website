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

WebUI.click(findTestObject('Object Repository/Page_Fit by Beat/span_Contact Us'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/h1_Contact Us'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/div_Contact Us'))

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/input_infofitbybeat.com_first-name'), 'Akun')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/input_infofitbybeat.com_last-name'), 'Demo')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/input_infofitbybeat.com_phone'), '88658980')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/input_infofitbybeat.com_email'), 'Akundemo989@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/textarea_infofitbybeat.com_message'), 'Test Comment')

WebUI.click(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/h5_EMail'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/input_infofitbybeat.com_wpcf7-form-control _242eeb'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us  Fit by Beat/div_Thank you for your message. It has been sent'))

