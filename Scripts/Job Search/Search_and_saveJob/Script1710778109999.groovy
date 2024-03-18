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

WebUI.navigateToUrl('https://recruit.infomedia.co.id/login_page')

WebUI.setText(findTestObject('Object Repository/Search/Page_Rekrutmen SSO Infomedia/input_Email_validationemail'), 'frutaman21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Search/Page_Rekrutmen SSO Infomedia/input_Password_validationpassword'), 
    'A7XJPV0S6sHhhsKzpg571w==')

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO Infomedia/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/div_Daftar Riwayat Hidup_cat__menu-left__pi_f192b1'))

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/a_Lowongan'))

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/div'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/input_Nama Lowongan_name_vacancy'), 'Quality Assurance')

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/span_search'))

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/span_search'))

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/a_Detail Pekerjaan'))

WebUI.switchToWindowTitle('Rekrutmen SSO TG')

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/a_Lamaran Saya'))

WebUI.verifyElementText(findTestObject('Object Repository/Search/Page_Rekrutmen SSO TG/h2_Quality Assurance CRM Product and Servic_069355'), 
    'Quality Assurance CRM Product and Service Management')

WebUI.takeScreenshot()

WebUI.closeBrowser()

