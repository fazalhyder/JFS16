import java.util.Properties;
import java.io.FileInputStream;
public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
		String file = "D:/JFS/A4.properties";
        Properties props = new Properties();
        props.load(new FileInputStream(file));
        System.out.println(props);
	}
}