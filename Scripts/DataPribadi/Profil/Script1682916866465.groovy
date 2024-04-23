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

WebUI.navigateToUrl('https://cis.del.ac.id/user/login')

WebUI.setText(findTestObject('Object Repository/Page_11321057/Page_Login/input_Username_LoginFormusername'), 'if321057')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_11321057/Page_Login/input_Password_LoginFormpassword'), 'ID3ussEevOwLq+QchG5IxQ==')

WebUI.click(findTestObject('Object Repository/Page_11321057/Page_Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_11321057/Page_Dashboard/span_Data Induk Mahasiswa'))

WebUI.click(findTestObject('Object Repository/Page_11321057/Page_Dashboard/a_Data Diri'))

WebUI.click(findTestObject('Object Repository/Page_11321057/Page_11321057 Rahel Amelia Vega Sianipar/span_Home_fa fa-gear'))

WebUI.click(findTestObject('Object Repository/Page_11321057/Page_11321057 Rahel Amelia Vega Sianipar/a_Edit Data Induk'))

WebUI.click(findTestObject('Object Repository/Page_11321057/Page_Edit 11321057 Rahel Amelia Vega Sianipar/a_Data Akademis'))

WebUI.click(findTestObject('Object Repository/Page_11321057/Page_Edit 11321057 Rahel Amelia Vega Sianipar/a_Data Orangtua'))

WebUI.setText(findTestObject('Object Repository/Page_11321057/Page_Edit 11321057 Rahel Amelia Vega Sianipar/input_No. Hp Ayah_Dimno_hp_ayah'), 
    '081370116288')

WebUI.setText(findTestObject('Object Repository/Page_11321057/Page_Edit 11321057 Rahel Amelia Vega Sianipar/textarea_Jl. Lapangan Golf Girsang'), 
    'Jln. Lapangan Golf Girsang ')

WebUI.click(findTestObject('Object Repository/Page_11321057/Page_Edit 11321057 Rahel Amelia Vega Sianipar/button_Save'))

WebUI.closeBrowser()

