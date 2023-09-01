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

WebUI.click(findTestObject('Object Repository/Page_Fit by Beat/span_Classes'))

WebUI.click(findTestObject('Object Repository/Page_Classes  Fit by Beat/a_Judo'))

WebUI.click(findTestObject('Object Repository/Page_Judo  Fit by Beat/h2_Judo'))

WebUI.click(findTestObject('Object Repository/Page_Judo  Fit by Beat/span_Classes'))

WebUI.click(findTestObject('Object Repository/Page_Classes  Fit by Beat/a_Latin'))

WebUI.click(findTestObject('Object Repository/Page_Latin  Fit by Beat/h2_Latin'))

WebUI.click(findTestObject('Object Repository/Page_Latin  Fit by Beat/span_Classes'))

WebUI.click(findTestObject('Object Repository/Page_Classes  Fit by Beat/a_Circuit Muaythai'))

WebUI.click(findTestObject('Object Repository/Page_Circuit Muaythai  Fit by Beat/h2_Circuit Muaythai'))

WebUI.click(findTestObject('Object Repository/Page_Circuit Muaythai  Fit by Beat/span_Classes'))

WebUI.click(findTestObject('Object Repository/Page_Classes  Fit by Beat/span_Read More'))

WebUI.click(findTestObject('Object Repository/Page_LESSMILLS CYWORX  Fit by Beat/div_LESSMILLS CYWORX'))

