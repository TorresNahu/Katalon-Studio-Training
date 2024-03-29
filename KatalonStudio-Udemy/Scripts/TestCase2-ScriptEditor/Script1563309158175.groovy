import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Open browser
WebUI.openBrowser("http://lifecharger.org/")

//Click
WebUI.click(findTestObject('Object Repository/Test2_OR/Page_Life Charger   a new beginning/a_Make the rest of your life the best of your life'))

//Set text
WebUI.setText(findTestObject('Object Repository/Test2_OR/Page_Life Charger   a new beginning/input_Search for_s'), "LIFE")

//Verify Element
WebUI.verifyElementPresent(findTestObject('Object Repository/Test2_OR/Page_Life Charger   a new beginning/a_Home'), 4)

//Close browser
WebUI.closeBrowser()