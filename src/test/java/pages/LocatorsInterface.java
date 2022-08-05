package pages;

import org.openqa.selenium.By;

import java.awt.*;

public interface LocatorsInterface {

    By linkKontrol = By.cssSelector("a");
    By cookiesButton = By.cssSelector("button.btn.btn-default.button-submit-default-cookies");
    By branchenMenuItem= By.xpath("(//li[@class='sp-menu-item sp-has-child main-menu'])[1]");
    By automotiveMenuItem = By.xpath("(//span[text()='Automotive'])[1]");

;
    By automotiveConsultingItem = By.xpath("(//a[text()='Automotive Consulting'])[1]");
    By automotiveConsultingTitel = By.xpath("(//span[text()='Auto\u00ADmo\u00ADtive Consulting:'])[1]");

    By themenServicesMenuItem= By.xpath("(//li[@class='sp-menu-item sp-has-child main-menu'])[2]");
    By testQualityManagementItem= By.xpath(" (//li[@class='sp-menu-item sp-has-child'])[24]");
    By crowdTestingItem= By.xpath("(//a[text()='Crowdtesting'])[1]");
    By digitalBusinessTitle = By.xpath("(//h3[@class='sppb-addon-title'])[1]");
    By socialMediaList=By.cssSelector("ul.social-icons>li");
    String languageDe="(//li[@class='lang-active'])[1]";
    By languageEn=By.xpath("(//ul[@class='lang-inline']//li)[2]");

    By vornameInput = By.id("firstname-7d166885-fec4-44c0-bfef-bc50fb1e263a");
    By nachnameInput = By.id("lastname-7d166885-fec4-44c0-bfef-bc50fb1e263a");
    By unternehmenInput = By.id("company-7d166885-fec4-44c0-bfef-bc50fb1e263a");
    By bemerkungInput = By.id("message-7d166885-fec4-44c0-bfef-bc50fb1e263a");
    By telefonInput = By.id("phone-7d166885-fec4-44c0-bfef-bc50fb1e263a");
    By emailInput = By.id("email-7d166885-fec4-44c0-bfef-bc50fb1e263a");
    By selectPosition= By.id("usu_job_seniority-7d166885-fec4-44c0-bfef-bc50fb1e263a");
    By selectDepartman= By.id("usu_job_department_role-7d166885-fec4-44c0-bfef-bc50fb1e263a");
    By selectCountry= By.id("aspera_country-7d166885-fec4-44c0-bfef-bc50fb1e263a");

By submitButton= By.cssSelector(" input.hs-button.primary.large");
 By errorMessage=By.cssSelector("label.hs-main-font-element");

}
