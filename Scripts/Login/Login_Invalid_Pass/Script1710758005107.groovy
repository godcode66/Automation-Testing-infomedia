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

WebUI.navigateToUrl('https://recruit.infomedia.co.id/home')

WebUI.click(findTestObject('LoginInvalid/Page_Rekrutmen SSO Infomedia/Page_Rekrutmen SSO Infomedia/span_'))

WebUI.click(findTestObject('Object Repository/LoginValid/Page_Rekrutmen SSO Infomedia/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/LoginValid/Page_Rekrutmen SSO Infomedia/input_Email_validationemail'), 'frutaman21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginValid/Page_Rekrutmen SSO Infomedia/input_Password_validationpassword'), 
    'F0oePG56Ngx2bQSoBGQKOg==')

WebUI.click(findTestObject('Object Repository/LoginValid/Page_Rekrutmen SSO Infomedia/button_Masuk'))

WebUI.verifyElementText(findTestObject('Notification/Page_Rekrutmen SSO Infomedia/div_Email atau Password salah, silahkan periksa kembali data yang anda masukkan .Gagal Login'), 
    '×Email atau Password salah, silahkan periksa kembali data yang anda masukkan .Gagal Login')

WebUI.takeScreenshot()

WebUI.closeBrowser()

