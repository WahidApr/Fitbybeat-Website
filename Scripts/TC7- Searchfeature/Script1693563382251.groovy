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

WebUI.click(findTestObject('Object Repository/Page_Fit by Beat/i_Contact Us_qodef-icon-ion-icon ion-androi_846845'))

WebUI.setText(findTestObject('Object Repository/Page_Fit by Beat/input_Calculate Your BMI_age'), 'Yoga')

WebUI.click(findTestObject('Object Repository/Page_Fit by Beat/i_Follow Us_qodef-icon-ion-icon ion-android-search'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/h1_Search results for Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_Search results for Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_Yoga Therapy'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_HIIT Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_Vinyasa Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_Gentle Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_FitFlow Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_Yin Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_Hatha Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/h5_Schedule'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/article_Schedule'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_LESSMILLS BODYBALANCE'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/span_LESSMILLS BODYBALANCE_arrow_carrot-right'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Page 2  Fit by Beat/div_Pound Fit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Search Results for Yoga  Page 2  Fit by Beat/h1_Search results for Yoga'))

