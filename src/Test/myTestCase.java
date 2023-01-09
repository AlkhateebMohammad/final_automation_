package Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class myTestCase extends parameter {

	@Test(priority = 1)
	public void check_the_title() {
		String actuialTitle = driver.getTitle();
		assertprocess.assertEquals(actuialTitle, expectedTitle);
		assertprocess.assertAll();

	}

	//@Test(priority = 2)
	//public void check_the_image_drawaer() {
		//List<WebElement> imagedrawaer = driver.findElements(By.className("img-fluid"));
		//boolean checkimage1 = imagedrawaer.get(0).getAttribute("src") == imagedrawaer.get(1).getAttribute("src");
		//boolean checkimage2 = imagedrawaer.get(1).getAttribute("src") == imagedrawaer.get(2).getAttribute("src");
		//boolean checkimage3 = imagedrawaer.get(2).getAttribute("src") == imagedrawaer.get(0).getAttribute("src");
		//assertprocess.assertEquals(checkimage1, false);
		//assertprocess.assertEquals(checkimage2, false);
		//assertprocess.assertEquals(checkimage3, false);
		//assertprocess.assertAll();

	//}

	@Test(priority = 2)
	public void Add_the_cart_nokia() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		String msgtext = driver.switchTo().alert().getText();
		
		boolean mychecktext=msgtext.contains("Product");
		assertprocess.assertEquals(mychecktext, true);
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		assertprocess.assertAll();

	}

	/*
	 * @Test(priority = 3) public void check_the_price()
	 * 
	 * { String check_price =
	 * driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h5")).
	 * getText(); String ubdate = check_price.replace("$", ""); String ubdate1 =
	 * ubdate.trim(); int final_ubdate = Integer.parseInt(ubdate1);
	 * assertprocess.assertEquals(final_ubdate, 360); assertprocess.assertAll();
	 * 
	 * }
	 */
	// @Test(priority = 4)
//	public void price_order()
	// {
	// driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
	// driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
	// driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("mohammed");
	// driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("jordan");
	// driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("amman");
	// driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("23456");
	// driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("2");
	// driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2022");
	// driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();

	// String
	// sucssumsg=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
	// if(sucssumsg.contains("Thank"))
	// {
	// driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
	// }
	// else
	// {
	// driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")).click();

	// }

	// }

	/*
	 * @Test() public void testSignup() {
	 * driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys(
	 * "mohammed@yahoo.com");
	 * driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("123456")
	 * ; driver.findElement(By.xpath(
	 * "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
	 * 
	 * WebDriverWait wait=new WebDriverWait(driver, null);
	 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(
	 * "modal-dialog")));
	 * 
	 * WebElement modalContainer=driver.findElement(By.className("modal-dialog"));
	 * 
	 * WebElement modalContentBody =modalContainer.findElement(By.xpath(
	 * "//*[@id=\"signInModal\"]/div/div/div[2]"));
	 * assertprocess.assertEquals(modalContainer.getText(),
	 * "Verify modal body message"); assertprocess.assertAll(); WebElement
	 * modalContentButton=modalContainer.findElement(By.xpath(""));
	 * modalContentButton.click();
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 4) public void correct_the_price_sone() {
	 * 
	 * String correct_the_price =
	 * driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[9]/div/div/h5")).
	 * getText(); String ubdatesone = correct_the_price.replace("$", ""); String
	 * ubdatesone2 = ubdatesone.trim(); int final_price_sone =
	 * Integer.parseInt(ubdatesone2);
	 * 
	 * assertprocess.assertEquals(final_price_sone, 790); assertprocess.assertAll();
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 5) public void check_contact() { String name_of_email[] = {
	 * "mohammed@yahoo.com", "moha@gmail", "al@yahoo.com", "sl@gmail.com" };
	 * 
	 * Random email_index = new Random(); int index = email_index.nextInt(4);
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click()
	 * ;
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(
	 * name_of_email[index]);
	 * 
	 * String myvalue =
	 * driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).getAttribute(
	 * "value");
	 *  String regex = "^[A-Za-z0-9+_.-]+@(.+)+.(.+)$";
	 *   Pattern pattern =
	 * Pattern.compile(regex);
	 *  Matcher matcher =
	 * pattern.matcher(name_of_email[index]);
	 * 
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")).click();
	 * 
	 * boolean checkprocessforemail = matcher.matches();
	 * assertprocess.assertEquals(checkprocessforemail, true);
	 * assertprocess.assertAll();
	 * 
	 * } /*
	 * 
	 * @Test() public void test_contactus() throws InterruptedException {
	 * driver.navigate().back();
	 * driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click()
	 * ; driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(
	 * "mohammed19976@yahoo.com");
	 * driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys(
	 * "mohammed"); driver.findElement(By.xpath("//*[@id=\"message-text\"]")).
	 * sendKeys("my name is mohammmed alkhateetb"); Thread.sleep(3000);
	 * driver.findElement(By.className("btn")).click();
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 5) public void test_nextpage() throws InterruptedException
	 * 
	 * { Thread.sleep(3000);
	 * driver.findElement(By.xpath("//*[@id=\"next2\"]")).click();
	 * 
	 * String next =
	 * driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).
	 * getText(); assertprocess.assertEquals(next.contains("MacBook"), false);
	 * assertprocess.assertAll();
	 * 
	 * }
	 * 
	 * @Test(priority = 6) public void test_previous() throws InterruptedException {
	 * Thread.sleep(3000);
	 * driver.findElement(By.xpath("//*[@id=\"prev2\"]")).click();
	 * 
	 * String prvioues1 =
	 * driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).
	 * getText(); assertprocess.assertEquals(prvioues1.contains("Nokia"), false);
	 * assertprocess.assertAll(); }
	 * 
	 * @Test(priority = 7) public void check_the_iphone() {
	 * driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
	 * 
	 * String iphones =
	 * driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).
	 * getText(); assertprocess.assertEquals(iphones.contains("Samsung"), false);
	 * assertprocess.assertAll(); }
	 * 
	 * @Test(priority = 8) public void check_the_labtob() throws
	 * InterruptedException { Thread.sleep(2000);
	 * driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click(); String
	 * labtobs=driver.findElement(By.xpath(
	 * "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).getText();
	 * assertprocess.assertEquals(labtobs.contains("Sony"), false);
	 * assertprocess.assertAll();
	 * 
	 * }
	 */
	// @Test(priority = 4)
//	public void check_the_moniters() {
	// driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
	// String moni =
	// driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).getText();
	// assertprocess.assertEquals(moni.contains("Apple"), false);
	// assertprocess.assertAll();

	// }

}
