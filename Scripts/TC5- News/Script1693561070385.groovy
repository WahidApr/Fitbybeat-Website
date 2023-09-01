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

WebUI.click(findTestObject('Object Repository/Page_Fit by Beat/span_News'))

WebUI.click(findTestObject('Object Repository/Page_News  Fit by Beat/a_Success isnt always about greatness, Its _e51c27'))

WebUI.click(findTestObject('Object Repository/Page_Pull And Go Workout.  Fit by Beat/h5_Success isnt always about greatness, Its_023f59'))

WebUI.click(findTestObject('Object Repository/Page_Pull And Go Workout.  Fit by Beat/blockquote_Cum sociis Theme natoque penatib_c46614'))

WebUI.click(findTestObject('Object Repository/Page_Pull And Go Workout.  Fit by Beat/h5_Eating Habit For Best Performance'))

WebUI.click(findTestObject('Object Repository/Page_Pull And Go Workout.  Fit by Beat/p_Duis sed odio sit amet nibh vulputate cur_b3eea8'))

WebUI.click(findTestObject('Object Repository/Page_Pull And Go Workout.  Fit by Beat/div_Success isnt always about greatness, It_eb7bb8'))

WebUI.click(findTestObject('Object Repository/Page_Pull And Go Workout.  Fit by Beat/div_Fitness'))

WebUI.click(findTestObject('Object Repository/Page_Pull And Go Workout.  Fit by Beat/span_News'))

WebUI.click(findTestObject('Object Repository/Page_News  Fit by Beat/a_Keep Your Body Its Best'))

WebUI.click(findTestObject('Object Repository/Page_Keep Your Body Its Best  Fit by Beat/h2_Keep Your Body Its Best'))

WebUI.click(findTestObject('Object Repository/Page_Keep Your Body Its Best  Fit by Beat/div_By                developer            _7b6d86'))

WebUI.click(findTestObject('Object Repository/Page_Keep Your Body Its Best  Fit by Beat/blockquote_Cum sociis Theme natoque penatib_c46614'))

WebUI.click(findTestObject('Object Repository/Page_Keep Your Body Its Best  Fit by Beat/div_Lorem Ipsn gravida nibh vel velit aucto_bc6605'))

WebUI.click(findTestObject('Object Repository/Page_Keep Your Body Its Best  Fit by Beat/p_Duis sed odio sit amet nibh vulputate cur_b3eea8'))

WebUI.click(findTestObject('Object Repository/Page_Keep Your Body Its Best  Fit by Beat/span_News'))

WebUI.click(findTestObject('Object Repository/Page_News  Fit by Beat/a_The Healthy Life, The Best'))

WebUI.click(findTestObject('Object Repository/Page_The Healthy Life, The Best  Fit by Beat/p_Duis sed odio sit amet nibh vulputate cur_b3eea8'))

WebUI.click(findTestObject('Object Repository/Page_The Healthy Life, The Best  Fit by Beat/span_News'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_News  Fit by Beat/h1_News'))

