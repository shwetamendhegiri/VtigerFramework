package DDT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchingDataFromJson {

	public static void main(String[] args) throws Throwable {
		File file=new File("./src\\test\\resources\\JsonFile.json");
		
		ObjectMapper jsonData=new ObjectMapper();
		JsonNode data=jsonData.readTree(file);
		
		String URL=data.get("url").asText();
		String username=data.get("username").asText();
		String password=data.get("password").asText();
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.close();

	}

}
