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

WebUI.click(findTestObject('Object Repository/Page_Fit by Beat/span_About Us'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Fit by Beat/h1_About Us'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/div_Introduction        A boutique fitness _3fcd7c'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/img_About Us_attachment-full size-full'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/h2_Introduction'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/div_LocationLocated at CBD Area  Setiabudi _f9991f'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/div_The first project        located in Set_b1641b'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/h2_The first project'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/p_located in Setiabudi One Building, in a p_9ab895'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/div_The first project        located in Set_b1641b'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/div_Introduction        A boutique fitness _3fcd7c_1'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/h5_A boutique fitness center located in Set_c82415'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Fit by Beat/h2_Introduction'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Fit by Beat/h1_About Us'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

