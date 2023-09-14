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

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_Studio 1'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_ClassClassYoga TherapyYin YogaHot YogaH_32feda'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_Studio 1        ClassClassYoga TherapyY_f81531'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_Studio 2'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_ClassClassLesmills RPMqodef-timetable-t_d861e0'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_Studio 3'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  Fit by Beat/div_Book now'))

WebUI.switchToWindowTitle('Registration')

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Home  Booking (step 1)Step 1Please foll_67d15a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_Select class Brazilian Jiu Jitsu (ID_87850d'), 
    '83', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_Select dateTuesday, 26 August 2025'), 
    '2025-08-26', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_Select time1935 - 20351935 - 2035193_359e9f'), 
    '19:35:00', true)

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Home  Booking (step 1)Step 1Please foll_67d15a_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_Select quantity12345'), '1', true)

WebUI.click(findTestObject('Object Repository/Page_Registration/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Home  Booking (step 2)Step 2Please foll_0439a2'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Registration/input_Write your name_name'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Write your name_name'), 'Wahid')

WebUI.click(findTestObject('Object Repository/Page_Registration/input_Write your email_email'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Write your email_email'), 'akundemo859@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Write your whatsapp number_whatsapp'), '868743729')

WebUI.click(findTestObject('Object Repository/Page_Registration/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Home  Booking (step 3)Step 3Please chec_12cfef'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Home  Booking (step 3)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_SuccessThank you for your bookingClassY_f5035a'))

WebUI.click(findTestObject('Object Repository/Page_Registration/p_Success'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Registration/p_Thank you for your booking'))

WebUI.closeBrowser()

