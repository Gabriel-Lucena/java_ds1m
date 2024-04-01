
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ViaCep {
	
	public String CEP;
	public String URL;

	public ViaCep (String CEP) {
		this.CEP = CEP;
		this.URL = "https://viacep.com.br/ws/" + CEP + "/json/";
	}
	
	public String getAddress() {
		
		String output = "";
		
		try {
			URL url = new URL(this.URL);
			System.out.println(url);
			HttpURLConnection conection = (HttpURLConnection) url.openConnection();
			
			conection.setRequestMethod("GET");
			conection.setRequestProperty("Accept", "application/json");
			
			if (conection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP Error code : " + conection.getResponseCode());
			}
			
			InputStreamReader in = new InputStreamReader(conection.getInputStream());
			BufferedReader br = new BufferedReader(in);
			
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			
			conection.disconnect();
		} catch (Exception e) {
			System.out.println("Exception in NetClientGet:- " + e);
		}
		
		return output;
	}
	
}
