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

WebUI.setText(findTestObject('Object Repository/Page_Fit by Beat/input_Follow Us_s'), 'Yoga')

WebUI.click(findTestObject('Object Repository/Page_Fit by Beat/i_Follow Us_qodef-icon-ion-icon ion-android-search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/h1_Search results for Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/div_Search results for Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/h2_New search'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/form_New searchIf you are not happy with th_525343'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/article_Yoga Therapy'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/article_HIIT Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/article_Vinyasa Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/article_Gentle Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/article_FitFlow Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/article_Hatha Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/article_LESSMILLS BODYBALANCE'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Fit by Beat/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Page 2  Fit by Beat/h1_Search results for Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Page 2  Fit by Beat/article_Pound Fit'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Page 2  Fit by Beat/i_Contact Us_qodef-icon-ion-icon ion-androi_846845'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Page 2  Fit by Beat/input_Follow Us_s'))

WebUI.setText(findTestObject('Object Repository/Page_Search Results for Yoga  Page 2  Fit by Beat/input_Follow Us_s'), 'judo')

WebUI.click(findTestObject('Object Repository/Page_Search Results for Yoga  Page 2  Fit by Beat/i_Follow Us_qodef-icon-ion-icon ion-android-search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Search Results for judo  Fit by Beat/h1_Search results for judo'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for judo  Fit by Beat/div_Search results for judo'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for judo  Fit by Beat/form_New searchIf you are not happy with th_525343'))

WebUI.click(findTestObject('Object Repository/Page_Search Results for judo  Fit by Beat/article_Judo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Search Results for judo  Fit by Beat/div_Search results for judo'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

