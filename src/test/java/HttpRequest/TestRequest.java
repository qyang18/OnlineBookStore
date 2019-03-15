package HttpRequest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestRequest {
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("https://admin-qa.accuityavs.com/accuity/resources/policies/TermsAndConditions.pdf");
		SSLUtils.ignoreSsl();
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		int status = con.getResponseCode();
		System.out.print(status);
	}
}
