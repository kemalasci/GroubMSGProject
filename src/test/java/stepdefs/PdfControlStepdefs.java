package stepdefs;

import io.cucumber.java.en.Given;
import utils.PdfClass;

import static pages.InformationClass.*;

public class PdfControlStepdefs extends PdfClass {
    @Given("pdf kontrol")
    public void pdfKontrol() throws InterruptedException {
        verifyContentInPDf(pdfMsg_Services_FactsheetUrl, factSheetPdfKontrolString);
        verifyContentInPDf(msg_Services_CloudLosungenUrl, msg_Services_CloudPdfKontrolString);
        verifyContentInPDf(msg_Services_SAPUrl, msg_services_SAPPdfKontrolString);


        driver.quit();
    }
}
