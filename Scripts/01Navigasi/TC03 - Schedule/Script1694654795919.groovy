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

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_ClassClassYoga TherapyYin YogaHot YogaH_32feda'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/span_Hot Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_Studio 2'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/h2_Studio 2'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_ClassClassLesmills RPM'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/span_Lesmills RPM'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_Studio 3'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/h2_Studio 3'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_ClassClassSexy DanceCircuit MuaythaiLes_759757'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/span_Circuit Muaythai'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/span_LESSMILLS BODYCOMBAT'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/span_Pound Fit'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/span_Sexy Dance'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/td'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/h2_Studio 3'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_ClassClassLesmills RPMqodef-timetable-t_d861e0'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/h2_Studio 2'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_ClassClassYoga TherapyYin YogaHot YogaH_32feda'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_Studio 1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Schedule  Fit by Beat/h2_Studio 1'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

