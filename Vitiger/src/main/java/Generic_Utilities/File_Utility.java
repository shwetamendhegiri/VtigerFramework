package Generic_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {

	public String getKeyAndValueData(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\FileCommomData.properties");
		Properties pro = new Properties();
		pro.load(fis);
		return pro.getProperty(key);
	}

}
