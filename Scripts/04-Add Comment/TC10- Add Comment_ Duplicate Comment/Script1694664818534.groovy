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

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Fit by Beat/span_News'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_News  Fit by Beat/h1_News'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_News  Fit by Beat/div_News'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_News  Fit by Beat/div_Success isnt always about greatness, It_eb7bb8'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_News  Fit by Beat/span_Read More'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/h1_Fit by Beat'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/div_Fit by Beat'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/div_About Sarah AtkinsCum sociis Theme nato_11ca04'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/p_Cum sociis Theme natoque penatibus et mag_a7f6f1'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/h5_Eating Habit For Best Performance'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/p_Duis sed odio sit amet nibh vulputate cur_b3eea8'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/div_By                developer            _7b6d86'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/div_ADD COMMENT cancel reply'))

WebUI.setText(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/textarea_cancel reply_comment'), 
    'First Comment')

WebUI.setText(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/input_cancel reply_author'), 
    'Wahid')

WebUI.setText(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/input_cancel reply_email'), 
    'akundemo859@gmail.com')

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Keep Your Body Its Best  Fit by Beat/input_cancel reply_submit'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Comment Submission Failure/body_Duplicate comment detected it looks as_be8108'))

WebUI.click(findTestObject('Object Repository/Duplicate Add Comment/Page_Comment Submission Failure/p_Duplicate comment detected it looks as th_85686f'))

WebUI.closeBrowser()

