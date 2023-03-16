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

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full Name_firstName'), 'Ucup')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full Name_middleName'), 'Bin')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full Name_lastName'), 'Sanusi')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_-- Select --'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Email_oxd-input oxd-input--focus'), 'ucupsanusi@yahoo.com')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_No file selected_oxd-icon bi-upload oxd-f_21640a'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Keywords_oxd-input oxd-input--focus'), 'test')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Date of Application_oxd-icon bi-calendar _dfcec9'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_10'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 'test')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Consent to keep data_oxd-icon bi-check ox_63b9ed'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save'))

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/candidate_Name'), 'Ucup Bin Sanusi')

WebUI.closeBrowser()

