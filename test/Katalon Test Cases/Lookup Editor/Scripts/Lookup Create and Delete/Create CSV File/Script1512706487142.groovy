import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Authenticate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://127.0.0.1:8000/en-US/app/lookup_editor/lookup_edit?action=new&type=csv')

WebUI.callTestCase(findTestCase('Lookup Create and Delete/Set App Dropdown to lookup_test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Editor/Lookup Name Input'), 'LookupTest1234.csv')

WebUI.click(findTestObject('Editor/First Cell in First Content Row'))

WebUI.waitForElementNotVisible(findTestObject('Editor/Warning Message'), 0)

WebUI.click(findTestObject('Editor/Save Button'))

WebUI.waitForElementNotPresent(findTestObject('Editor/Warning Message'), 0)

WebUI.closeBrowser()

